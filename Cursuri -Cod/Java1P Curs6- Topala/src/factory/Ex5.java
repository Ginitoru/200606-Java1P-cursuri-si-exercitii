package factory;

public class Ex5 {
    public static void main(String[] args) {
        Path p1 = Paths.get(Paths.OS.LINUX);
        Path p2 = Paths.get(Paths.OS.WINDOWS);

        System.out.println(p1.getRoot());
        System.out.println(p2.getRoot());
    }
}
