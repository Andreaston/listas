package Ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> listaStrings = new ArrayList<>();
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 10 ; i++){
            System.out.println("Dime una palabra");
            String coso = leer.next();
            listaStrings.add(coso);
        }

        Collections.sort(listaStrings);

        System.out.println("");
        System.out.println("Lista ordenada:");

        for (String palabras : listaStrings) {
            System.out.println(palabras);
        }
    }
}
