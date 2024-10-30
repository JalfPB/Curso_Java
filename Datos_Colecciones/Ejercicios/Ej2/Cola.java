package Datos_Colecciones.Ejercicios.Ej2;

import java.util.ArrayList;

public class Cola {

    ArrayList<Integer> cola = new ArrayList();

    public int peek(){
        return cola.get(cola.get(0));
    }

    public void enqueue(int n){
        this.cola.add(n);
    }

    public int dequeue(){
        int n = this.cola.get(0);
        cola.remove(0);
        return n;
    }

    public boolean isEmpty(){
        if (cola.size() == 0) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Cola [cola=" + cola + "]";
    }

    



}
