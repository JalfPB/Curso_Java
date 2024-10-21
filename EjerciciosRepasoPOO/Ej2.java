package EjerciciosRepasoPOO;

public class Ej2 {
    /*
     * Crea la clase GraficoLineas2D, para simular un gráfico formado por puntos en
     * un plano de 2 dimensiones, se deben tener en cuenta las siguientes
     * consideraciones:
     * El gráfico estará formado por un ArrayList de Puntos, en principio estará
     * vacío.
     * Las coordenadas de todos los puntos deben ser positivas.
     * En la lista no puede existir ningún punto en la misma posición que otro.
     * El orden de los puntos es muy importante, a medida que se avance en la lista,
     * las coordenadas en el eje de las x deberán ser siempre igual o mayor al
     * siguiente punto de la lista.
     * Se deberán crear métodos que permitan tanto añadir como eliminar puntos del
     * gráfico. Siempre se añadirán y eliminarán por el final. Se debe informar
     * tanto de la posible inserción, como del posible error si el punto no cumple
     * con las restricciones del problema.
     * Añadir un método que permita hacer un set del ArrayList de puntos, para ello
     * se deberá comprobar previamente si dicha lista cumple con los requisitos del
     * problema, de lo contrario, no se modificará la lista y se avisará por
     * pantalla. Utilizar dicho método para crear un constructor adicional que
     * reciba el ArrayList de Puntos.
     */

     public static void main(String[] args) {

        /* 
        GraficoLineas2D gf = new GraficoLineas2D();
        gf.insertarCoordenadas(1, 1);
        gf.insertarCoordenadas(5, 5);
        gf.insertarCoordenadas(2, 2);
        System.out.println("La x mas grande del grafico es: " + gf.getXMax());
        gf.eliminarPunto();
        gf.setListaPuntos();
        */

        /* 
        Punto pun1 = new Punto(1,1);
        Punto pun2 = new Punto(2,3);
        Punto pun3 = new Punto(3,4);

        Punto pun4 = new Punto(5,5);
        Punto pun5 = new Punto(5,5);
        Punto pun6 = new Punto(6,7);

        if(pun1.comprobarPuntos(pun1,pun2,pun3)) System.out.println("Estan en distinta posicion");
        else System.out.println("Estan en la misma posicion");

        if(pun1.comprobarPuntos(pun4,pun5,pun6)) System.out.println("Estan en distinta posicion");
        else System.out.println("Estan en la misma posicion");
        */

        Punto pun1 = new Punto(1,1);
        Punto pun2 = new Punto(2,2);
        Punto pun3 = new Punto(3,1);
        pun1.obtenerDistancia(pun1, pun2);
        System.out.println("El area de los 3 puntos es: " + pun1.calcularArea(pun1, pun2, pun3));


     }

}
