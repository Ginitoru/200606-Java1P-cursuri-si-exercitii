package Curs6.Structural.Decorator;

public class TestDecorator {
    public static void main(String[] args) {
        ByteInputStream byteInputStream = new ByteInputStream();
        IntInputStream intInputStream = new IntInputStream(byteInputStream);

        intInputStream.read();
    }
}
