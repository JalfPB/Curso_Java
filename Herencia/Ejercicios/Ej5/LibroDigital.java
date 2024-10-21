package Herencia.Ejercicios.Ej5;

public class LibroDigital extends Libro{

    private String formato;

    public LibroDigital(String titulo, String autor, String isbn,String formato) {
        super(titulo,autor,isbn);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    

}
