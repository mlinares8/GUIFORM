package curso.clases;

/**
 * Created by alumno on 3/07/2017.
 */
public class Asignatura {
    private String nombre;
    private int nota;
    private int cantEvaluaciones;

    public Asignatura(String nombre, int nota, int cantEvaluaciones) {
        this.nombre = nombre;
        this.nota = nota;
        this.cantEvaluaciones = cantEvaluaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getCantEvaluaciones() {
        return cantEvaluaciones;
    }

    public void setCantEvaluaciones(int cantEvaluaciones) {
        this.cantEvaluaciones = cantEvaluaciones;
    }
}
