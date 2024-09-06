public class Strings2 {

    public static void main(String[] args) {
        String nombre = "Pepe";
        String frase;
        int cantidad = 20;
        frase = nombre + " tiene " + cantidad + " años";
        System.out.println(frase);
        frase = nombre + " tiene " + cantidad + 5 + " años";
        System.out.println(frase);
        frase = nombre + " tiene " + (cantidad + 5) + " años";
        System.out.println(frase);
        frase = nombre + " tiene " + 15 + 5 +  " años";
        System.out.println(frase);
        frase = nombre + " tiene " + (15 + 5) + " años";
        System.out.println(frase);
        frase = nombre + " tiene " + (15 - 5) + " años";
        System.out.println(frase);
        frase = 15 + 5 + nombre;
        System.out.println(frase);
        frase = 5 - 15 + nombre;
        System.out.println(frase);
        frase = 5-10 + nombre + 5 + 10 + (5 + 5);
        System.out.println(frase);
    }
}
