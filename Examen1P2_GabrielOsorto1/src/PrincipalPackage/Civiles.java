package PrincipalPackage;

import java.util.ArrayList;
import java.util.Date;

public class Civiles extends Usuarios {

    private final ArrayList<String> tramites = new ArrayList<>();

    public Civiles() {
    }

    public Civiles(String nombre, String apellido, String contraseña, String sexo, String departamento, int NumIdentidad, Date fechaNacimiento) {
        super(nombre, apellido, contraseña, sexo, departamento, NumIdentidad, fechaNacimiento);
    }

}