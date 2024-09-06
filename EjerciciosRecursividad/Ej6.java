package EjerciciosRecursividad;

public class Ej6 {
    //Crea un método que compruebe si una palabra está ordenada alfabéticamente.

    static boolean ordenAlfabetico(String palabra){
        palabra = palabra.toLowerCase();
        if(palabra.length()>1){
            if(palabra.charAt(0)<=palabra.charAt(1)){
                return ordenAlfabetico(palabra.substring(1, palabra.length())); 
            }else{
                return false;
            }
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(ordenAlfabetico("abcde"));
        System.out.println(ordenAlfabetico("edcba"));
    }

}