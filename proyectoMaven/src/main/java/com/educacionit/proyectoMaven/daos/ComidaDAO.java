package com.educacionit.proyectoMaven.daos;
import com.educacionit.proyectoMaven.conexiones.Conexion;
import com.educacionit.proyectoMaven.entidades.Comida;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ComidaDAO {

    public void insertar(Comida c) {
        try {
            //paso 1: Obtener la conexion
            Connection conexion = Conexion.conectar();
            //paso 2: Armar la query
            String sql = "INSERT INTO COMIDA(NOMBRE, DESCRIPCION, PRECIO) VALUES"
                    + "('"+c.getNombre() + "','" + c.getDescripcion()
                    + "'," + c.getPrecio() + ")";
            //Paso 3
            // Crea el estado de conexion contra la base de datos
            Statement stmt = conexion.createStatement();
            stmt.execute(sql);
            System.out.println("El registro fue ingresado correctamente");
            //Por seguridad cerrar la conexion
            conexion.close();

        } catch (Exception e) {
            System.out.println("No se pudo insertar los datos");
            e.printStackTrace();
        }
    }

    public static void borrar(int id) {
        try {
            Connection conexion = Conexion.conectar();
            String sql = "DELETE FROM COMIDA WHERE ID = " + id;
            Statement stmt = conexion.createStatement();
            stmt.execute(sql);
            System.out.println("El registro fue eliminado");
            conexion.close();
        } catch (Exception e) {
            System.out.println("No se pudo borrar el registro");
            e.printStackTrace();
        }
    }

    public static void update(Comida comida) {
        try {
            Connection conexion = Conexion.conectar();
            String sql = "UPDATE COMIDA SET NOMBRE = '" + comida.getNombre() + "' , DESCRIPCION = '"
                    + comida.getDescripcion() + "', PRECIO = '" + comida.getPrecio() +
                    "'WHERE ID = " + comida.getId();
            Statement stmt = conexion.createStatement();
            stmt.execute(sql);
            System.out.println("Los datos fueron modificados correctamente");
            conexion.close();
        } catch (Exception e) {
            System.out.println("No se pudo modificar el registro");
            e.printStackTrace();
        }

    }

    public static void listar() throws SQLException {
        Connection conexion = Conexion.conectar();
        Statement stmt = conexion.createStatement();
        try {
            String sql = "SELECT * FROM COMIDA";
            ResultSet datos = stmt.executeQuery(sql);
            System.out.println("Los datos fueron mostrados correctamente");
            while(datos.next()) {
                System.out.println("Id: " + datos.getInt("id"));
                System.out.println("Nombre: " + datos.getString("nombre"));
                System.out.println("Descripción: " + datos.getString("descripcion"));
                System.out.println("Precio: " + datos.getDouble("precio"));
                System.out.println("----------------------------------------------------");
            }
        }catch (Exception e) {
            System.out.println("No se pueden mostrar los datos");
            e.printStackTrace();
        }finally {
            stmt.close();
            conexion.close();
        }

    }


}
