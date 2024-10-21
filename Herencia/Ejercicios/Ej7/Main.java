package Herencia.Ejercicios.Ej7;

public class Main {

    public static void main(String[] args) {
        Instrumento in = new Instrumento();
        Guitarra gui = new Guitarra();
        Piano pi = new Piano();
        Violin vi = new Violin();

        in.tocar();
        gui.tocar();
        pi.tocar();
        vi.tocar();
    }

}
