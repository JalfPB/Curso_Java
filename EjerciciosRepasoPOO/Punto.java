package EjerciciosRepasoPOO;

import java.util.ArrayList;

public class Punto {
    public int x;
    public int y;

    public Punto(int x, int y) {
        // This hace referencia a la variable de esta instancia
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean comprobarPuntos(Punto p) {

        if (p.getX() == this.x && p.getY() == this.y)
            return false;
        else
            return true;

    }

    public boolean comprobarPuntos(Punto... puntos) {
        boolean coincide = false;
        ArrayList<Punto> aux = new ArrayList<>();

        for (Punto p : puntos) {
            aux.add(new Punto(p.getX(), p.getY()));
        }

        for (Punto p : puntos) {
            int cont = 0;
            for (Punto pAux : aux) {
                if (p.getX() == pAux.x && p.getY() == pAux.y)
                    cont++;
                if (cont > 1)
                    coincide = true;
            }
        }

        if (coincide)
            return false;
        else
            return true;

    }

    public double obtenerDistancia(Punto p1, Punto p2){
        double distancia;
        double deltaX = (double) (p2.getX() - p1.getX());
        double deltaY = (double) (p2.getY() - p1.getY());
        distancia = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        //System.out.println("La distancia entre los dos puntos es de " + distancia);

        return distancia;

    }

    /* 
    public doublecalcularArea(Punto p1, Punto p2, Punto p3){

        if(comprobarPuntos(p1,p2,p3)){
            if(obtenerDistancia(p1, p2) == obtenerDistancia(p2, p3) && obtenerDistancia(p2, p3) == obtenerDistancia(p1, p3)){
                System.out.println("Equilatero");
            }
            double a = obtenerDistancia(p1, p2);
            double b = obtenerDistancia(p2, p3);
            double c = obtenerDistancia(p1, p3);
            double area;
            double s;
            s = Math.sqrt(obtenerDistancia(p1, p2) + obtenerDistancia(p2, p3) + obtenerDistancia(p1, p3)) / 2;
            area = s*(s-a)*(s-b)*(s-c);
            return area;
        }else return 0;

    }*/

    public double calcularArea(Punto p1, Punto p2, Punto p3) {
        if (comprobarPuntos(p1, p2, p3)) {

            double a = obtenerDistancia(p1, p2);
            double b = obtenerDistancia(p2, p3);
            double c = obtenerDistancia(p1, p3);
    
            
            if (a == b && b == c) {
                System.out.println("Equilátero");
            }
    
            double s = (a + b + c) / 2;
    
            // Calcular el área usando la fórmula de Herón
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            return area;
        } else return 0;
    }

    private static int cantidadPuntos = 1;

    public Punto() {
        cantidadPuntos++;
    }

    public static int getPuntos() {
        return cantidadPuntos;
    }
}
