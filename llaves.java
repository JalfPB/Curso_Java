public class llaves {
    public static void main(String[] args) {
        //Existen 2 formas aceptadas de colocar llaves
        /*
         * public metodo void main
         * {
         *      khernighan
         * }
         * 
         * o
         * 
         * public metodo void main {
         *      
         * }
         * 
         * {int a = 1, b = 2, c = 3}
         * 
         */

         {int a = 1, b = 2, c = 3;}

         // a = 3 da error

         //Da error
         //int n = Math.pow(2, 3);

         //Hay que castearlo
         int n = (int)Math.pow(2, 3);

         String cadena = "12345";
         int myInt = Integer.parseInt(cadena);

         String real = "12.35";
         double d = Double.parseDouble(real);
         System.out.println(d*2);
         real = "true";
         boolean condicion = Boolean.parseBoolean(real);
         if(condicion) System.out.println(condicion); // true

         char letra = 'a';
         int num = (int)letra; // 97
         String frase = Character.toString(letra); //a


    }
}
