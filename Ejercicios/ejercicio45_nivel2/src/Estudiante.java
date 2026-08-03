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
        validarNota(nota1);
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) throws Exception {
        validarNota(nota2);
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) throws Exception {
        validarNota(nota3);
        this.nota3 = nota3;
    }

    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    private void validarNota(double nota) throws Exception {
        if (nota < 0 || nota > 100) {
            throw new Exception("La nota debe estar entre 0 y 100.");
        }
    }

}