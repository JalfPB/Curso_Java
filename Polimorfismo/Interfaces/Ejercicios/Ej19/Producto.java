package Polimorfismo.Interfaces.Ejercicios.Ej19;

public class Producto implements Comparable<Producto>{

    double precio;

    @Override
    public int compareTo(Producto p){
        return Double.compare(p.precio, this.precio);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Producto(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto [precio=" + precio + "]";
    }

    

}
