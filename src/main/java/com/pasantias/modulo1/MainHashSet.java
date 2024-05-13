package com.pasantias.modulo1;

import java.util.HashSet;
import java.util.Set;

public class MainHashSet {
    public static void main(String[] args) {
        Set<String> colores = new HashSet<>();

        // Agregar elementos al conjunto
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");

        // No permite elementos duplicados
        colores.add("Rojo"); // No se añadirá

        // Iterar sobre el conjunto
        for (String color : colores) {
            System.out.println(color);
        }
    }
}

