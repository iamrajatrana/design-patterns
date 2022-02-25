package structural.proxy;

import java.util.HashMap;

public class VideoDownloader {

    private ThirdPartyVideoLibrary api;

    public VideoDownloader(ThirdPartyVideoLibrary api) {
        this.api = api;
    }

    public void downloadPopularVideos() {
        HashMap<String, Video> list = api.popularVideos();
        System.out.println("\n-------------------------------");
        System.out.println("Most popular videos");
        for (Video video : list.values()) {
            System.out.println("ID: " + video.id + " / Title: " + video.title);
        }
        System.out.println("-------------------------------\n");    }
}
