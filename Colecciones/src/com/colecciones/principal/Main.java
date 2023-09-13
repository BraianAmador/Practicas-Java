package com.colecciones.principal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

/*        int numeros[] = new int[5];
        numeros[0] = 3;
        numeros[1] = 89;
        numeros[2] = 12;
        numeros[3] = 25;
        numeros[4] = 40;
        System.out.println(numeros[4]);

        int numeros[] = {68,56,41,64,12};
        System.out.println(numeros[2]);
*/
        HashSet <String> nombres = new HashSet<>();
        nombres.add("Braian");
        nombres.add("Belen");
        nombres.add("Camila");
        nombres.add("Karen");
        System.out.println(nombres.size());
        System.out.println(nombres.contains("Braian"));
//        nombres.forEach((nombre) -> System.out.println(nombre));
//
//        ArrayList<String> lista = new ArrayList<>();
//        lista.add("elemento 1");
//        lista.add("elemento 2");
//        lista.add("elemento 3");
//
//        Iterator<String> iterador = lista.iterator();
//        //Muestra elementos mientras haya alguno
//        while(iterador.hasNext()) {
//            String elemento = iterador.next();
//            System.out.println(elemento);
//        }

        Iterator<String> nombre = nombres.iterator();
        while(nombre.hasNext()) {
            String unNombre = nombre.next();
            if(unNombre.equals("Braian")){
                nombre.remove(); //borra el dato
            }else{
                System.out.println(unNombre);
            }
        }
    }
}
