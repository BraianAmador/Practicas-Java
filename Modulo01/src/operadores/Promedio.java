package operadores;

import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = teclado.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int num3 = teclado.nextInt();

        System.out.println("Ingrese el cuarto número: ");
        int num4 = teclado.nextInt();

        double promedio = (num1 + num2 + num3 + num4) / 4;

        System.out.println("La division de los numeros es: " + String.valueOf(promedio));
    }
}
