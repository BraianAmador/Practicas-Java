package integrador;

import java.util.Scanner;

public class Login {
    private Scanner teclado;
    private String usuario;
    private String clave;


    void inicializador() {
        teclado = new Scanner(System.in);

        System.out.println("Ingrese su usuario: ");
        this.setUsuario(teclado.next());

        System.out.println("Ingrese su clave: ");
        this.setClave(teclado.next());
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        while (!(usuario.contains("educacionit.com"))){
            System.out.println("Ingrese un usuario valido: ");
            usuario = teclado.next();
        }
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        int c = 0;

        while (!(this.validarCaracter(clave, c))){
            System.out.println("Ingrese una clave que contenga (* . - _): ");
            clave = teclado.next();
            c++;
        }
        this.clave = clave;
    }

    private Boolean validarCaracter(String palabra, int posicion){ //Función que valida por cada caracter
        String caracteres = "*.-_";
        char caracter = caracteres.charAt(posicion);

        return palabra.contains(String.valueOf(caracter));
    }

    public static void main(String[] args){
        Login usuario1 = new Login();
        usuario1.inicializador();
        usuario1.getUsuario();
        usuario1.getClave();

    }
}
