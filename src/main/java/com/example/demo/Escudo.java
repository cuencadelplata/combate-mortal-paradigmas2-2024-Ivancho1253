package com.example.demo;

public class Escudo {

    private int porcentajeEscudo;

    public int getEscudo(){
        return porcentajeEscudo;
    }

    public void setEscudo(int porcentajeEscudo){
        this.porcentajeEscudo = porcentajeEscudo;
    }

    public float reducirDaño(float dañoOriginal){
        return (dañoOriginal * (100 - porcentajeEscudo) / 100);
    }
}