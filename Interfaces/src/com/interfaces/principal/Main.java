package com.interfaces.principal;

import com.interfaces.ejercicio.entidades.Bicicleta;
import com.interfaces.ejercicio.entidades.BicicletaMontania;
import com.interfaces.ejercicio.entidades.BicicletaTandem;
import com.interfaces.entidades.Uno;

public class Main {
    public static void main(String[] args) {

        Bicicleta tuBicicleta = new Bicicleta(10, 1, 1);
        Bicicleta miBicicleta = new Bicicleta(5, 1, 2);

        BicicletaMontania bm = new BicicletaMontania(4,1,2, 4);
        BicicletaTandem bt = new BicicletaTandem(2, 2, 2, 3);

        bm.acelerar();
        System.out.println(bm.getVelocidadActual());
        bt.acelerar();
        System.out.println(bt.getVelocidadActual());
        Bicicleta datos [] = {tuBicicleta, miBicicleta, bm, bt};
        for(Bicicleta unaBicicleta : datos){
            unaBicicleta.acelerar();
            System.out.println(unaBicicleta.getVelocidadActual());
        }
    }


}
