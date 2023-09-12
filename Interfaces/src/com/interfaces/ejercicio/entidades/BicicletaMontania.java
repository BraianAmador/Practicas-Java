package com.interfaces.ejercicio.entidades;

public class BicicletaMontania extends Bicicleta{

    int suspencion;

    public void cambiarSuspencion(int suspencion){

    }

    public BicicletaMontania(int velocidadActual, int platoActual, int pinionActual, int suspencion) {
        super(velocidadActual, platoActual, pinionActual);
        this.suspencion = suspencion;
    }

    @Override
    public void acelerar(){
        this.velocidadActual *= 3;
    }
}
