
package ec.edu.intsuperior.modelo;

import java.util.Date;

public abstract class Persona {
    private String ci;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String ci, String nombre, String apellido, Date fechaNacimiento) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
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

    @Override
    public String toString() {
        return "Los datos son:\n"
                + "Cedula: "+getCi()+"\n"
                + "Nombre: "+getNombre()+"\n"
                + "Apellido: "+getApellido()+"\n"
                + "Fecha Nacimiento: "; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
