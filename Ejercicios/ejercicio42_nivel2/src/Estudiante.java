public class Estudiante {

    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.trim().isEmpty()) {
            throw new Exception("El nombre no puede estar vacío.");
        }

        this.nombre = nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) throws Exception {
        if (nota1 < 0 || nota1 > 100) {
            throw new Exception("La nota 1 debe estar entre 0 y 100.");
        }

        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) throws Exception {
        if (nota2 < 0 || nota2 > 100) {
            throw new Exception("La nota 2 debe estar entre 0 y 100.");
        }

        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) throws Exception {
        if (nota3 < 0 || nota3 > 100) {
            throw new Exception("La nota 3 debe estar entre 0 y 100.");
        }

        this.nota3 = nota3;
    }

}