package curso.clases;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alumno on 3/07/2017.
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private List<Asignatura> asignaturas;

    public Estudiante(String nombre, int edad, List<Asignatura> asignaturas) {
        this.nombre = nombre;
        this.edad = edad;
        this.asignaturas = asignaturas;
    }

    public Estudiante() {
        asignaturas=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public void addAsignatura(Asignatura a){
        asignaturas.add(a);

    }

    public float promedioNotas(){
        int sumNotas=0;
        for (Asignatura a:asignaturas
             ) {
            sumNotas+=a.getNota();
        }

        return sumNotas/asignaturas.size();

    }
}
