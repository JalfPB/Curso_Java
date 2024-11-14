package SupuestoPractico.Ej5;

import java.util.Random;

public class Arquero extends Personaje{

    private String nombre;
    private int nivel;
    private int vida;
    private int ataque;
    private int defensa;
    private Inventario inventario;
    private int danioMagico = 30 + nivel;
    Random random = new Random();
    private int dinero;

    public Arquero(String nombre, int nivel, int vida, int ataque, int defensa, Inventario inventario, int dinero){
        super(nombre, nivel, vida, ataque, defensa, inventario, dinero);

    }

    // El arquero tiene probabilidad de hacer daño critico al atacar
    @Override
    public void atacar(Enemigo e) {
        int probCritico = random.nextInt(100);
        int danioCritico;
        int danio;
        if (probCritico >= 50){
            danioCritico = ataque * 3;
            danio = danioCritico + ataque - e.getDefensa();
        }else{
            danio = ataque-e.getDefensa();
            if(danio <= 0)
                danio = 1;
        }
    
        e.setVida(e.getVida()-danio);
    }

    // Metodo especial del Arquero que sube su daño en un 15 %
    public void aplicarDanioMagico(){
        ataque = ataque + danioMagico;
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
