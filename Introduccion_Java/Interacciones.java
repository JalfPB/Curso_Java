public class Interacciones {

    public static void main(String[] args) {
        String texto = "Hola este es mi primer string";
        String minus = texto.toLowerCase(); //Todo en minuscula
        String mayus = texto.toUpperCase(); //Todo en mayuscula
        int longitud = texto.length();  //Tamaño de la cadena
        String escape = "Hola este es mi primer \" string"; //Caracter de escape (\)
        String remplazo = texto.replace('a', 'e'); //Reemplazar
        System.out.println(minus);
        System.out.println(mayus);
        System.out.println(longitud);
        System.out.println(remplazo);
        System.out.println(escape);

        String nombrecompleto = "";

    }
}
