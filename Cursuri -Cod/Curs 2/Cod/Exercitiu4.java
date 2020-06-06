import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercitiu4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String comanda = sc.next();
            String adresa;
            File file;

            if (checkForExit(comanda)) break;

            handleCommands(sc, comanda);
        }
    }

    private static boolean checkForExit(String comanda) {
        if (comanda.equalsIgnoreCase("EXIT")) {
            System.out.println("S-a terminat programul!");
            return true;
        }
        return false;
    }

    private static void handleCommands(Scanner sc, String comanda) {
        switch (comanda) {
            case "CF":
                cf(sc);
                break;
            case "CD":
                cd(sc);
                break;
            case "LIST":
                list(sc);
                break;
            case "DELETE":
                delete(sc);
                break;
            default:
                System.out.println("Comanda incorecta!");
        }
    }

    private static void cd(Scanner sc) {
        File file;
        file = getFile(sc);
        file.mkdirs();
    }

    private static void delete(Scanner sc) {
        File file;
        file = getFile(sc);
        file.delete();
    }


    private static void list(Scanner sc) {
        File file;
        System.out.println("Folderul contine:");
        file = getFile(sc);
        String[] fisiere = file.list();
        for (String fisier : fisiere) {
            System.out.println(fisier);
        }
    }

    private static void cf(Scanner sc) {
        File file;
        file = getFile(sc);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static File getFile(Scanner sc) {
        String adresa;
        File file;
        adresa = sc.next();
        file = new File(adresa);
        return file;
    }

}
