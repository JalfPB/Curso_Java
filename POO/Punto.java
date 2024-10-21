package POO;

public class Punto {
    public int x;
    public int y;

    public Punto(int x, int y) {
        //This hace referencia a la variable de esta instancia
        this.x = x;
        this.y = y;
    }

    private static int cantidadPuntos = 1;

    public Punto(){
        cantidadPuntos++;
    }

    public static int getPuntos(){
        return cantidadPuntos;
    }

    


    /* 
    public Cliente(String n, long dni){
        nombre = n;
        dni = dni;
    }

    public Cliente(String n, long dni, long tel){
        this(n,dni);
        telefono = tel;
    }
    */
}
