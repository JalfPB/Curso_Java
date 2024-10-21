package EjerciciosRepasoGeneral;

public class Ej9 {
    /*
     * 9- Crea un método que reciba una cadena y verifique si es un palíndromo
     *  (se lee igual de adelante hacia atrás). Usa bucles para comparar los
     *  caracteres y condicionales para devolver el resultado.
     */

     static void esPalindromo(String cadena){
        cadena = cadena.toLowerCase();
        boolean palindromo=false;
        for (int i = 0, j = cadena.length() - 1; i < j; i++, j--) {
            if (cadena.charAt(i) != cadena.charAt(j)) {
                palindromo = false;
            }else{
                palindromo = true;
            }
        }

        if(palindromo){ 
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }
     }

     public static void main(String[] args) {
        String cad1 = "ABA";
        String cad2 = "ABC";

        esPalindromo(cad1);
        esPalindromo(cad2);
     }

}
