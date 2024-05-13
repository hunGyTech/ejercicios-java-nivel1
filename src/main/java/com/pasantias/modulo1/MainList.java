package com.pasantias.modulo1;

import java.util.ArrayList;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        // Agregar elementos a la lista
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Juan");

        // Acceder a un elemento por su índice
        String primerNombre = nombres.get(0); // "Juan"

        // Iterar sobre la lista
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
