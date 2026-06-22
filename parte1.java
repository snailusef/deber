package javaapplication10;

import java.util.ArrayList;

public class Estudiantes {

    public static void main(String[] args) {

        ArrayList<String> estudiantes = new ArrayList<>();

        estudiantes.add("Pan");
        estudiantes.add("Leche");
        estudiantes.add("Huevos");
        estudiantes.add("Frutas");
        estudiantes.add("Papas");

        System.out.println("Lista de estudiantes");

        for (String item : estudiantes) {
            System.out.println(item);
        }
    }
}
