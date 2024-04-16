package Ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<>();
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.println("Dime un número para la lista");
            int numero = leer.nextInt();
            valores.add(numero);
        }

        Collections.sort(valores); //Esto me sirve para ordenar los valores

        System.out.println("Valores ordenados: ");
        for (int mostrar : valores){
            System.out.println(mostrar+" ");
        }

    }
}
