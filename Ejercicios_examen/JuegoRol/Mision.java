package JuegoRol;

class Mision {
    String descripcion;
    int nivelDificultad;
    String recompensa;
    boolean activa;

    public Mision(String descripcion, int nivelDificultad, String recompensa) {
        this.descripcion = descripcion;
        this.nivelDificultad = nivelDificultad;
        this.recompensa = recompensa;
        this.activa = true;
    }

    public void completar() {
        activa = false;
        System.out.println("Misión completada: " + descripcion);
    }
}