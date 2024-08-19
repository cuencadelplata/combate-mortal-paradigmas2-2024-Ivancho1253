package com.example.demo;

public class Ejercito {

  public float vida;
  public Escudo escudo;

  public Ejercito(){
  }

  public Ejercito(int vida, Escudo escudo) {
    this.vida = vida;
    this.escudo = escudo;
  }

  public float getVida() {
    return vida;
  }

  public void setVida(int vida) {
    this.vida = vida;
  }

  public void recibirDisparo(){

    if (escudo != null){
       this.vida = escudo.reducirDaño();
    }

    else{
      this.vida--;
    }
  }

  public int vidaRestante(){
    
    if(vida > 0){

      return 1;
    }

    else{
      return 0;
    }
  }
  
}