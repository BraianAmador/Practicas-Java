package condicionales;
import java.util.Scanner;

//declarar 2 variables
//que permitan realizar operaciones básicas
//matemáticas y mostrar el resultado en consola. Esta
//vez, el usuario debe poder elegir qué operación
//realizar

public class DosVariables {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = teclado.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();

        System.out.println("Opción 1 = Suma\nOpción 2 = Resta\nOpción 3 = Producto\nOpción 4 = División\nElija un numero de la operacion que desea realizar:");
        int opcion = teclado.nextInt();

        if (opcion == 1){
            System.out.println("La suma de los numeros es: " + String.valueOf(operadores.Operaciones.sumar(num1, num2)));
        } else if (opcion == 2) {
            System.out.println("La resta de los numero es: " + String.valueOf(operadores.Operaciones.restar(num1, num2)));
        } else if (opcion == 3) {
            System.out.println("El producto de los numeros es: " + String.valueOf(operadores.Operaciones.multiplicar(num1, num2)));
        } else if (opcion == 4) {
            System.out.println("la division de los numero es: " + String.valueOf(operadores.Operaciones.dividir(num1, num2)));
        }else {
            System.out.println("No es una opción valida :(");
        }
    }
}
