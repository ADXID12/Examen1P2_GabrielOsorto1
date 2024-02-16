package PrincipalPackage;

import java.util.Date;

public class Empleados extends Usuarios {

    private String Carrera, PuestoLaboral;
    private int Añostrabajando;

    public Empleados() {
    }

    public Empleados(String Carrera, String PuestoLaboral, int Añostrabajando, String nombre, String apellido, String contraseña, String sexo, String departamento, int NumIdentidad, Date fechaNacimiento) {
        super(nombre, apellido, contraseña, sexo, departamento, NumIdentidad, fechaNacimiento);
        this.Carrera = Carrera;
        this.PuestoLaboral = PuestoLaboral;
        this.Añostrabajando = Añostrabajando;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getPuestoLaboral() {
        return PuestoLaboral;
    }

    public void setPuestoLaboral(String PuestoLaboral) {
        this.PuestoLaboral = PuestoLaboral;
    }

    public int getAñostrabajando() {
        return Añostrabajando;
    }

    public void setAñostrabajando(int Añostrabajando) {
        this.Añostrabajando = Añostrabajando;
    }

}
