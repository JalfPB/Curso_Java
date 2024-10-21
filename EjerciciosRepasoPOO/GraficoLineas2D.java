package EjerciciosRepasoPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class GraficoLineas2D {

    ArrayList<Punto> listaPuntos = new ArrayList();
    public static int xMax;
    Scanner scanner = new Scanner(System.in);

    public int getXMax() {

        for (Punto p : listaPuntos) {
            if (p.getX() > xMax) {
                xMax = p.getX();
            }
        }

        return xMax;
    }

    public void eliminarPunto(){
        listaPuntos.remove(listaPuntos.size()-1); //Se elimina el ultimo punto de la lista accediendo al tamaño - 1
        System.out.println("El ultimo punto ha sido eliminado");    //Para que no se salga de los limites
    }

    public void setListaPuntos(){
        int x = 0, y = 0;
        borrarTodo();
        while(true){
            System.out.println("Añade coordenada x, Introduce num negativo para salir");
            x = scanner.nextInt();
            if(x<0) break;
            System.out.println("Añade coordenada y");
            y = scanner.nextInt();
            if(y<0) break;
            insertarCoordenadas(x, y);
        }
    }

    public void setListaPuntos(ArrayList<Punto> lista){
        // Se recorre la lista que se pasa como parametro y
        // se van insertando los puntos en listaPuntos
        // se usa el metodo insertar coordenadas porque
        // en el se hacen las comprobaciones necesarias 
        // para que los puntos esten en las posiciones
        // correctas
        for(Punto p : lista){
            insertarCoordenadas(p.getX(), p.getY());
        }
    }

    public void borrarTodo(){
        listaPuntos.clear();
    }

    public void insertarCoordenadas(int x, int y) {
        if ((x >= 0 && y >= 0) && (x > getXMax())) {
            Boolean existe = false;

            for (Punto p : listaPuntos) {
                if (p.getX() == x && p.getY() == y)
                    existe = true;
            }

            if (!existe){
                listaPuntos.add(new Punto(x, y));
                System.out.println("El punto ha sido insertado");
            }
            else
                System.out.println("Las coordenadas ya existen");
        } else {
            System.out.println("ERRROR, X E Y NO DEBEN SER NEGATIVOS Y LA X DEBE SER MAYOR QUE LA  ANTERIOR X");
        }
    }

}
