package integrador;

import clases.Documento;

import java.util.Scanner;

public class Usuario {
    private Scanner teclado;
    private String nombre;
    private String apellido;
    Documento documento;

    void inicializador(){

        teclado = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = teclado.next();

        System.out.println("Ingrese su apellido: ");
        apellido = teclado.next();

        //Uso la clase Documento del paquete Clases
        Documento miDocumento = new Documento();
        miDocumento.inicializador();
        this.documento = miDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}