package SupuestoPractico.Ej5;

import java.io.Serializable;
import java.util.Scanner;

public abstract class Personaje implements Serializable{

    private String nombre;
    private int nivel;
    private int vida;
    private int ataque = 10 * nivel;
    private int defensa;
    private int dinero;
    private Inventario inventario;
    private Mision mision;
    private Territorio territorioActual;

    public Personaje(String nombre, int nivel, int vida, int ataque, int defensa, Inventario inventario, int dinero) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.inventario = inventario;
        this.mision = null;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getNivel() {
        return nivel;
    }



    public void setNivel(int nivel) {
        this.nivel = nivel;
    }



    public int getVida() {
        return vida;
    }



    public void setVida(int vida) {
        this.vida = vida;
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



    public Inventario getInventario() {
        return inventario;
    }



    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public void mostrarInventario(){
        inventario.listarObjetos();
    }

    // Método para mover al personaje
    public void moverPersonaje(Territorio nuevoTerritorio) {
        if (nuevoTerritorio != null) {
            // Cambiar la ubicación del personaje
            this.territorioActual = nuevoTerritorio;
            System.out.println(this.nombre + " se ha movido a " + nuevoTerritorio.getNombre());
        } else {
            System.out.println("No se puede mover a un territorio nulo.");
        }
    }

    public abstract void atacar(Enemigo e);

    public abstract void defender(Enemigo e);

    public abstract void subirHabilidad(String habilidad);

    public Mision getMision() {
        return mision;
    }

    public void setMision(Mision mision) {
        this.mision = mision;
    }

    // Método para asignar misión a un personaje
    public void asignarMision(Mision mision) {
        this.mision = mision;
    }

    // Método abstracto que será implementado en las subclases para ejecutar habilidades o acciones específicas.
    public abstract void realizarAccion();

    public void recibirRecompensa(int recompensa) {
        // Supón que la recompensa es dinero o experiencia
        this.dinero += recompensa;  // O podrías aumentar experiencia o algún otro atributo
        System.out.println("Recibiste una recompensa de " + recompensa);
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public void completarMision() {
        if (mision == null) {
            System.out.println("Este personaje no tiene ninguna misión asignada.");
            return;
        }

        // Verificar el estado de la misión
        if (mision.getEstado() == Estado.COMPLETADA) {
            System.out.println("La misión ya ha sido completada previamente.");
            return;
        }

        // Completar la misión
        mision.setEstado(Estado.COMPLETADA);
        // Asignar recompensa al personaje
        recibirRecompensa(mision.getRecompensa());
        System.out.println("¡Misión completada! " + getNombre() + " ha recibido " + mision.getRecompensa() + " de recompensa.");
    }

    public Territorio getTerritorioActual() {
        return territorioActual;
    }

    public void setTerritorioActual(Territorio territorio) {
        this.territorioActual = territorio;
    }

}
