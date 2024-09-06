public class Explicacion1 {
    // Variables estaticas estas variables se podran utilizar en todo el programa y
    // no solo en el metodo que estemos utilizandolas
    static int x;

    static int cubo(int z) {
        int x;
        x = z * z;
        return x;
    }

    public static void main(String[] args) {
        // La variable local sustituira a la estatica
        // int x = 10;

        int p; // variable local del metodo main
        p = 10; // correcto: p es local en este ambito
        z = 100; // error: z no esta en este ambito
        x = cubo(p); // correcto, x es global, x vale 1000

    }

}
