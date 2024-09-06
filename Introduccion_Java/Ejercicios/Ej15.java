package Ejercicios;

public class Ej15 {
    /*Escribe un programa que, con el texto dado a continuación,
     muestre en pantalla la cantidad de caracteres que tiene el
    texto, el texto en mayúsculas, en minúsculas y cambie todas las “e” por “a”.*/
    public static void main(String[] args) {
        String texto = """
                En un lugar de La Mancha, de cuyo nombre no quiero acordarme,
                no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero,
                adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca
                que carnero, salpicón las más noches, duelos y quebrantos los sábados,
                lentejas los viernes, y algún palomino los domingos, consumían
                las tres partes de su hacienda. El resto della se gastaba en vino tinto
                de la tierra, que era de muy buen gusto; el cual bebía con tanta moderación,
                que no pasaba de las tres copas al almuerzo, ni de otras tantas a la cena; con
                lo cual vivía tan sano y tan fresco, como un pez en el agua.
                """;

        int cantidad = texto.length();
        String mayus = texto.toUpperCase();
        String minus = texto.toLowerCase();
        String remplazo = texto.replace('e', 'a');
        System.out.println("Cantidad de texto " + cantidad);
        System.out.println("Texto en mayusculas " + "\n" + mayus );
        System.out.println("Texto en minusculas " + "\n" + minus );
        System.out.println("Texto con las a y las e reemplazados" + "\n" + remplazo );
    }

}
