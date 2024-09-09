public class Arrays {

    public static void main(String[] args) {
        int [] notas = new int[8];
        int notas2[] = new int[8];

        for(int i = 0; i< notas.length; i++){
            notas[i] = i*2;
        }

        int[] notas3 = {6,7,8,1,10,5};

        for(int i = 0; i< notas3.length; i++){
            System.out.println(notas[i]);
        }

        String[] nombres = {"Pep", "Tom", "Kal"};
        for(int i = 0; i< nombres.length; i++){
            System.out.println(nombres[i]);
        }
    }

}
