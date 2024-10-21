package Herencia.Ejercicios.Ej5;

public class LibroFisico extends Libro{

    private float peso;

    public LibroFisico(String titulo, String autor, String isbn,float peso) {
        super(titulo,autor,isbn);
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    

}
