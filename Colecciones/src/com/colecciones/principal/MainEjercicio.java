package com.colecciones.principal;

import java.util.ArrayList;

import static java.lang.System.*;


public class MainEjercicio {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        //Agregar valores al final de la lista
        numeros.add(5);
        numeros.add(6);

        //agregar valores al principio
        numeros.add(0,4);
        numeros.add(0,5);

        //Eliminar elementos de la lista
        numeros.remove(3);
        numeros.remove(1);

        out.println(numeros.get(1));
        out.println(numeros.get(2));

        //Settear valor de una posicion dada
        numeros.set(2, 8);

        //for(Integer i: numeros){
          //  System.out.println(i);
        //}

        //Sumar elementos de una lista
        //int sumatoria = 0;
        //for(Integer n : numeros) {
          //  sumatoria += n;
        //}
        //System.out.println("La sumatoria es: " + sumatoria);

        //Promedio de la lista
        //System.out.println("El promedio es: " + sumatoria/numeros.size());

        //Elementos repetidos

        int repetidos = 0;
        for(int i = 0; i < numeros.size(); i++) {
            for(int j = 0; j < numeros.size(); j++) {
                boolean seRepitio = false;
                if(i != j){
                    do{
                        if(numeros.get(i).equals(numeros.get(j))){
                            repetidos ++;
                            seRepitio = true;
                        }
                    } while(seRepitio);
                }
            }
        }
        out.println("Se repiten " + repetidos + "numeros");
    }
}
