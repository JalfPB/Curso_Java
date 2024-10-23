package Enums;

public class EjemploPlaneta {

    public static void main(String[] args) {
        for (Planeta planeta : Planeta.values()){
            System.out.printf(
                "La gravedad en %s es de %.2f m/s^2%n",
                planeta, planeta.gravedadSuperficial()
            );
        }
    }

}
