package JuegoCombate;

class Territorio {
    String nombre;
    int defensa;
    boolean conquistado;

    public Territorio(String nombre, int defensa) {
        this.nombre = nombre;
        this.defensa = defensa;
        this.conquistado = false;
    }

    public void conquistar() {
        this.conquistado = true;
    }

    public boolean estaConquistado() {
        return conquistado;
    }
}