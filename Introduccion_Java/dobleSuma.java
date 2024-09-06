public class dobleSuma {

    public static void main(String[] args) {
        
        int a = 5;
        int b = a++; //Primero añade y luego incrementa
        int c;

        System.out.println(a);
        System.out.println(b);

        a = 5;
        b = ++a; //Primero incrementa y luego añade

        System.out.println(a);
        System.out.println(b);

        a=1;
        b=4;
        c=b++;
        System.out.println("c " + c);
    }

}
