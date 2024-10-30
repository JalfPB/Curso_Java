package Polimorfismo.Interfaces.Ejercicios.Ej21;

public class Ciudad implements Comparable<Ciudad>{

    int poblacion;

    public Ciudad(int poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "Ciudad [poblacion=" + poblacion + "]";
    }

    @Override
    public int compareTo(Ciudad c){
        return Double.compare(c.poblacion, this.poblacion);
    }

}
