/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author POSITIVO BGH
 */
public class Alumno {
    private int legajo;
     private String nombre;
     private String apellido;
     private Materia materia;

   

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
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

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Alumno(int legajo, String nombre, String apellido, Materia materia) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
    }

    public Alumno() {
    }
    
     @Override
    public String toString() {
        return "Alumno{" + "legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido + ", materia=" + materia + '}';
    }
    
    
}
