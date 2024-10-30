package Datos_Colecciones.Ejercicios.Ej1;
import java.util.*;

public class Pila {

    ArrayList<Integer> pila = new ArrayList();

    public void push(int n){
        this.pila.add(n);
    }

    public int pop(){
        int n = pila.get(pila.size()-1);
        pila.remove(pila.size()-1);
        return n;
    }

    public int peek(){
        return pila.get(pila.size()-1);
    }

    public boolean isEmpty(){
        if (pila.size() == 0) return true;
        else return false;
    }

}
