package decorator;

public class IntInputStream {

    private ByteInputStream bis;

    public IntInputStream(ByteInputStream bis) {
        this.bis = bis;
    }

    public int read(){
        bis.read();
        bis.read();
        bis.read();
        bis.read();

        System.out.println("reconstitui int-ul");
        return 0;

    }
}
