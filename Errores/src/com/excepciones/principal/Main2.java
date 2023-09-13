package com.excepciones.principal;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        try {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese un numero:");
            int numero = teclado.nextInt();
            if (numero == 1) {
                throw new Exception("No acepto que apretes el numero 1");
            }
            else if(numero == 2){
                throw new Exception("No acepto que apretes el numero 2");
            }
            else{
                throw new Exception("No aceptamos nada de nada");
            }
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}



