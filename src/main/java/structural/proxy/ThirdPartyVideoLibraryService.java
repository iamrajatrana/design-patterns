package structural.proxy;

import java.util.HashMap;

import static java.lang.Thread.sleep;

public class ThirdPartyVideoLibraryService implements ThirdPartyVideoLibrary{

    @Override
    public HashMap<String, Video> popularVideos() {
        HashMap<String, Video> hmap = new HashMap<String, Video>();
        try {
            connectToServer("http://www.youtube.com");
            hmap.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
            hmap.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
            hmap.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
            hmap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
            hmap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return hmap;
    }

    private void connectToServer(String url) throws InterruptedException {
        System.out.println("Connecting to " + url + "... ");
        sleep(2000);
        System.out.print("Connected!" + "\n");
    }
}
