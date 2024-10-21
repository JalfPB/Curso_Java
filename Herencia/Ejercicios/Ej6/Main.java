package Herencia.Ejercicios.Ej6;

public class Main {

    public static void main(String[] args) {
        ProductoElectronico pe = new ProductoElectronico(100, "Samsung");
        TelefonoMovil te = new TelefonoMovil(1000, "Apple", 100);
        Ordenador or = new Ordenador(2000, "Acer", false);
        Television tel = new Television(1500, "LG", 30);

        pe.detalles();
        te.detalles();
        or.detalles();
        tel.detalles();
    }


}
