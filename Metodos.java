public class Metodos {

    static int suma(int a, int b){
        int resultado = a+b;
        return resultado;
    }

    static double areaCuadrado(double lado){
        return lado * lado;
    }

    static double perimetroCuadrado(double lado){
        return lado * 4;
    }

    static void mostrarMenu(){
        System.out.println("metodo que muestra un menu");
        System.out.println("1 - Obtener area");
        System.out.println("2 - Obtener perimetro");
        return;
    }

    static String nombreDeTuMetodo(String nombre) {
        String resultado = "Hola, " + nombre;
        return resultado;
    }

    public static void main(String[] args) {
        int a = 1, b = 2;
        System.out.println("El resultado de la suma es " + suma(a,b));
        
        int valor1 = 1;
        int valor2 = 2;
        int c = suma(valor1,valor2);

        mostrarMenu();

        System.out.println(areaCuadrado(b));
        System.out.println(perimetroCuadrado(b));

        System.out.println(nombreDeTuMetodo("Método"));
        


    }


}
