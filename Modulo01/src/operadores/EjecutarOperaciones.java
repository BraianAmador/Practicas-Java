package operadores;
import java.util.Scanner;

public class EjecutarOperaciones {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = teclado.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();

        System.out.println("La suma de los numeros es: " + String.valueOf(Operaciones.sumar(num1, num2)));
        System.out.println("La resta de los numeros es: " + String.valueOf(Operaciones.restar(num1, num2)));
        System.out.println("El producto de los numeros es: " + String.valueOf(Operaciones.multiplicar(num1, num2)));
        System.out.println("La division de los numeros es: " + String.valueOf(Operaciones.dividir(num1, num2)));
    }
}