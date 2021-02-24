import java.util.ArrayList;

public class FileComposite extends FileComponent {
    ArrayList<FileComponent> files = new ArrayList<FileComponent>();

    public FileComposite(String fileName) {
        super();
    }

    @Override
    public void printFileName() {
        System.out.println(this.fileName);
        for (FileComponent fileTmp : files) {
            fileTmp.printFileName();
        }
    }

    @Override
    public void add(FileComponent fileName) {
        this.files.add(fileName);
    }

    @Override
    public void remove(String fileName) throws Exception {
        for (FileComponent fileTmp : files) {
            if (fileTmp.getFileName() == fileName) {
                this.files.remove(fileTmp);
                return;
            }
        }
        throw new Exception("Não existe este arquivo");
    }

    @Override
    public FileComponent getFile(String fileName) throws Exception {
        for (FileComponent fileTmp : files) {
            if (fileTmp.getFileName() == fileName) {
                return fileTmp;
            }
        }
        throw new Exception("Não existe este arquivo");
    }
}
