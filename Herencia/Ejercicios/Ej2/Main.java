
public class Main {

    public static void main(String[] args) {
        Coche coche = new Coche("aa","aa",2,2);
        Moto moto = new Moto("aa","aa",2f,2);
        Patinete patinete = new Patinete("aa","aa",2,2);

        System.out.println(coche.seMueve());
        System.out.println(moto.seMueve());
        System.out.println(patinete.seMueve());
    }

}
