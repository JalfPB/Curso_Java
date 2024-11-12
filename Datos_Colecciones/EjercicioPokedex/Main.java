package Datos_Colecciones.EjercicioPokedex;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void combate(Pokemon p1, Pokemon p2){
        int danio; 

        while( p1.getPuntosVida() > 0 && p2.getPuntosVida() > 0){
            danio = p1.getAtaque()-p2.getDefensa(); // Se calcula el daño
            if( danio <= 0 ) danio = 1;  // Si el calculo da un numero negativo o 0 el daño sera 1, para evitar combates infinitos

            System.out.println(p1.getNombre() + " ataca!, le hace a " + p2.getNombre() + " " + danio + " puntos de daño!");
            p1.atacar(p2);
            System.out.println("Los ps de " + p2.getNombre() + " son: " + p2.getPuntosVida() + "\n");

            if(p2.getPuntosVida()<=0) break;

            danio = p2.getAtaque()-p1.getDefensa();
            if( danio <= 0 ) danio = 1;

            System.out.println(p2.getNombre() + " ataca!, le hace a " + p1.getNombre() + " " + danio + " puntos de daño!");
            p2.atacar(p1);
            System.out.println("Los ps de " + p1.getNombre() + " son: " + p1.getPuntosVida() + "\n");
            if(p1.getPuntosVida()<=0) break;
        }

        if(p1.getPuntosVida() > 0){
            System.out.println("El ganador es " + p1.getNombre());
        }else{
            System.out.println("El ganador es " + p2.getNombre());
        }
    }

    public static void agregar(Pokedex pokedex) {
        System.out.println("Introduce numero de la pokedex");
        int numPokedex = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer después de nextInt()
    
        System.out.println("Introduce nombre");
        String nombre = scanner.nextLine();
    
        System.out.println("Introduce tipo");
        String tipo = scanner.nextLine();
    
        System.out.println("Introduce puntos de vida");
        int pdv = scanner.nextInt();
    
        System.out.println("Introduce ataque");
        int ataque = scanner.nextInt();
    
        System.out.println("Introduce defensa");
        int defensa = scanner.nextInt();
    
        System.out.println("Introduce velocidad");
        int velocidad = scanner.nextInt();
    
        Pokemon pokemon = new Pokemon(nombre, numPokedex, tipo, pdv, ataque, defensa, velocidad);
        pokedex.agregarPokemon(pokemon);
    }

    public static void main(String[] args) {
        int opcion = 1;
        Pokedex pokedex = new Pokedex();

        while (opcion != 6) {
            System.out.println("Elige opcion!");
            System.out.println("1 - Agregar Pokemon");
            System.out.println("2 - Buscar Pokemon por numero de la Pokedex");
            System.out.println("3 - Listar todos los Pokemon");
            System.out.println("4 - Obtener tipos unicos");
            System.out.println("5 - Combate");
            System.out.println("6 - Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregar(pokedex);
                    break;

                case 2:
                    System.out.println("Introduce numero de pokedex");
                    int n = scanner.nextInt();
                    Pokemon p = pokedex.buscarPokemon(n);
                    if(p != null){
                        System.out.println("El pokemon que corresponde a " + n + " es " + p.getNombre());
                    }else{
                        System.out.println("Pokemon no encontrado");
                    }
                    break;

                case 3:
                    pokedex.listarPokemon();
                    break;

                case 4:
                    System.out.println(pokedex.obtenerTiposUnicos());
                    break;

                case 5:
                    System.out.println("Introduce numero de pokedex del primer pokemon");
                    int numPokedex1 = scanner.nextInt();
                    Pokemon poke1 = pokedex.buscarPokemon(numPokedex1);
                    System.out.println("Introduce numero de pokedex del segundo pokemon");
                    int numPokedex2 = scanner.nextInt();
                    Pokemon poke2 = pokedex.buscarPokemon(numPokedex2);
                    combate(poke1, poke2);
                    break;

                case 6:
                    System.out.println("Saliendo de la pokedex");
                    break;
            
                default:
                System.out.println("Opcion no reconocida");
                    break;
            }
        }

    }

}
