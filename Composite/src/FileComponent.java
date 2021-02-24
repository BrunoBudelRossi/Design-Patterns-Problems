public abstract class FileComponent {

    String fileName;

    public void printFileName() {
        System.out.println(this.fileName);
    }

    public String getFileName() {
        return this.fileName;
    }

    public void add(FileComponent fileName) throws Exception {
        throw new Exception("Não pode inserir arquivos em: "
                + this.fileName + " - Não é uma pasta");
    }

    public void remove(String fileName) throws Exception {
        throw new Exception("Não pode remover arquivos em: "
                + this.fileName + " -Não é uma pasta");
    }

    public FileComponent getFile(String fileName) throws Exception {
        throw new Exception("Não pode pesquisar arquivos em: "
                + this.fileName + " - Não é uma pasta");
    }
}