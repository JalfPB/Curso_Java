package Polimorfismo.Interfaces.Ejercicios.Ej13;

public class Main {

    public static void main(String[] args) {
        for(Meses mes : Meses.values()){
            if(mes.esVerano()){
                System.out.println(mes);
            }
        }
    
    }
}
