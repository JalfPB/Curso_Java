package Herencia.Ejercicios.Ej8;

public class Main {

    public static void main(String[] args) {
        Transporte t = new Transporte(0, 0);
        Avion a = new Avion(0, 0);
        Autobus au = new Autobus(0, 0);
        Tren tre = new Tren(0, 0);

        t.mover();
        a.mover();
        au.mover();
        tre.mover();
    }


}
