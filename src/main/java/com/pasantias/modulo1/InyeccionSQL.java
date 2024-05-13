package com.pasantias.modulo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InyeccionSQL {

    public static void main(String[] args) {
        try {
            // Establecer conexión con la base de datos (suponiendo MySQL)
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo", "usuario", "contraseña");

            // Obtener el nombre de usuario proporcionado por el usuario (suponiendo entrada del usuario)
            String userInput = args[0];

            // Construir la consulta SQL concatenando la entrada del usuario (propensa a inyección SQL)
            String query = "SELECT * FROM usuarios WHERE nombre = '" + userInput + "'";

            // Crear una declaración y ejecutar la consulta
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Procesar los resultados
            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString("nombre") + ", Edad: " + rs.getInt("edad"));
            }

            // Cerrar recursos
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
