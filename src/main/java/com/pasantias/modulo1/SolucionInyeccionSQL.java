package com.pasantias.modulo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SolucionInyeccionSQL {

    public static void main(String[] args) {
        try {
            // Establecer conexión con la base de datos (suponiendo MySQL)
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo", "usuario", "contraseña");

            // Obtener el nombre de usuario proporcionado por el usuario (suponiendo entrada del usuario)
            String userInput = args[0];

            // Construir la consulta SQL utilizando una consulta preparada
            String query = "SELECT * FROM usuarios WHERE nombre = ?";

            // Crear una declaración preparada y establecer el parámetro
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, userInput);

            // Ejecutar la consulta preparada
            ResultSet rs = pstmt.executeQuery();

            // Procesar los resultados
            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString("nombre") + ", Edad: " + rs.getInt("edad"));
            }

            // Cerrar recursos
            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
