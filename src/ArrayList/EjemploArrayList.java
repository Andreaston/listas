package ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class EjemploArrayList {
    public static void main(String[] args) {

        ArrayList<String> almacen = new ArrayList<>();
        //HashSet<String> almacen = new HashSet<>();
        System.out.println("Número de elementos: " + almacen.size());
        almacen.add("rojo");
        almacen.add("amarillo");
        almacen.add("verde");
        System.out.println("Nº de elementos: " + almacen.size());
        almacen.add("negro");
        System.out.println("Nº de elementos: " + almacen.size());
        System.out.println("almacen: "+almacen);
        System.out.println("El elemento de la posición 0 es: " + almacen.get(0));
        System.out.println("El elemento de la posición 3 es: " + almacen.get(3));

        System.out.println("almacen = " + almacen);
        almacen.sort(Comparator.naturalOrder());
        System.out.println("almacen = " + almacen);
        almacen.sort(Comparator.reverseOrder());
        System.out.println("almacen = " + almacen);
    }
}
