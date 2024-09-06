public class Recursividad {
    static int factorial(int n){
        if(n == 0) return 1; //caso base
        else return n*factorial(n-1); //caso general
    }

    static void tri(int contB, int contA, int n){
        if(contB < contA) {
            System.out.print("* ");
            tri(contB + 1, contA, n);
        } else {
            System.out.println();
            if (contA < n )
                tri(0,contA + 1, n);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        int altura = 3;
        tri(0,0,altura);
    }

}
