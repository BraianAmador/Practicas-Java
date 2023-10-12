package com.educacionit.proyectoMaven.demos;
import com.educacionit.proyectoMaven.daos.ComidaDAO;
import com.educacionit.proyectoMaven.entidades.Comida;

public class AppPrincipal {
    public static void main(String[] args) {

        Comida comida1 = new Comida();
        comida1.setNombre("Pizza");
        comida1.setDescripcion("Pizza con muzzarella");
        comida1.setPrecio(3500);
        ComidaDAO cDAO = new ComidaDAO();
        //cDAO.insertar(comida1);

        Comida comida2 = new Comida("Empanada", "Empanada de queso", 900);
        cDAO.insertar(comida2);
    }
}
