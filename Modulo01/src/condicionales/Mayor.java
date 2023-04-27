package condicionales;
import java.util.Scanner;

//Declarar e iniciar 3 variables enteras y comparar cuál de las 3 es la mayor

public class Mayor {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = teclado.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int num3 = teclado.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor es: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("El mayor es: " + num3);
        }
    }
}
