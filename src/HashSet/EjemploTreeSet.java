package HashSet;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {


        Set<String> ejemplo = new TreeSet<>();

        ejemplo.add("uno");
        ejemplo.add("dos");
        ejemplo.add("tres");
        ejemplo.add("cuatro");

        System.out.println("Ejemplo: " + ejemplo);

        Set<String> ejemploNoOrdenado = new HashSet<>() {};

        ejemploNoOrdenado.add("uno");
        ejemploNoOrdenado.add("dos");
        ejemploNoOrdenado.add("tres");
        ejemploNoOrdenado.add("cuatro");

        System.out.println("Ejemplo no Ordenado: "+ejemploNoOrdenado);

        Set<Integer> ejemploNum = new TreeSet<>(Comparator.reverseOrder());

        ejemploNum.add(110);
        ejemploNum.add(52);
        ejemploNum.add(5);
        ejemploNum.add(9000);
        ejemploNum.add(77);
        ejemploNum.add(20);
        ejemploNum.add(2);

        System.out.println("Ejemplo Numérico: "+ejemploNum);
    }
}
