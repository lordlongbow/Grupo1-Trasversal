
package grupo1.trasversal.Modelos;

import java.util.Objects;

/**
 *
 * @author Grupo 1
 */
public class Materia {

    private int idMateria;
    private String nombre;
    private int anio;
    private boolean activo;

    //COSNTRUCTOR CON ID
    public Materia(int idMateria, String nombre, int anio, boolean activo) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
        this.activo = activo;
    }
    //COSNTRUCTOR SIN ID

    public Materia(String nombre, int anio, boolean activo) {
        this.nombre = nombre;
        this.anio = anio;
        this.activo = activo;
    }
    //COSNTRUCTOR VACIO 

    public Materia() {
    }
//GETTER AND SETTER

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
//HASHCODE

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.idMateria;
        hash = 71 * hash + Objects.hashCode(this.nombre);
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
        final Materia other = (Materia) obj;
        if (this.idMateria != other.idMateria) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

//TOSTRING
    @Override
    public String toString() {
        return "Materia{" + "idMateria=" + idMateria + ", nombre=" + nombre + ", anio=" + anio + ", activo=" + activo + '}';
    }

}
