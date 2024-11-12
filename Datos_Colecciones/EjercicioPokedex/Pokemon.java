package Datos_Colecciones.EjercicioPokedex;

public class Pokemon implements Comparable<Pokemon>{

    String nombre;
    int numPokedex;
    String tipo;
    int puntosVida;
    int ataque;
    int defensa;
    int velocidad;

    public Pokemon(String nombre, int numPokedex, String tipo, int puntosVida, int ataque, int defensa, int velocidad) {
        this.nombre = nombre;
        this.numPokedex = numPokedex;
        this.tipo = tipo;
        this.puntosVida = puntosVida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Pokemon [nombre=" + nombre + ", numPokedex=" + numPokedex + ", tipo=" + tipo + ", puntosVida="
                + puntosVida + ", ataque=" + ataque + ", defensa=" + defensa + ", velocidad=" + velocidad + "]";
    }

    @Override
    public int compareTo(Pokemon p) {
        int comparacion = Integer.compare(this.numPokedex, numPokedex);
        if( comparacion == 0 ) comparacion = this.nombre.compareTo(p.nombre);
        return comparacion;
    }

    public void atacar(Pokemon p){
        int danio = this.getAtaque()-p.getDefensa();
        if( danio <= 0 ) danio = 1;
        p.setPuntosVida(p.getPuntosVida()-danio);
    }
}
