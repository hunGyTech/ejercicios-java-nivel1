package com.pasantias.modulo1;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {
    public static void main(String[] args) {
        Map<String, Integer> edades = new HashMap<>();

        // Agregar elementos al mapa (clave, valor)
        edades.put("Juan", 30);
        edades.put("María", 25);
        edades.put("Pedro", 35);

        // Acceder a un valor por su clave
        int edadDeJuan = edades.get("Juan"); // 30

        // Iterar sobre las claves del mapa
        for (String nombre : edades.keySet()) {
            System.out.println(nombre + ": " + edades.get(nombre));
        }
    }
}
