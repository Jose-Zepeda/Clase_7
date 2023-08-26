package pkgAlumnos;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Alumno {
    private String carnet;
    private String nombre;
    private String telefono;
    private String direccion;
    private ArrayList<CursoAsignado> cursoAsignado;

    //COSNTRUCTOR

    public Alumno(String carnet, String nombre, String telefono, String direccion) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cursoAsignado = new ArrayList<CursoAsignado>();
    }

    public void agregarCursoAsignado(CursoAsignado curso){
        cursoAsignado.add(curso);
    }

    @Override
    public String toString(){
        return "Carnet: " + this.carnet + "\nNombre: " + this.nombre + "\nDireccion: " + this.direccion;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Cursos Asignados:");
        System.out.println("--------------------");
        for (CursoAsignado curso : cursoAsignado) {
            System.out.println("Curso:" +curso.getNombreCurso());
            System.out.println("Costo:" +curso.getCostoCurso());
            System.out.println("--------------------");

        }
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<CursoAsignado> getCursoAsignado() {
        return cursoAsignado;
    }

    public void setCursoAsignado(ArrayList<CursoAsignado> cursoAsignado) {
        this.cursoAsignado = cursoAsignado;
    }

    public double getTotalCurso() {
        double total = 0;
        for (CursoAsignado curso : cursoAsignado) {
            total += curso.getCostoCurso();
        }
        return total;
    }
}


