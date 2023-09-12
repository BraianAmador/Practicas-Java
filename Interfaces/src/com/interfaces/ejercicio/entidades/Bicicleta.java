package com.interfaces.ejercicio.entidades;

public class Bicicleta extends Vehiculo{

    //Atributos
    int platoActual;
    int pinionActual;

    public Bicicleta() {
        this.velocidadActual= 0;
        this.platoActual = 1;
        this.pinionActual = 1;
    }

    public Bicicleta(int velocidadActual, int platoActual, int pinionActual) {
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.pinionActual = pinionActual;
    }

    //Getters y Setters
    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getPlatoActual() {
        return platoActual;
    }

    public void setPlatoActual(int platoActual) {
        this.platoActual = platoActual;
    }

    public int getPinionActual() {
        return pinionActual;
    }

    public void setPinionActual(int pinionActual) {
        this.pinionActual = pinionActual;
    }

    //Métodos
    @Override
    public void acelerar(){
        this.velocidadActual *= 2;

    }

    void frenar(){
        this.velocidadActual *= 0.5;
    }

    void cambiarPlato(int plato){
        this.platoActual = 1;
    }

    void cambiarPinion(int pinion){
        this.pinionActual = 1;
    }
}
