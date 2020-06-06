package decorator;

public class Ex4 {
    public static void main(String[] args) {
        ByteInputStream bis = new ByteInputStream();
        IntInputStream iis = new IntInputStream(bis);

        System.out.println(iis.read());
    }
}
