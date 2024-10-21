package Herencia.Ejercicios.Ej9;

public class Main {
    public static void main(String[] args) {
        Tiburon t = new Tiburon("f",2);
        AnimalMarino am =new AnimalMarino(null, 0);
        Delfin d = new Delfin(null, 0);
        Ballena b = new Ballena(null, 0);

        t.nadar();
        am.nadar();
        d.nadar();
        b.nadar();
    }
}
