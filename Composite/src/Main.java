public class Main {
    public static void main(String[] args) {
        FileComponent myFolder = new FileComposite("Minha Pasta/");
        FileComponent myVideo = new FileComposite("meu video.avi");
        FileComponent myOtherVideo = new FileComposite("serieS01E01.mkv");

        try {
            myVideo.add(myOtherVideo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            myFolder.add(myVideo);
            myFolder.add(myOtherVideo);
            myFolder.printFileName();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\nPesquisando arquivos:");
            myFolder.getFile(myVideo.getFileName())
                    .printFileName();
            System.out.println("\nRemover arquivos");
            myFolder.remove(myVideo.getFileName());
            myFolder.printFileName();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
