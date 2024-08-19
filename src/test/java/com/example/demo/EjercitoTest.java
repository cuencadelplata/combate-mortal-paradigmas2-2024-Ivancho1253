package com.example.demo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@SpringBootConfiguration

class EjercitoTest {

  @Test
  void soldado_muere_con_un_disparo_test() {

    Soldado soldado = new Soldado();

    soldado.setVida(1);
    soldado.recibirDisparo();
    assert soldado.estaVivo() == false;
  }

  @Test
  void soldado_vivo_pregunta_si_tiene_vida_test(){

    Soldado soldado = new Soldado();

    soldado.setVida(1);
    assert soldado.estaVivo() == true;
  }

  @Test
  void soldado_muerto_pregunta_si_tiene_vida_test(){

    Soldado soldado = new Soldado();

    soldado.setVida(1);
    soldado.recibirDisparo();
    assert soldado.estaVivo() == false;
  }
  @Test
  void soldado_con_escudo_no_muere_de_un_disparo_test(){

    Soldado soldado = new Soldado();
    soldado.setVida(1);

    Escudo escudo= new Escudo();

    escudo.setEscudo(50);
    assert escudo.getEscudo() == 50;
    soldado.escudo = escudo;
    
    soldado.recibirDisparo();
    assert soldado.estaVivo() == true;

  }

  @Test
  void tanque_no_muere_con_un_disparo_test() {

    Tanque tanque = new Tanque();

    tanque.setVida(2);
    tanque.recibirDisparo();

    assert tanque.estaVivo() == true;
  }

  @Test 
  void tanque_muere_con_dos_disparos_test(){
    Tanque tanque = new Tanque();

    tanque.setVida(2);
    tanque.recibirDisparo();
    tanque.recibirDisparo();

    assert tanque.estaVivo() == false;
  }

  @Test
  void tanque_con_escudo_no_muere_con_dos_disparos_test(){
    Tanque tanque = new Tanque();

    tanque.setVida(2);
    Escudo escudo = new Escudo();
    escudo.setEscudo(10);

    tanque.escudo = escudo;
    tanque.recibirDisparo();
    tanque.recibirDisparo();
    assert tanque.estaVivo() == true;
  }

  @Test 
  void buque_no_muere_con_un_disparo_test(){

    Buque buque = new Buque();

    buque.setVida(3);
    buque.recibirDisparo();

    assert buque.estaVivo() == true;
  }

  @Test
  void buque_muere_con_tres_disparos_test(){
    Buque buque = new Buque();

    buque.setVida(3);
    buque.recibirDisparo();
    buque.recibirDisparo();
    buque.recibirDisparo();

    assert buque.estaVivo() == false;
  }

  @Test
  void buque_con_escudo_no_muere_con_tres_disparos_test(){

    Buque buque = new Buque();
    buque.setVida(3);
    Escudo escudo = new Escudo();
    escudo.setEscudo(50);
    buque.escudo = escudo;

    buque.recibirDisparo();
    buque.recibirDisparo();
    buque.recibirDisparo();

    assert buque.estaVivo() == true;
  }
}