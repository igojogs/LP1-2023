public class main {
    public static void main(String[] args) {
        String[] urls = {
            "http:// example.com/file1.txt",
            "http:// example.com/file2.txt",
            "http:// example.com/file3.txt"
        };

//        for (String url : urls) {
//            Download download = new Download(url);
//            download.run();
//        }

        for (String url : urls) {
            DownloadThread downloadThread = new DownloadThread(url);
            downloadThread.start();
        }
    }
}
