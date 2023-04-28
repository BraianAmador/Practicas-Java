package integrador;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int suma = 0;

        System.out.println("\n\n--------------------*MULTIPLICADOR*--------------------");

        System.out.println("Ingrese el primer número: ");
        int num1 = teclado.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();

        for (int i = 0; i < num2; i++) {
            suma += num1;
        }
        System.out.println("El resultado es: " + suma);
    }
}
