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
            System.out.println("Ingrese un usuario valido con el dominio institucional: ");
            usuario = teclado.next();
        }
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {

        while (!this.validarCaracter(clave)){
            System.out.println("Ingrese una clave que contenga (* . - _): ");
            clave = teclado.next();
        }
        System.out.println("Se ingreso correctamente la clave");
    }

    private Boolean contieneCaracterEspecial(String palabra){
        String caracteres = "*.-_";
        Boolean estaAlgunCaracter;
        int c = 0;

        while (true){
            if (palabra.contains(String.valueOf(caracteres.charAt(c)))){
                estaAlgunCaracter = true;
                break;
            }
            else if (c > 3){
                estaAlgunCaracter = false;
                break;
            }
            else{
                c++;
            };
        }
        return estaAlgunCaracter;
    }


    private Boolean validarCaracter(String palabra){

        boolean validar = ( palabra.charAt(0) == (palabra.toUpperCase().charAt(0)) ) && contieneCaracterEspecial(palabra);
        return validar;
    }

    public static void main(String[] args){
        Login usuario1 = new Login();
        usuario1.inicializador();
        usuario1.getUsuario();
        usuario1.getClave();

    }

}
