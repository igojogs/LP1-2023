public class DownloadThread extends Thread{
    private String url;

    public DownloadThread(String url) {
        this.url = url;
    }

    public void run() {
        System.out.println("Inicio do Download: " + url);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fim do Download: " + url);
    }
}


