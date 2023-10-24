package com.educacionit.proyectoMaven.demos;
import com.educacionit.proyectoMaven.daos.ClienteDAO;
import com.educacionit.proyectoMaven.daos.ComidaDAO;
import com.educacionit.proyectoMaven.daos.VentaDAO;
import com.educacionit.proyectoMaven.entidades.Cliente;
import com.educacionit.proyectoMaven.entidades.Comida;
import com.educacionit.proyectoMaven.entidades.Venta;


import java.util.Scanner;

public class AppPrincipal {
    public static void main(String[] args){

//        Comida comida1 = new Comida();
//        comida1.setNombre("Pizza");
//        comida1.setDescripcion("Pizza con muzzarella");
//        comida1.setPrecio(3500);
//        ComidaDAO cDAO = new ComidaDAO();
        //cDAO.insertar(comida1);

//        Comida comida3 = new Comida(3,"Empanada2", "Empanada de carne", 900);

        //ComidaDAO.borrar(2);

        //cDAO.update(comida3);
        //cDAO.listar();

//        Cliente cliente1 = new Cliente(36483240, "Braian Amador", "braian@gmail.com");
//        Cliente cliente2 = new Cliente(17072115, "Juan", "juan@gmail.com");
//        ClienteDAO clienteDAO = new ClienteDAO();
//        clienteDAO.insertar(cliente2);

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su opción");
        System.out.println("1_) Ingresar clientes" + "\n"
                         + "2_) Ingrese Comida" + "\n"
                         + "3_) Haga una venta" + "\n"
                         + "4_) Saliste del sistema");
        int valor = teclado.nextInt();
        switch(valor) {
            case 1:
                while(true) {
                    System.out.println("Ingrese el DNI del cliente: ");
                    int dni = teclado.nextInt();
                    System.out.println("Ingrese el nombre del cliente: ");
                    String nombre = teclado.next();
                    System.out.println("ingrese el email del cliente");
                    String email = teclado.next();
                    Cliente nuevoCliente = new Cliente(dni, nombre, email);
                    ClienteDAO clienteDAO = new ClienteDAO();
                    clienteDAO.insertar(nuevoCliente);
                    break;
                }
                break;
            case 2:
                while(true){
                    System.out.println("Ingrese nombre de la nueva comida: ");
                    String nombre = teclado.next();
                    System.out.println("Ingrese la descripción de la  nueva comida: ");
                    String descripcion = teclado.next();
                    System.out.println("ingrese el precio de la nueva comida: ");
                    //Revisar porque no pasa al siguiente sin poner ese teclado.nextLine();
                    teclado.nextLine();
                    double precio = teclado.nextDouble();
                    Comida nuevaComida = new Comida(nombre, descripcion, precio);
                    ComidaDAO comidaDAO = new ComidaDAO();
                    comidaDAO.insertar(nuevaComida);
                    break;
                }
                break;
            case 3:
                while(true){
                    System.out.println("Ingrese el numero del cliente: ");
                    int idCliente = teclado.nextInt();
                    System.out.println("Ingrese el numero de la comida: ");
                    int idComida = teclado.nextInt();
                    System.out.println("ingrese el nombre del vendedor: ");
                    String vendedor = teclado.next();
                    Venta nuevaVenta = new Venta(idCliente, idComida, vendedor);
                    teclado.nextLine();
                    VentaDAO ventaDAO = new VentaDAO();
                    ventaDAO.insertar(nuevaVenta);
                    break;
                }
                break;
            case 4:
                System.out.println("Saliste del sistema");
            break;
            default:
                System.out.println("Ingresaste un número equivocado volvé a intentarlo");
            break;
            }
    }
}
