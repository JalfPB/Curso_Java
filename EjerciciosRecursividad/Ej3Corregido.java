package EjerciciosRecursividad;

public class Ej3Corregido {
    static int invertirNum(int num, boolean llegoACero, int contador){
        num--;
        if(!llegoACero){
            contador++;
        }
        if(llegoACero){
            contador--;
        }
        if (num ==0){
            llegoACero=true;
        }
        if(contador==0){
            return num;
        }else{
            return invertirNum(num,llegoACero, contador);
        }
    }

    public static void main(String[] args) {
        int num = 7;
        int a = invertirNum(num, false, 0);
        System.out.println(a);
    }

}
