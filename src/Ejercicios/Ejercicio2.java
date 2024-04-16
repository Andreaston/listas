package Ejercicios;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<>();//Creación de la lista
        Random aleatorie = new Random();//creación del valor aleatorio
        int tama = aleatorie.nextInt(11)+10; //creación del tamaño

        //Recheamos con valores a lista
        for (int i = 0; i < tama; i++){
            valores.add(aleatorie.nextInt(101));
        }

        int suma = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;

        for (int num : valores){
            suma += num;
            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
        }

        double media = (double) suma / tama;

        System.out.print("Valores en la lista: " + valores );
        System.out.println("");
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
    }
}
