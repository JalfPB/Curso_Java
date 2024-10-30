package Polimorfismo.Interfaces.Ejercicios.Ej24;

public class Libro implements Comparable<Libro>{

    int paginas;

    @Override
    public int compareTo(Libro l){
        return Integer.compare(l.paginas, this.paginas);
    }

    @Override
    public String toString() {
        return "Libro [paginas=" + paginas + "]";
    }

    public Libro(int paginas) {
        this.paginas = paginas;
    }

    

}
