/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo1.trasversal.Modelos;

/**
 *
 * @author POSITIVO BGH
 */
public class Cursada {

    private int id;
    private Materia materia;
    private Alumno alumno;
    private double nota;

    public Cursada(int id, Materia materia, Alumno alumno, double nota) {
        this.id = id;
        this.materia = materia;
        this.alumno = alumno;
        this.nota = nota;
    }

    public Cursada(Materia materia, Alumno alumno, double nota) {
        this.materia = materia;
        this.alumno = alumno;
        this.nota = nota;
    }

    public Cursada() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
//TOSTRING

    @Override
    public String toString() {
        return "Cursada{" + "id=" + id + ", materia=" + materia + ", alumno=" + alumno + ", nota=" + nota + '}';
    }
//HASHCODE

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.id;
        return hash;
    }
//EQUALS

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cursada other = (Cursada) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
