package PrincipalPackage;

import java.util.Date;

public class Usuarios {

    private String nombre, apellido, contraseña, sexo, departamento;
    private int NumIdentidad;
    private Date fechaNacimiento;

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, String contraseña, String sexo, String departamento, int NumIdentidad, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.sexo = sexo;
        this.departamento = departamento;
        this.NumIdentidad = NumIdentidad;
        this.fechaNacimiento = fechaNacimiento;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getNumIdentidad() {
        return NumIdentidad;
    }

    public void setNumIdentidad(int NumIdentidad) {
        this.NumIdentidad = NumIdentidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", apellido=" + apellido + ", contrase\u00f1a=" + contraseña + ", sexo=" + sexo + ", departamento=" + departamento + ", NumIdentidad=" + NumIdentidad + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

}
