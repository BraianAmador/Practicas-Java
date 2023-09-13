package com.colecciones.principal;

import com.colecciones.entidades.Mascota;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainMascota {

    public static void main(String[] args) {

        Mascota m1 = new Mascota("Bobby", 4, "perro");
        Mascota m2 = new Mascota("Tommy", 2, "gato");
        Mascota m3 = new Mascota("Pedro", 8, "loro");
        Mascota m4 = new Mascota("Saviola", 5, "conejo");

        Set<Mascota> listaMascota = new HashSet<>();
        listaMascota.add(m1);
        listaMascota.add(m2);
        listaMascota.add(m3);
        listaMascota.add(m4);
        System.out.println(listaMascota.size());
//        for(Mascota m: listaMascota){
//            System.out.println(m);
//        }
//        Iterator<Mascota> m = listaMascota.iterator();
//        while(m.hasNext()){
//            Mascota mascota = m.next();
//            System.out.println(mascota);
//        }

        HashSet<Float> numeros = new HashSet<>();
        numeros.add(2.5f);
        numeros.add(8.8f);
        numeros.add(74.6f);
        System.out.println(numeros.size());
        listaMascota.forEach(mascota -> System.out.println(mascota.getNombre()));
    }
}
