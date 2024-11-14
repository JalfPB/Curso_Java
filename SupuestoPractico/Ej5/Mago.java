package SupuestoPractico.Ej5;

public class Mago extends Personaje{

    private String nombre;
    private int nivel;
    private int vida;
    private int ataque;
    private int defensa;
    private Inventario inventario;
    private int danioMagico = 30 + nivel;
    private int dinero;

    public Mago(String nombre, int nivel, int vida, int ataque, int defensa, Inventario inventario, int dinero){
        super(nombre, nivel, vida, ataque, defensa, inventario, dinero);

    }

    @Override
    public void atacar(Enemigo e) {
        int danio = ataque-e.getDefensa();
        if(danio <= 0)
            danio = 1;
        
        e.setVida(e.getVida()-danio);
    }

    // Metodo especial del Mago que sube su daño en un 15 %
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