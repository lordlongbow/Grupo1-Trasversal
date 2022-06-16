/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo1.trasversal.Modelos;

import java.time.LocalDate;

/**
 *
 * @author POSITIVO BGH
 */
public class Alumno {
    private int idAlumno;
     private String nombre;
     private String apellido;
     private LocalDate FechNac;
     private long dni;
     private boolean activo;
     
     //------------CONSTRUCTORES--------------
//constructor +ID
    public Alumno(int idAlumno, String nombre, String apellido, LocalDate FechNac, long dni, boolean activo) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.FechNac = FechNac;
        this.dni = dni;
        this.activo = activo;
    }
//constructor - ID
    public Alumno(String nombre, String apellido, LocalDate FechNac, long dni, boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.FechNac = FechNac;
        this.dni = dni;
        this.activo = activo;
    }
//constructor vacio
    public Alumno() {
    }
// Getter and Setters
    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
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

    public LocalDate getFechNac() {
        return FechNac;
    }

    public void setFechNac(LocalDate FechNac) {
        this.FechNac = FechNac;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
//TOSTRING
    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellido=" + apellido + ", FechNac=" + FechNac + ", dni=" + dni + ", activo=" + activo + '}';
    }
// HASHCODE
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.idAlumno;
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
        final Alumno other = (Alumno) obj;
        if (this.idAlumno != other.idAlumno) {
            return false;
        }
        return true;
    }

}
