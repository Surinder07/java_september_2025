package oct18;

public class FileDemoRead {
    boolean isReadable;
    boolean isWritable;

    public FileDemoRead(boolean isReadable, boolean isWritable) {
        this.isReadable = isReadable;
        this.isWritable = isWritable;
    }

    public boolean isReadable() {
        return isReadable;
    }

    public void setReadable(boolean readable) {
        isReadable = readable;
    }

    public boolean isWritable() {
        return isWritable;
    }

    public void setWritable(boolean writable) {
        isWritable = writable;
    }

    public void isFileReadable(){
        if(isReadable){
            System.out.println("File is readonly");
        }
    }

    public void isFileWriteable(){
        if(isWritable){
            System.out.println("File is writable");
        }
    }
}

