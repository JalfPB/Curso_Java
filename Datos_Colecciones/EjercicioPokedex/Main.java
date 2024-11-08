package Datos_Colecciones.EjercicioPokedex;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

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

        while (opcion != 5) {
            System.out.println("Elige opcion!");
            System.out.println("1 - Agregar Pokemon");
            System.out.println("2 - Buscar Pokemon por numero de la Pokedex");
            System.out.println("3 - Listar todos los Pokemon");
            System.out.println("4 - Obtener tipos unicos");
            System.out.println("5 - Salir");

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
                    System.out.println("Saliendo de la pokedex");
                    break;
            
                default:
                System.out.println("Opcion no reconocida");
                    break;
            }
        }
    }

}
