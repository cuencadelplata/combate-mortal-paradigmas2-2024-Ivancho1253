package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class ProfeTest {
    @Test
    void tutoria_completa() {
       
        Materia materia1 = new Materia ("Materia1");
        Profesor tutor1 = new Profesor("Maria");
        Alumno alumno1 = new Alumno("Alumno 1", null);
        Alumno alumno2 = new Alumno("Alumno 2", null);

        //ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

        alumno1.añadirAlumno(alumno1);
        alumno2.añadirAlumno(alumno2);

        assertEquals(alumno1, alumno2);
        //Tutoria tutoria1 = new Tutoria (materia1,tutor1,alumnos);
        
        //assert tutoria1.completa() == true;
    }



}
