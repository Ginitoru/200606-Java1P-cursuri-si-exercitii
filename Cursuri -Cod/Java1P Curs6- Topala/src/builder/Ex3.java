package builder;

public class Ex3 {
    public static void main(String[] args) {

        Casa c = new Casa.Builder()
                        .setAdresa("bd timisoara")
                        .setEtaje(5)
                        .build();

        System.out.println(c);

    }
}
