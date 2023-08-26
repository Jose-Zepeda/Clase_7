import pkgAlumnos.Alumno;
import pkgAlumnos.CursoAsignado;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<CursoAsignado> cat_cursos = new ArrayList<>();
        cat_cursos.add(new CursoAsignado(101, "Programacion", 500));
        cat_cursos.add(new CursoAsignado(105, "Derecho", 1));
        cat_cursos.add(new CursoAsignado(110, "Estadistica", 450));
        cat_cursos.add(new CursoAsignado(120, "Electronica", 400));


        Alumno al1 = new Alumno("201504100", "Andrea", "55555", "5 calle 8-36 zona 1");
        al1.agregarCursoAsignado(cat_cursos.get(0)); al1.agregarCursoAsignado(cat_cursos.get(2));
        System.out.println("Total del alumno: " + al1.getNombre() + " Q " + al1.getTotalCurso());

        Alumno al2 = new Alumno("201504101", "Luis", "44444", "5 calle 9-38 zona 1");
        al2.agregarCursoAsignado(cat_cursos.get(1)); al2.agregarCursoAsignado(cat_cursos.get(3));
        System.out.println("Total del alumno: " + al2.getNombre() + " Q " + al2.getTotalCurso());

        Alumno al3 = new Alumno("201504102", "Maria", "33333", "5 calle 2-26 zona 1");
        al3.agregarCursoAsignado(cat_cursos.get(0)); al3.agregarCursoAsignado(cat_cursos.get(1));
        System.out.println("Total del alumno: " + al3.getNombre() + " Q " + al3.getTotalCurso());

        Alumno al4 = new Alumno("201504103", "Jose", "22222", "5 calle 4-56 zona 1");
        al4.agregarCursoAsignado(cat_cursos.get(3)); al4.agregarCursoAsignado(cat_cursos.get(2));
        System.out.println("Total del alumno: " + al4.getNombre() + " Q " + al4.getTotalCurso());

        System.out.println("Total de todos los alumnos: Q " + (al1.getTotalCurso() + al2.getTotalCurso() + al3.getTotalCurso() + al4.getTotalCurso()));



}
}