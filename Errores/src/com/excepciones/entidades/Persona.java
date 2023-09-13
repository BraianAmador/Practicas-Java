package com.excepciones.entidades;

import java.util.Date;

public abstract class Persona {

    private String nombre;
    private String apellido;
    private String tipo;
    private int numDoc;
    private Date fechaNac;
    private double sueldo;

    public Persona(String nombre, String apellido, String tipo, int numDoc, Date fechaNac, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
        this.numDoc = numDoc;
        this.fechaNac = fechaNac;
        this.sueldo = sueldo;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", tipo='" + tipo + '\'' +
                ", numDoc=" + numDoc +
                ", fechaNac=" + fechaNac +
                ", sueldo=" + sueldo +
                '}';
    }

    public void mostrarInfo(){
        System.out.println("Datos resumidos");
    }
}
