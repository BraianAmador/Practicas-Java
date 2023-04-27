package ciclos;

import java.util.Scanner;

//Realizar un programa que genere un número
//aleatorio, entre 1 y 10, y le pida al usuario
//que adivine el número, sin límite de intentos.


public class AdivinarNumero {

    public static void main(String[] args) {
        int numeroAleatorio = (int)(Math.random()*10+1);

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = teclado.nextInt();

        while (numero != numeroAleatorio){
            System.out.println("El numero no es " + numero +"\n");
            System.out.println("Vuelva a ingresar otro numero!");
            numero = teclado.nextInt();
        }
        System.out.println("Genial adivinaste el numero es el " + numeroAleatorio);
    }
}
