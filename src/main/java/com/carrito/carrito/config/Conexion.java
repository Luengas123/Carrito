package com.carrito.carrito.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    private static String database = "bd_carrito";
    private static String username = "root";
    private static String password = "12345678";
    private static String url = "jdbc:mysql://localhost:3306/" + database;

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Conexion establecida");
        } catch (Exception e) {
            System.out.println("Error al establecer la conexión: " + e.getMessage());
            e.printStackTrace();
        }

        return con;
    }
}
