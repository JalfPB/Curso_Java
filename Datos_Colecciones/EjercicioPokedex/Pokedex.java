package Datos_Colecciones.EjercicioPokedex;

import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class Pokedex {
    Pokemon[] pokemons = {
        new Pokemon("Bulbasaur", 1, "Planta/Veneno", 45, 49, 49, 45),
        new Pokemon("Ivysaur", 2, "Planta/Veneno", 60, 62, 63, 60),
        new Pokemon("Venusaur", 3, "Planta/Veneno", 80, 82, 83, 80),
        new Pokemon("Charmander", 4, "Fuego", 39, 52, 43, 65),
        new Pokemon("Charmeleon", 5, "Fuego", 58, 64, 58, 80),
        new Pokemon("Charizard", 6, "Fuego/Volador", 78, 84, 78, 100),
        new Pokemon("Squirtle", 7, "Agua", 44, 48, 65, 43),
        new Pokemon("Wartortle", 8, "Agua", 59, 63, 80, 58),
        new Pokemon("Blastoise", 9, "Agua", 79, 83, 100, 78),
        new Pokemon("Caterpie", 10, "Bicho", 45, 30, 35, 45),
        new Pokemon("Metapod", 11, "Bicho", 50, 20, 55, 30),
        new Pokemon("Butterfree", 12, "Bicho/Volador", 60, 45, 50, 70),
        new Pokemon("Weedle", 13, "Bicho/Veneno", 40, 35, 30, 50),
        new Pokemon("Kakuna", 14, "Bicho/Veneno", 45, 25, 50, 35),
        new Pokemon("Beedrill", 15, "Bicho/Veneno", 65, 90, 40, 75),
        new Pokemon("Pidgey", 16, "Normal/Volador", 40, 45, 40, 56),
        new Pokemon("Pidgeotto", 17, "Normal/Volador", 63, 60, 55, 71),
        new Pokemon("Pidgeot", 18, "Normal/Volador", 83, 80, 75, 101),
        new Pokemon("Rattata", 19, "Normal", 30, 56, 35, 72),
        new Pokemon("Raticate", 20, "Normal", 55, 81, 60, 97),
        new Pokemon("Spearow", 21, "Normal/Volador", 40, 60, 30, 70),
        new Pokemon("Fearow", 22, "Normal/Volador", 65, 90, 65, 100),
        new Pokemon("Ekans", 23, "Veneno", 35, 60, 44, 55),
        new Pokemon("Arbok", 24, "Veneno", 60, 95, 69, 80),
        new Pokemon("Pikachu", 25, "Eléctrico", 35, 55, 40, 90),
        new Pokemon("Raichu", 26, "Eléctrico", 60, 90, 55, 100),
        new Pokemon("Sandshrew", 27, "Tierra", 50, 75, 85, 40),
        new Pokemon("Sandslash", 28, "Tierra", 75, 100, 110, 65),
        new Pokemon("Nidoran♀", 29, "Veneno", 55, 47, 52, 41),
        new Pokemon("Nidorina", 30, "Veneno", 70, 62, 67, 56),
        new Pokemon("Nidoqueen", 31, "Veneno/Tierra", 90, 82, 87, 76),
        new Pokemon("Nidoran♂", 32, "Veneno", 46, 57, 40, 50),
        new Pokemon("Nidorino", 33, "Veneno", 61, 72, 57, 65),
        new Pokemon("Nidoking", 34, "Veneno/Tierra", 81, 102, 77, 85),
        new Pokemon("Clefairy", 35, "Hada", 70, 45, 48, 35),
        new Pokemon("Clefable", 36, "Hada", 95, 70, 73, 60),
        new Pokemon("Vulpix", 37, "Fuego", 38, 41, 40, 65),
        new Pokemon("Ninetales", 38, "Fuego", 73, 76, 75, 100),
        new Pokemon("Zubat", 39, "Veneno/Volador", 40, 45, 35, 55),
        new Pokemon("Golbat", 40, "Veneno/Volador", 75, 80, 70, 90),
        new Pokemon("Diglett", 41, "Tierra", 10, 55, 25, 95),
        new Pokemon("Dugtrio", 42, "Tierra", 35, 100, 50, 120),
        new Pokemon("Meowth", 43, "Normal", 40, 45, 35, 90),
        new Pokemon("Persian", 44, "Normal", 65, 70, 60, 115),
        new Pokemon("Psyduck", 45, "Agua", 50, 52, 48, 55),
        new Pokemon("Golduck", 46, "Agua", 80, 82, 78, 85),
        new Pokemon("Machop", 47, "Lucha", 70, 80, 50, 35),
        new Pokemon("Machoke", 48, "Lucha", 80, 100, 70, 45),
        new Pokemon("Machamp", 49, "Lucha", 90, 130, 80, 55),
        new Pokemon("Bellsprout", 50, "Planta/Veneno", 50, 75, 35, 40),
        new Pokemon("Weepinbell", 51, "Planta/Veneno", 65, 90, 50, 55),
        new Pokemon("Victreebel", 52, "Planta/Veneno", 80, 105, 65, 70),
        new Pokemon("Tentacool", 53, "Agua/Veneno", 40, 40, 35, 50),
        new Pokemon("Tentacruel", 54, "Agua/Veneno", 80, 70, 65, 100),
        new Pokemon("Geodude", 55, "Roca/Tierra", 40, 80, 100, 20),
        new Pokemon("Graveler", 56, "Roca/Tierra", 55, 95, 115, 35),
        new Pokemon("Golem", 57, "Roca/Tierra", 80, 110, 130, 45),
        new Pokemon("Ponyta", 58, "Fuego", 50, 85, 55, 90),
        new Pokemon("Rapidash", 59, "Fuego", 65, 100, 70, 105),
        new Pokemon("Magnemite", 60, "Eléctrico/Acero", 25, 35, 70, 45),
        new Pokemon("Magneton", 61, "Eléctrico/Acero", 50, 60, 95, 70),
        new Pokemon("Farfetch'd", 62, "Normal/Volador", 52, 65, 55, 60),
        new Pokemon("Doduo", 63, "Normal/Volador", 35, 85, 45, 75),
        new Pokemon("Dodrio", 64, "Normal/Volador", 60, 110, 70, 100),
        new Pokemon("Seel", 65, "Agua", 65, 45, 55, 45),
        new Pokemon("Dewgong", 66, "Agua/Hielo", 90, 70, 80, 70),
        new Pokemon("Grimer", 67, "Veneno", 80, 80, 50, 25),
        new Pokemon("Muk", 68, "Veneno", 105, 105, 75, 50),
        new Pokemon("Shellder", 69, "Agua", 30, 65, 100, 40),
        new Pokemon("Cloyster", 70, "Agua/Hielo", 50, 95, 180, 70),
        new Pokemon("Gastly", 71, "Fantasma/Veneno", 30, 35, 30, 80),
        new Pokemon("Haunter", 72, "Fantasma/Veneno", 45, 50, 45, 95),
        new Pokemon("Gengar", 73, "Fantasma/Veneno", 60, 65, 60, 110),
        new Pokemon("Onix", 74, "Roca/Tierra", 35, 45, 160, 70),
        new Pokemon("Drowzee", 75, "Psíquico", 60, 48, 45, 42),
        new Pokemon("Hypno", 76, "Psíquico", 85, 73, 70, 67),
        new Pokemon("Krabby", 77, "Agua", 30, 105, 90, 50),
        new Pokemon("Kingler", 78, "Agua", 55, 130, 115, 75),
        new Pokemon("Exeggcute", 79, "Planta/Psíquico", 60, 40, 80, 40),
        new Pokemon("Exeggutor", 80, "Planta/Psíquico", 95, 95, 85, 55),
        new Pokemon("Cubone", 81, "Tierra", 50, 50, 95, 35),
        new Pokemon("Marowak", 82, "Tierra", 60, 80, 110, 45),
        new Pokemon("Hitmonlee", 83, "Lucha", 50, 120, 53, 87),
        new Pokemon("Hitmonchan", 84, "Lucha", 50, 105, 79, 76),
        new Pokemon("Lickitung", 85, "Normal", 90, 55, 75, 30),
        new Pokemon("Koffing", 86, "Veneno", 40, 65, 95, 35),
        new Pokemon("Weezing", 87, "Veneno", 65, 90, 120, 60),
        new Pokemon("Rhyhorn", 88, "Roca/Tierra", 80, 85, 95, 25),
        new Pokemon("Rhydon", 89, "Roca/Tierra", 105, 130, 120, 40),
        new Pokemon("Chansey", 90, "Normal", 250, 5, 70, 50),
        new Pokemon("Tangela", 91, "Planta", 65, 55, 115, 60),
        new Pokemon("Kangaskhan", 92, "Normal", 105, 95, 80, 90),
        new Pokemon("Horsea", 93, "Agua", 30, 40, 70, 60),
        new Pokemon("Seadra", 94, "Agua", 55, 65, 95, 85),
        new Pokemon("Goldeen", 95, "Agua", 45, 67, 60, 63),
        new Pokemon("Seaking", 96, "Agua", 80, 92, 65, 68),
        new Pokemon("Staryu", 97, "Agua", 30, 45, 55, 85),
        new Pokemon("Starmie", 98, "Agua/Psíquico", 60, 75, 85, 115),
        new Pokemon("Mr. Mime", 99, "Psíquico/Hada", 40, 45, 65, 90),
        new Pokemon("Scyther", 100, "Bicho/Volador", 70, 110, 80, 105),
        new Pokemon("Jynx", 101, "Hielo/Psíquico", 65, 50, 35, 95),
        new Pokemon("Electabuzz", 102, "Eléctrico", 65, 83, 57, 105),
        new Pokemon("Magmar", 103, "Fuego", 65, 95, 57, 93),
        new Pokemon("Pinsir", 104, "Bicho", 65, 125, 100, 85),
        new Pokemon("Tauros", 105, "Normal", 75, 100, 95, 110),
        new Pokemon("Magikarp", 106, "Agua", 20, 10, 55, 80),
        new Pokemon("Gyarados", 107, "Agua/Volador", 95, 125, 79, 100),
        new Pokemon("Lapras", 108, "Agua/Hielo", 130, 85, 80, 60),
        new Pokemon("Ditto", 109, "Normal", 48, 48, 48, 48),
        new Pokemon("Eevee", 110, "Normal", 55, 55, 50, 55),
        new Pokemon("Vaporeon", 111, "Agua", 130, 65, 60, 65),
        new Pokemon("Jolteon", 112, "Eléctrico", 65, 65, 60, 130),
        new Pokemon("Flareon", 113, "Fuego", 65, 130, 60, 65),
        new Pokemon("Espeon", 114, "Psíquico", 65, 65, 60, 110),
        new Pokemon("Umbreon", 115, "Siniestro", 95, 65, 110, 65),
        new Pokemon("Leafeon", 116, "Planta", 65, 110, 130, 60),
        new Pokemon("Glaceon", 117, "Hielo", 65, 60, 110, 95),
        new Pokemon("Sylveon", 118, "Hada", 95, 65, 65, 60),
        new Pokemon("Porygon", 119, "Normal", 65, 60, 70, 40),
        new Pokemon("Porygon2", 120, "Normal", 85, 80, 90, 60),
        new Pokemon("Porygon-Z", 121, "Normal", 85, 90, 70, 60),
        new Pokemon("Registeel", 122, "Acero", 100, 75, 150, 50),
        new Pokemon("Regice", 123, "Hielo", 100, 50, 150, 50),
        new Pokemon("Regirock", 124, "Roca", 100, 100, 200, 50),
        new Pokemon("Lugia", 125, "Psíquico/Volador", 106, 90, 130, 90),
        new Pokemon("Ho-Oh", 126, "Fuego/Volador", 106, 130, 90, 90),
        new Pokemon("Celebi", 127, "Psíquico/Planta", 100, 100, 100, 100),
        new Pokemon("Tauros", 128, "Normal", 75, 100, 95, 110),
        new Pokemon("Magikarp", 129, "Agua", 20, 10, 55, 80),
        new Pokemon("Gyarados", 130, "Agua/Volador", 95, 125, 79, 100),
        new Pokemon("Lapras", 131, "Agua/Hielo", 130, 85, 80, 60),
        new Pokemon("Ditto", 132, "Normal", 48, 48, 48, 48),
        new Pokemon("Eevee", 133, "Normal", 55, 55, 50, 55),
        new Pokemon("Vaporeon", 134, "Agua", 130, 65, 60, 65),
        new Pokemon("Jolteon", 135, "Eléctrico", 65, 65, 60, 130),
        new Pokemon("Flareon", 136, "Fuego", 65, 130, 60, 65),
        new Pokemon("Espeon", 137, "Psíquico", 65, 65, 60, 110),
        new Pokemon("Umbreon", 138, "Siniestro", 95, 65, 110, 65),
        new Pokemon("Leafeon", 139, "Planta", 65, 110, 130, 60),
        new Pokemon("Glaceon", 140, "Hielo", 65, 60, 110, 95),
        new Pokemon("Sylveon", 141, "Hada", 95, 65, 65, 60),
        new Pokemon("Porygon", 142, "Normal", 65, 60, 70, 40),
        new Pokemon("Porygon2", 143, "Normal", 85, 80, 90, 60),
        new Pokemon("Porygon-Z", 144, "Normal", 85, 90, 70, 60),
        new Pokemon("Registeel", 145, "Acero", 100, 75, 150, 50),
        new Pokemon("Regice", 146, "Hielo", 100, 50, 150, 50),
        new Pokemon("Regirock", 147, "Roca", 100, 100, 200, 50),
        new Pokemon("Lugia", 148, "Psíquico/Volador", 106, 90, 130, 90),
        new Pokemon("Ho-Oh", 149, "Fuego/Volador", 106, 130, 90, 90),
        new Pokemon("Celebi", 150, "Psíquico/Planta", 100, 100, 100, 100),
        new Pokemon("Mew", 151, "Psíquico", 100, 100, 100, 100),
    };

    TreeMap<Integer, Pokemon> pokedex = new TreeMap<>();
    HashSet<String> tiposUnicos = new HashSet<>();

    public void agregarPokemon(Pokemon p){
        pokedex.put(p.getNumPokedex(), p);
    }

    public Pokemon buscarPokemon(int num){
        try{
        Pokemon p = pokedex.get(num);
        return p;
        }catch(Exception e){
            System.out.println("Error al buscar al pokemon");
        }
        return null;
    }

    public void listarPokemon(){
        for(Map.Entry<Integer,Pokemon> entry : pokedex.entrySet()) {
            int key = entry.getKey();
            Pokemon value = entry.getValue();

            System.out.println(key + " => " + value.toString());
        }
    }

    public HashSet<String> obtenerTiposUnicos(){
        
        for(Map.Entry<Integer,Pokemon> p : pokedex.entrySet()) {
            Integer key = p.getKey();
            Pokemon value = p.getValue();
          
            tiposUnicos.add(p.getValue().getTipo());
          }

        return tiposUnicos;
    }

    public Pokedex() {

        for(Pokemon p : pokemons){
            agregarPokemon(p);
        }

    }

}
