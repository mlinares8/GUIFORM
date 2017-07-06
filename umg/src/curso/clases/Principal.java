package curso.clases;

import javax.swing.*;

/**
 * Created by alumno on 3/07/2017.
 */
public class Principal {

    public static void main(String[] args) {
        JFrame panels=new JFrame();
        panels.setContentPane( new app().contentPane);
        panels.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panels.pack();
        panels.setVisible(true);

        /*Profesor p=new Profesor();

        Estudiante e1=new Estudiante();
        e1.setNombre("Francisco");
        e1.setEdad(23);
        e1.addAsignatura(new Asignatura("Matematica",98,5));
        e1.addAsignatura(new Asignatura("Español",90,5));
        e1.addAsignatura(new Asignatura("SegInf",78,5));
        e1.addAsignatura(new Asignatura("IA",45,5));
        e1.addAsignatura(new Asignatura("Java",56,5));
        Estudiante e2=new Estudiante();
        e2.setNombre("Domingo");
        e2.setEdad(24);
        e2.addAsignatura(new Asignatura("Matematica",98,5));
        e2.addAsignatura(new Asignatura("Español",12,5));
        e2.addAsignatura(new Asignatura("SegInf",23,5));
        e2.addAsignatura(new Asignatura("IA",34,5));
        e2.addAsignatura(new Asignatura("Java",45,5));
        Estudiante e3=new Estudiante();
        e3.setNombre("Lole");
        e3.setEdad(26);
        e3.addAsignatura(new Asignatura("Matematica",76,5));
        e3.addAsignatura(new Asignatura("Español",67,5));
        e3.addAsignatura(new Asignatura("SegInf",67,5));
        e3.addAsignatura(new Asignatura("IA",67,5));
        e3.addAsignatura(new Asignatura("Java",67,5));
        Estudiante e4=new Estudiante();
        e4.setNombre("Pepe");
        e4.setEdad(41);
        e4.addAsignatura(new Asignatura("Matematica",34,5));
        e4.addAsignatura(new Asignatura("Español",34,5));
        e4.addAsignatura(new Asignatura("SegInf",78,5));
        e4.addAsignatura(new Asignatura("IA",34,5));
        e4.addAsignatura(new Asignatura("Java",23,5));
        Estudiante e5=new Estudiante();
        e5.setNombre("Ramiro");
        e5.setEdad(87);
        e5.addAsignatura(new Asignatura("Matematica",54,5));
        e5.addAsignatura(new Asignatura("Español",56,5));
        e5.addAsignatura(new Asignatura("SegInf",34,5));
        e5.addAsignatura(new Asignatura("IA",56,5));
        e5.addAsignatura(new Asignatura("Java",67,5));
        Estudiante e6=new Estudiante();
        e6.setNombre("Esteban");
        e6.setEdad(12);
        e6.addAsignatura(new Asignatura("Matematica",98,5));
        e6.addAsignatura(new Asignatura("Español",90,5));
        e6.addAsignatura(new Asignatura("SegInf",78,5));
        e6.addAsignatura(new Asignatura("IA",45,5));
        e6.addAsignatura(new Asignatura("Java",56,5));

        p.addEstudiante(e1);
        p.addEstudiante(e2);
        p.addEstudiante(e3);
        p.addEstudiante(e4);
        p.addEstudiante(e5);
        p.addEstudiante(e6);

        System.out.println(p.estudianteMasDestacado().getNombre());*/
    }
}
