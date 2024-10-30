package Datos_Colecciones.Ejercicios.Ej1;

public class Main {

    public static void main(String[] args) {
        Pila pila = new Pila();

        pila.push(1);
        pila.push(2);
        pila.push(3);

        System.out.println(pila.peek());

        int n = pila.pop();
        System.out.println(n);

        System.out.println("Esta vacia? " + pila.isEmpty());
        pila.pop();
        pila.pop();
        System.out.println("Esta vacia? " + pila.isEmpty());
    }

}
