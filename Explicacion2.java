public class Explicacion2 {
    static int num = 5; // Variable global

    static int cubo(int num) {
        int x = num * num * num; // num es la variable local del metodo del cubo
        return x;
    }

    public static void main(String[] args) {
        num = cubo(num); // Se utiliza la variable global > en num se guarda 64
        System.out.println(num); // Se imprime 64(variable local)
    }

}
