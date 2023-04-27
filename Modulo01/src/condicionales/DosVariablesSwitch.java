package condicionales;

import java.util.Scanner;

//Hacer el punto anterior con switch. Se deberá
//ingresar el carácter “s” para sumar, “r” para restar,
//“m” para multiplicar y “d” para dividir.

public class DosVariablesSwitch {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = teclado.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();

        System.out.println("Opción s = Suma\nOpción r = Resta\nOpción m = multiplicar\nOpción d = División\nElija una letra de la operacion que desea realizar:");
        String opcion = teclado.next();

        switch (opcion){
            case "s":
                System.out.println("La suma de los numeros es: " + operadores.Operaciones.sumar(num1, num2));
                break;
            case "r":
                System.out.println("La resta de los numero es: " + operadores.Operaciones.restar(num1, num2));
                break;
            case "m":
                System.out.println("El producto de los numeros es: " + operadores.Operaciones.multiplicar(num1, num2));
                break;
            case "d":
                System.out.println("la division de los numero es: " + operadores.Operaciones.dividir(num1, num2));
                break;
            default:
                System.out.println("No es una opción valida :(");
        }
    }
}
