package com.interfaces.entidades;

public class Uno implements IPrimera{
    @Override
    public void saludar() {
        System.out.println("Hola..............");

    }

    @Override
    public void despedir() {
        System.out.println("Chau..............");
    }

    public void mostrarError(){
        System.out.println(MENSAJE);
    }
}
