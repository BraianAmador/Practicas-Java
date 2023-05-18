package integrador;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros que desea generar: ");
        int numero = teclado.nextInt();

        int[] numerosAleatorios = new int[numero];

        for (int i = 0; i < numero; i++) {
            numerosAleatorios[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println(Arrays.toString(numerosAleatorios));

        for (int i = 0; i < numero; i++){
                if (numerosAleatorios[i] % 3 == 0 && numerosAleatorios[i] % 5 == 0){
                    System.out.println("FizzBuzz");
                }else if(numerosAleatorios[i] % 3 == 0){
                    System.out.println("Fizz");
                }else if(numerosAleatorios[i] % 5 == 0) {
                    System.out.println("Buzz");
                }else{
                    System.out.println(numerosAleatorios[i]);
                }
        }
    }
}
