package integrador;

import clases.Documento;

import java.util.Scanner;

public class Usuario {
    private Scanner teclado;
    private String nombre;
    private String apellido;
    private Documento documento;
    private Boolean existePersona = false;
    Usuario[] usuarios;
    private int siguiente = 0;


    void inicializador() {

        teclado = new Scanner(System.in);

        System.out.print("Indique la cantidad de personas: ");
        int cantidadUsuarios = teclado.nextInt();
        usuarios = new Usuario[cantidadUsuarios];

        for (int i = 0; i < usuarios.length; i++) {

            System.out.println("Ingrese su nombre: ");
            nombre = teclado.next();

            System.out.println("Ingrese su apellido: ");
            apellido = teclado.next();

            Documento miDocumento = new Documento();
            miDocumento.inicializador();

            while (existePersona) {

                //Uso la clase Documento del paquete Clases

                if (usuarios[siguiente].documento.getTipoDeDocumento().equals(miDocumento.getTipoDeDocumento())
                        && usuarios[siguiente].documento.getNumeroDeDocumento().equals(miDocumento.getNumeroDeDocumento())) {
                    System.out.println("El tipo y numero de documento ingresados ya existen, vuelva a ingresarlos...");
                    siguiente++;
                    miDocumento.inicializador();
                }
                else if (siguiente > usuarios.length){
                    usuarios[i].setNombre(nombre);
                    usuarios[i].setApellido(apellido);
                    usuarios[i].documento = miDocumento;
                    existePersona = true;
                }
                else{
                    usuarios[i].setNombre(nombre);
                    usuarios[i].setApellido(apellido);
                    usuarios[i].documento = miDocumento;
                    existePersona = true;
                }
            }
        }
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