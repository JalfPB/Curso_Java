package EjerciciosRecursividad;

public class Ej2 {
    // Crea un método que obtenga el resultado de elevar un número a otro. Ambos números se
    // deben pasar como parámetros. Los números deben ser positivos.

    static int elevar(int base, int exponente){

        if(exponente==0){
            return 1;
        }else if(exponente<0){
            return elevar(base,exponente+1) / base;
        }else{
            return base * elevar(base, exponente-1);
        }
    }
    public static void main(String[] args) {

        System.out.println(elevar(2,2));
        
    }
}
