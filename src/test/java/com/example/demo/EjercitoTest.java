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
    assert soldado.getVida() == 0;
    assert soldado.vidaRestante() == 0;
  }

  @Test
  void soldado_vivo_pregunta_si_tiene_vida_test(){

    Soldado soldado = new Soldado();

    soldado.setVida(1);
    assert soldado.vidaRestante() == 1;
  }

  @Test
  void soldado_muerto_pregunta_si_tiene_vida_test(){

    Soldado soldado = new Soldado();

    soldado.setVida(1);
    soldado.recibirDisparo();
    assert soldado.vidaRestante() == 0;
  }

  @Test
  void tanque_no_muere_con_un_disparo_test() {

    Tanque tanque = new Tanque();

    tanque.setVida(2);
    tanque.recibirDisparo();
    assert tanque.getVida() == 1;

    assert tanque.vidaRestante() == 1;
  }

  @Test 
  void tanque_muere_con_dos_disparos_test(){
    Tanque tanque = new Tanque();

    tanque.setVida(2);
    tanque.recibirDisparo();
    tanque.recibirDisparo();
    assert tanque.getVida() == 0;

    assert tanque.vidaRestante() == 0;
  }

  @Test
  void soldado_con_escudo_no_muere_de_un_disparo_test(){

    Soldado soldado = new Soldado();
    soldado.setVida(1);

    Escudo escudo= new Escudo();

    escudo.setEscudo(50);
    soldado.escudo = escudo;
    soldado.recibirDisparo();

    assert soldado.getVida() == (1/2);
    assert soldado.vidaRestante() == 1;

  }

}
