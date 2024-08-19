package com.example.demo;

public class Escudo {

    private int porcentajeEscudo;

    public int getEscudo(){
        return porcentajeEscudo;
    }

    public void setEscudo(int porcentajeEscudo){
        this.porcentajeEscudo = porcentajeEscudo;
    }

    public int reducirDaño(){
        return (1 * (100 - porcentajeEscudo) / 100);
    }
}
