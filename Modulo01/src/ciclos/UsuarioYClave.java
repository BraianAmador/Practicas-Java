package ciclos;

import java.util.Scanner;

//Realizar un programa que indique usuario y
//contraseña con un máximo de 3 intentos. Si
//supera la cantidad de intentos con datos
//inválidos: mostrar un mensaje indicando que
//se ha bloqueado el usuario.

public class UsuarioYClave {

    public static void main(String[] args) {
        String usr = "bamador";
        String pass = "1234";
        int contador = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su usuario: ");
        String usuario = teclado.next();

        System.out.println("Ingrese su clave: ");
        String password = teclado.next();

        while (contador < 2){
            if (!(usr.equals(usuario) && pass.equals(password))){
                System.out.println("\nIngreso mal los datos!\nIngrese su usuario: ");
                usuario = teclado.next();

                System.out.println("Ingrese su clave: ");
                password = teclado.next();

                contador++;
            }else{
                System.out.println("Ingreso correctamente bienvenido!");
                contador = 3;
            }
        }
        System.out.println("Realizo sus 3 intentos, cuenta bloqueada!");
    }
}
