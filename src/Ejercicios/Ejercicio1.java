package Ejercicios;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> compas = new ArrayList<>();

        compas.add("Andrés");
        compas.add("Jess");
        compas.add("Mateo");
        compas.add("David");
        compas.add("Mauro");
        compas.add("Mikel");

        for (String clase : compas){
            System.out.println(clase);
        }

    }
}
