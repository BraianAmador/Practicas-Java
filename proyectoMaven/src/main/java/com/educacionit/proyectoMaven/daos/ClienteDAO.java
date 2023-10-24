package com.educacionit.proyectoMaven.daos;

import com.educacionit.proyectoMaven.conexiones.Conexion;
import com.educacionit.proyectoMaven.entidades.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class ClienteDAO {

    public void insertar(Cliente c) {
        try {
            //paso 1: Obtener la conexion
            Connection conexion = Conexion.conectar();
            //paso 2: Armar la query
            String sql = "INSERT INTO CLIENTE(DNI, NOMBRE, EMAIL) VALUES (?, ?, ?)";
            PreparedStatement stmt = conexion.prepareStatement(sql);
            stmt.setInt(1, c.getDni());
            stmt.setString(2, c.getNombre());
            stmt.setString(3, c.getEmail());
            stmt.execute();
            System.out.println("El registro fue ingresado correctamente");
            stmt.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("No se pudo insertar los datos");
            e.printStackTrace();
        }
    }

    public static void borrar(int id){
        try {
            Connection conexion = Conexion.conectar();
            String sql = "DELETE FROM CLIENTE WHERE ID = " + id;
            Statement stmt = conexion.createStatement();
            stmt.execute(sql);
            System.out.println("El registro fue eliminado");
            conexion.close();
        } catch (Exception e) {
            System.out.println("No se pudo borrar el registro");
            e.printStackTrace();
        }
    }
}