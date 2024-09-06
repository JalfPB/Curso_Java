public class Explicacion3 {
    static int num = 5; // Variable global

    static int cubo(int num) {
        int x = num * num * num; // num es la variable local del metodo del cubo
        return x;
    }

    public static void main(String[] args) {
        int num = 10; // Variable local, sobrescribe la global
        num = cubo(num); // Se utiliza la variable local > en num se guarda 1000
        System.out.println(num); // Se imprime 1000(variable local)
    }
}
