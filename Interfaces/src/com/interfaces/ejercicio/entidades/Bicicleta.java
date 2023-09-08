package com.interfaces.ejercicio.entidades;

public class Bicicleta {

    //Atributos
    int velocidadActual;
    int platoActual;
    int pinionActual;

    //Métodos


    public Bicicleta(int velocidadActual, int platoActual, int pinionActual) {
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.pinionActual = pinionActual;
    }

    void acelerar(){
        this.velocidadActual *= 2;

    }

    void frenar(){
        this.velocidadActual *= 0.5;
    }

    void cambiarPlato(int plato){
        this.platoActual = plato;
    }

    void cambiarPinion(int pinion){
        this.pinionActual = pinion;
    }
}
