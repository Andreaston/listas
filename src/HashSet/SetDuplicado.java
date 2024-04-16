package HashSet;

import java.util.HashSet;
import java.util.Set;

public class SetDuplicado {
    public static void main(String[] args) {

        String [] peces = {"Salmon","Sardina","Salmon","Tiburon","Atun","Pez Ballena","Congrio","Anguila","Sardina"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();

        for (String pez : peces){

            if (!unicos.add(pez)){
                duplicados.add(pez);
            }
        }

        System.out.println(unicos);
        System.out.println(duplicados);



    }
}
