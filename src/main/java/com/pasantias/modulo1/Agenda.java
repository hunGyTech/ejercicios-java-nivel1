package com.pasantias.modulo1;

import java.util.LinkedList;
import java.util.Scanner;

class Contacto {
    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return nombre + ": " + telefono;
    }
}

public class Agenda {
    private LinkedList<Contacto> contactos;

    public Agenda() {
        this.contactos = new LinkedList<>();
    }

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public void mostrarContactos() {
        System.out.println("Contactos:");
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        // Agregar algunos contactos
        agenda.agregarContacto(new Contacto("Juan", "123456789"));
        agenda.agregarContacto(new Contacto("María", "987654321"));
        agenda.agregarContacto(new Contacto("Pedro", "456789123"));

        // Mostrar los contactos
        agenda.mostrarContactos();

        // Agregar un nuevo contacto ingresado por el usuario
        System.out.println("\nIngrese un nuevo contacto:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        agenda.agregarContacto(new Contacto(nombre, telefono));

        // Mostrar los contactos actualizados
        System.out.println("\nContactos actualizados:");
        agenda.mostrarContactos();
    }
}
