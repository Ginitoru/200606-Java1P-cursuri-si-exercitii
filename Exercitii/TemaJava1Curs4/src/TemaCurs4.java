import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class TemaCurs4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Path p = Paths.get("./src/input_key.txt");
        System.out.println("Set language and country:");

        try(
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(is);
            BufferedReader br = Files.newBufferedReader(p)
        ){

            String [] line = bufferedReader.readLine().split("\\s+");
            String [] fi = br.readLine().split("\\s+");

            Locale loc = new Locale(line[0].toLowerCase(),line[1].toUpperCase());
            ResourceBundle bundle = ResourceBundle.getBundle("key",loc);

            PrintStream ps = new PrintStream("trad_" +line[0]+"_"+line[1]+".txt");

                for(int i =0; i< fi.length; i++){
                    String key = bundle.getString(fi[i]);
                    list.add(key);
                }

            ps.println(list.stream().collect(Collectors.joining(" ")));

                switch(line[0].toLowerCase()){
                    case "fr": case "ro": case "en":
                        break;
                    default:
                        System.err.println("Error: language not Found");
                }


        }catch(IOException | MissingResourceException e){
            e.printStackTrace();
        }
    }
}
