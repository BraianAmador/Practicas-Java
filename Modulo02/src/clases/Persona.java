package clases;

import java.util.Scanner;

public class Persona {
    private Scanner teclado;
    private String nombre;
    private String apellido;
    Documento documento;
    private int edad = (int)(Math.random()*90+1);

    void inicializador(){

        teclado = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = teclado.next();

        System.out.println("Ingrese su apellido: ");
        apellido = teclado.next();

        //Uso ramdon segun ejercicio
        //System.out.println("Ingrese su edad: ");
        //edad = teclado.nextInt();
    }
    public String esMayorDeEdad(){
        return (this.edad >= 18 ? "mayor de edad" : "menor de edad");
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
