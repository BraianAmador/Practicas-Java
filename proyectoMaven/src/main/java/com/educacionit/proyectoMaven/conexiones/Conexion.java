package com.educacionit.proyectoMaven.conexiones;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion{
    static Connection conexion = null;
    public static Connection conectar() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mirest", "root", "");
            System.out.println("Se conecto correctamente a la base");
        } catch (Exception e) {
            System.out.println("No hay acceso a la base de datos");
            e.printStackTrace();
        }
        return conexion;
    }
}
