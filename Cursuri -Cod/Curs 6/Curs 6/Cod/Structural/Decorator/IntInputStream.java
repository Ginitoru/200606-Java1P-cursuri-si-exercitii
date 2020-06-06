package Curs6.Structural.Decorator;

public class IntInputStream {
    ByteInputStream byteInputStream;

    public IntInputStream(ByteInputStream byteInputStream) {
        this.byteInputStream = byteInputStream;
    }

    public int read() {
        byteInputStream.read();
        byteInputStream.read();
        byteInputStream.read();
        byteInputStream.read();
        System.out.println("Reconstituire int...");
        return 0;
    }

}
