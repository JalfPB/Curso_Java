package SupuestoPractico.Ej5;

import java.util.Random;

public class Arquero extends Personaje{

    private String nombre;
    private int nivel;
    private int vida;
    private int ataque;
    private int defensa;
    private Inventario inventario;
    Random random = new Random();
    private int dinero;

    public Arquero(String nombre, int nivel, int vida, int ataque, int defensa, Inventario inventario, int dinero){
        super(nombre, nivel, vida, ataque, defensa, inventario, dinero);

        //TODO
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;

    }

    public Arquero(String nombre, int nivel){
        super(nombre, nivel);
        this.vida = nivel * 10;
        this.ataque = nivel * 10;
        this.defensa = nivel * 10;
        this.inventario = new Inventario();
        this.dinero = 0;
    }

    // El arquero tiene probabilidad de hacer daño critico al atacar
    @Override
    public void atacar(Enemigo e) {
        int probCritico = random.nextInt(100);
        int danio;

        if (probCritico >= 50) {
            // Calculo de daño crítico
            danio = ataque * 3 - e.getDefensa();
            if (danio <= 0) danio = 1;  // Asegura que el daño sea al menos 1
            System.out.println("¡Daño crítico realizado! Daño total: " + danio);
            System.out.println("DAÑO DEL ARQUERO " + ataque);
        } else {
            // Calculo de daño normal
            danio = ataque - e.getDefensa();
            if (danio <= 0) danio = 1;
            System.out.println("Daño normal realizado: " + danio);
        }

        e.recibirDanio(danio);
    }

    @Override
    public void defender(Enemigo e) {
        int danio = e.getAtaque() - defensa;
        if(danio <= 0)
            danio=1;
        
        vida = danio;    
    }

    @Override
    public void subirHabilidad(String habilidad) {
         if(habilidad.toLowerCase().equals("ataque")){
            ataque += 5;
         }

         if(habilidad.toLowerCase().equals("vida")){
            vida += 5;
         }

         if(habilidad.toLowerCase().equals("defensa")){
            defensa += 5;
         }
    }


    @Override
    public void realizarAccion() {
        System.out.println(getNombre() + " realiza una acción de combate cuerpo a cuerpo.");
    }

}
