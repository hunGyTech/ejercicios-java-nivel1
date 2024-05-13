package com.pasantias.modulo1;

import java.util.LinkedList;
import java.util.Queue;

public class MainLinkedList {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        // Agregar elementos a la cola
        cola.offer("Juan");
        cola.offer("María");
        cola.offer("Pedro");

        // Obtener y eliminar el primer elemento de la cola
        String primerNombre = cola.poll(); // "Juan"

        // Iterar sobre la cola
        for (String nombre : cola) {
            System.out.println(nombre);
        }
    }
}
