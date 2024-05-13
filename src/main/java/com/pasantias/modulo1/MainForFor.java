package com.pasantias.modulo1;

public class MainForFor {
    public static void main(String[] args) {
        // Matriz bidimensional
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Usando for anidado para iterar sobre una matriz
        System.out.println("Usando for anidado:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }
}

