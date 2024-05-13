package com.pasantias.modulo1;

import java.util.ArrayList;
import java.util.List;

public class MainForeach {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");

        // Usando foreach para iterar sobre una lista
        System.out.println("Usando foreach:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
