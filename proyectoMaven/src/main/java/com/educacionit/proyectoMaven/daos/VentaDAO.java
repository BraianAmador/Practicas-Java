package com.educacionit.proyectoMaven.daos;

import com.educacionit.proyectoMaven.conexiones.Conexion;
import com.educacionit.proyectoMaven.entidades.Cliente;
import com.educacionit.proyectoMaven.entidades.Venta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class VentaDAO {

    public void insertar(Venta venta) {
        try {
            Connection conexion = Conexion.conectar();
            String sql = "INSERT INTO VENTA(IDCLIENTE, IDCOMIDA, VENDEDOR) VALUES (?, ?, ?)";
            PreparedStatement stmt = conexion.prepareStatement(sql);
            stmt.setInt(1, venta.getIdCliente());
            stmt.setInt(2, venta.getIdComida());
            stmt.setString(3, venta.getVendedor());
            stmt.execute();
            System.out.println("El registro fue ingresado correctamente");
            stmt.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("No se pudo insertar los datos");
            e.printStackTrace();
        }
    }
        public static void borrar(int id) {
            try {
                Connection conexion = Conexion.conectar();
                String sql = "DELETE FROM VENTA WHERE ID = " + id;
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
