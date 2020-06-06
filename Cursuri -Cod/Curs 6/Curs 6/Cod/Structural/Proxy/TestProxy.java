package Curs6.Structural.Proxy;

public class TestProxy {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();

        //image will not be loaded from disk
        image.display();
    }
}
