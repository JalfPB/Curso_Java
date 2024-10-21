package POO;

public class APP {

    public static void main(String[] args) {
        Punto p1 = new Punto();
        Punto p2 = new Punto();
        Punto p3 = new Punto();

        System.out.println(Punto.getPuntos());

        Constantes.mostrarConstantes();
        System.out.println("PI = " + Constantes.PI);
        System.out.println("E = " + Constantes.E);

    }

}
