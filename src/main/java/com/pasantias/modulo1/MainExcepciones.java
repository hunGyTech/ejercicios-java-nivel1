package com.pasantias.modulo1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExcepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        boolean ingresoValido = false;

        // Solicitar primer número
        while (!ingresoValido) {
            System.out.println("Ingrese el primer número: ");
            try {
                numero1 = scanner.nextInt();
                ingresoValido = true; // Si no hay excepción, se considera un ingreso válido
            }
            catch(InputMismatchException ex){
                System.out.println("Debe ingresar un valor tipo int");
            }
            catch (Exception e) {
                System.out.println("Error: Ingrese un valor válido.");
            }
            finally {
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }

        // Solicitar segundo número
        ingresoValido = false;
        while (!ingresoValido) {
            System.out.println("Ingrese el segundo número: ");
            try {
                numero2 = scanner.nextInt();
                if (numero2 == 0) {
                    System.out.println("Error: El segundo número no puede ser cero.");
                } else {
                    ingresoValido = true; // Si no hay excepción, se considera un ingreso válido
                }
            } catch (Exception e) {
                System.out.println("Error: Ingrese un valor válido.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }

        try {
            // Realizar operación de división
            int resultado = dividirNumeros(numero1, numero2);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            // Manejo de la excepción de división por cero
            System.out.println("Error: No se puede dividir por cero.");
        } catch (Exception e) {
            // Manejo de otras excepciones
            System.out.println("Se ha producido un error: " + e.getMessage());
            e.printStackTrace(); // Imprimir la traza de la excepción
        } finally {
            // Solicitar un nuevo cálculo
            System.out.println("Ingrese nuevos números para realizar otra operación:");
            main(args); // Llamar recursivamente al método main para volver a ejecutar el programa
        }
    }

    // Método para realizar la operación de división
    public static int dividirNumeros(int numero1, int numero2) {
        return numero1 / numero2;
    }
}
