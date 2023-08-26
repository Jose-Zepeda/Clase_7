package pkgAlumnos;

public class CursoAsignado {

    private int codigoCurso;
    private String nombreCurso;
    private double costoCurso;
    public CursoAsignado(int codigo, String nombreCurso, double costo) {
        this.codigoCurso = codigo;
        this.nombreCurso = nombreCurso;
        this.costoCurso = costo;
    }

    //GETTERS AND SETTERS

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public double getCostoCurso() {
        return costoCurso;
    }

    public void setCostoCurso(double costoCurso) {
        this.costoCurso = costoCurso;
    }
}
