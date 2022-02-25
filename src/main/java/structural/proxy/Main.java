package structural.proxy;

// Proxy is invaluable when you have to add some additional behaviors to a class which code you can’t change.
// When to use the Proxy pattern:
// 1. When we want a simplified version of a complex or heavy object. In this case, we may represent it with a skeleton
//    object which loads the original object on demand, also called as lazy initialization. This is known as the Virtual Proxy
// 2. When the original object is present in different address space, and we want to represent it locally. We can create
//    a proxy which does all the necessary boilerplate stuff like creating and maintaining the connection, encoding, decoding,
//    etc., while the client accesses it as it was present in their local address space. This is called the Remote Proxy
// 3. When we want to add a layer of security to the original underlying object to provide controlled access based on access
//    rights of the client. This is called Protection Proxy
public class Main {
    public static void main(String[] args) {
        VideoDownloader naiveDownloader = new VideoDownloader(new ThirdPartyVideoLibraryService());
        VideoDownloader smartDownloader = new VideoDownloader(new ThirdPartyVideoLibraryProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    private static long test(VideoDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app :
        downloader.downloadPopularVideos();
        downloader.downloadPopularVideos();
        downloader.downloadPopularVideos();

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
