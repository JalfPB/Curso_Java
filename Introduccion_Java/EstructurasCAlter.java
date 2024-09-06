public class EstructurasCAlter {

    public static void main(String[] args) {
        int x = 3, resultado;
        int a = 10;
        int b = 2;

        //SI || IF
        /* 
        *   if(condicion){
        *       sentencia 1;
        *       sentencia 2;
        *
        *       .sentencia N
        *   }
        */

        if (x == 3)
            System.out.println("Solo una sentencia"); //Si el if es de solo una sentencia se puede poner sin llaves

        /*
         * SI condicion_a_comprobar ENTONCES
         *      pasos_a_dar
         * SINO
         *      pasos_alternativos
         */

         if (x == 3){
            System.out.println("El valor es correcto");
            resultado = 5;
         }else{
            System.out.println("El valor es incorrecto");
            resultado = 27;
         }
        

        //SWITCH
        /*
         * switch(expresion){
         *      case valor1: sentencias1; break;
         *      case valor2: sentencias2; break;
         *      case valor3: sentencias3; break;
         *      ...Puede haber mas valores
         *      default: sentenciaD;
         * }
         */

         switch(x*10){
            case 30:
                System.out.println("El valor de x es 3");
                break;
            case 40:
                System.out.println("El valor de x es 4");
                break;
            case 50:
                System.out.println("El valor de x es 5");
                break;
            case 60:
                System.out.println("El valor de x es 6");
                break;
            default: 
                System.out.println("El valor no es 3,4,5 o 6");
                break;
         }

         //Operador ternario
         /*
          * variable = condicion ? resultado_si_cierto : resultado_si_falso
          */

          x = a ==10 ? b*2 : a;

          String frase = "Programacion en java";
          int cantidad = 0;

          for(int i = 0;i<frase.length(); i++){
            if(frase.charAt(i) == 'a' || frase.charAt(i) == 'A')
                cantidad++;
          }

          System.out.println("La letra A ha aparecido " + cantidad + " " + (cantidad == 1 ? "vez" : "veces"));
          
          //MIENTRAS || WHILE
          /*
           * while(condicion){
           *    instruccion1;
           *    instruccion2;
           *    ...
           *    instruccionN;
           * }
           * instruccion4
           */

        a = 0;
        b = 1;
        while(a < 4){
            b += a;
            a++;
        } // a -> 4, b -> 7
        System.out.println(a);
        System.out.println(b);

        //DO WHILE || HAZ MIENTRAS
        /*
         * do {
         *      instruccion1;
         *      instruccion2;
         *      ...
         *      instruccionN;
         *     }
         *  while(condicion);
         */

         a = 0;
         b = 1;
         do{
            b += a;
            a++;
         }while(a < 4);
         // a -> 4, b -> 7

         // FOR || PARA
         /*
          * for (valor_inicial ; condicion_continuacion ; incremento) {
          *     sentencia1;
          *     sentencia2;
          *     ...
          *     sentenciaN;
          *     }
          */

        for (int i = 0; i < 10; i++){
            System.out.println("Es la pasada nº: " + i);
        }

        //BREAK
        for(int i = 0; i<=10; i++){
            System.out.println("Es la pasada nº: " + i);
            if (i==8)
                break; //Rompe el bucle
        }
        //  continue; se salta lo que queda de pasada

        for(int i = 0; i<=10; i++){
            System.out.println("Es la pasada nº: " + i);
            if (i==8)
                continue;   //  ; se salta lo que queda de pasada
        }
    }
}
