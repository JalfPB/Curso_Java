package Ejercicios4;

public class Ej82 {
    // Implementa un método que encuentre la moda (el valor más frecuente) de un
    // array de enteros.

    static int encontrarModa(int[] lista){

            int maximoNumRepeticiones= 0;
            int moda= 0;
        
            for(int i=0; i<lista.length; i++)
            {
                int numRepeticiones= 0;
                for(int j=0; j<lista.length; j++)
                {
                    if(lista[i]==lista[j])
                    {
                        numRepeticiones++;
                    }
                    if(numRepeticiones>maximoNumRepeticiones)
                    {
                        moda= lista[i];
                        maximoNumRepeticiones= numRepeticiones;
                    }  
                }
            }   
            //System.out.print(moda);
            return moda;  
    }

    public static void main(String[] args) {
        int[] lista = { 1, 2, 3, 4, 4, 5, 6, 7, 7, 7 };

        //encontrarModa(lista);
        System.out.println("La moda del array es: " + encontrarModa(lista));
    }

}
