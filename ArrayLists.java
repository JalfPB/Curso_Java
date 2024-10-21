import java.util.ArrayList;
import POO.Punto;
public class ArrayLists {

    public static void main(String[] args) {
        ArrayList <Integer> listaNums = new ArrayList();
        ArrayList <Boolean> listaBooleans = new ArrayList();
        ArrayList <Double> listaDouble = new ArrayList();
        ArrayList <String> listaPalabras = new ArrayList();
        ArrayList <Punto> listaPuntos = new ArrayList();

        ArrayList<String> listaPaises = new ArrayList<>();
        listaPaises.add("España"); // Ocupa la posicion 0
        listaPaises.add("Francia"); // Ocupa la posicion 1
        listaPaises.add("Portugal"); // Ocupa la posicion 2
        listaPaises.add(1,"Italia"); // Ocupa la posicion 1

        for(int i = 0; i< listaPaises.size(); i++){
            System.out.println(listaPaises.get(i));
        }

        listaPaises.remove(2);

        listaPaises.set(1,"Alemania");

        // Devuelve el indice de un valor

        System.out.println(listaPaises.indexOf("Alemania"));

        // Recorrer el arraylist con un foreach
        for(String s : listaPaises){
            System.out.println(s);
        }

        System.out.println(listaPaises.toString());
        
    }

}
