package com.example;
import java.util.ArrayList;

public class Alumno
            extends Persona {
    
    public ArrayList <Alumno> alumnos = new ArrayList <Alumno>();

    public Alumno(){

    }

    public Alumno(String nombre, ArrayList <Alumno> alumnos){
        super(nombre);
        this.alumnos = alumnos= new ArrayList<>();
    }

    public ArrayList<Alumno> getAlumnos(){
        return alumnos;
    }

    public void añadirAlumno(Alumno alum){
        getAlumnos().add(alum);
    }
}