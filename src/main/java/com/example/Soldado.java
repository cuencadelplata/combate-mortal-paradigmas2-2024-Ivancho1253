package com.example;
//import java.util.ArrayList;

public class Soldado 
            extends Ejercito{
    
    public String nombre;
    public String id;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Soldado(){
        setVida(1);
        setNombre("Soldado");
    }
    
    public Soldado(String nombre) {
        //super(vida, escudo);
        this.nombre = nombre;
    }

    public void setEscudo(Escudo escudo){
        this.escudo = escudo;
    }

    public Escudo getEscudo(){
        return escudo;
    }

    public void setIdentificacion(String string) {
        this.id = string;
    }

    public String getIdentificacion() {
        return id;
    }
    

    //Ingresar 10.000 soldados, en el ArrayList de soldados.

}
