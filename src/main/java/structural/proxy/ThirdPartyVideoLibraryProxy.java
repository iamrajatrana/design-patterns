package structural.proxy;

import java.util.HashMap;

public class ThirdPartyVideoLibraryProxy implements ThirdPartyVideoLibrary{

    HashMap<String, Video> hmap = new HashMap<String, Video>();
    ThirdPartyVideoLibraryService thirdPartyVideoLibraryService;

    public ThirdPartyVideoLibraryProxy() {
        this.thirdPartyVideoLibraryService = new ThirdPartyVideoLibraryService();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if(hmap.isEmpty()) {
            return hmap = thirdPartyVideoLibraryService.popularVideos();
        }
        return hmap;
    }
}
