
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Practice5 {
    public static void main(String[] args) {
    List<String> verilenListe = new ArrayList<>();
    verilenListe.add("Volvo");
    verilenListe.add("BMW");
    verilenListe.add("Ford");
    verilenListe.add("Mazda");
    verilenListe.add("Mercedes");
    verilenListe.add("Audi");
    verilenListe.add("Opel");
    verilenListe.add("Renault");
    verilenListe.add("Fiat");
    
    List<String> list_final = verilenListe.stream().filter(string-> !string.isEmpty()).map(String::toUpperCase).filter(string ->string.contains("A")).sorted(Comparator.reverseOrder()).distinct().toList();
        System.out.println(list_final);
        
 
    }

    
}
