package Herencia.Ejercicios.Ej5;

public class Main {

    public static void main(String[] args) {
        LibroFisico lf = new LibroFisico("libro1", "alfonso", "abc1", 34);
        LibroDigital ld = new LibroDigital("libro2", "Hola", "Mundo", "pdf");

        System.out.println(lf.autor);
        System.out.println(ld.getFormato());
    }

}
