package com.example.demo;

public class Ejercito {

  public float vida;
  public Escudo escudo;

  public Ejercito(){
  }

  public Ejercito(float vida, Escudo escudo) {
    this.vida = vida;
    this.escudo = escudo;
  }

  public float getVida() {
    return vida;
  }

  public void setVida(float vida) {
    this.vida = vida;
  }

  public void recibirDisparo(){

    float daño = 1.0f;

    if (escudo != null){
      daño = escudo.reducirDaño(daño);
    }
      vida -= daño ;
  }

  public boolean estaVivo(){
    
    if (vida > 0.000){
      return true;
    }
    else{
      return false;
    }
  }
  
}
