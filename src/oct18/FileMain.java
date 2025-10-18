package oct18;

public class FileMain {
    public static void main(String[] args) {
        FileDemoRead fileDemoRead = new FileDemoRead(true, true);

        fileDemoRead.isFileReadable();

        fileDemoRead.isFileWriteable();
    }
}
