import java.util.regex.*;

public class Expresion{
    public static void main(String[] args) {

        String frase = "Mi casa en el cerro";
        String patron = "casa";

        Pattern pattern = Pattern.compile(patron);
        Matcher matc = pattern.matcher(frase);
        int num_veces=0;
        while(matc.find()){
            System.out.println("El patron: "+patron+" en :"+matc.start());
            System.out.println("Match: "+matc.group());
            num_veces++;
        }
        System.out.println(num_veces);
    }
}