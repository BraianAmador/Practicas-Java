package com.interfaces.ejercicio.entidades;

public class BicicletaTandem extends Bicicleta{

    int numAsientos;

    public BicicletaTandem(int velocidadActual, int platoActual, int pinionActual, int numAsientos) {
        super(velocidadActual, platoActual, pinionActual);
        this.numAsientos = numAsientos;
    }

    @Override
    public void acelerar() {
        this.velocidadActual *= 4;
    }
}
