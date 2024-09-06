public class SobrecargaMetodos {

    // En java podemos tener varios metodos con el mismo nombre, hay que tener en
    // cuenta una serie de factores
    // si el metodo recibe un parametro este debe ser distinto en cada metodo, si
    // hubiese mas de un paremetro al meos uno tiene que ser distinto
    // y si si no tuviesen distintos no se pueden crear metodos con el mismo nombre

    static String saludar(){
        return "Hola, como estas??";
    }

    static String saludar(String nombre){
        return "Hola " + nombre + ", como estás?";
    }

    static String saludar(String nombre, String ciudad){
        return "Hola " + nombre + ", que tal por " + ciudad;
    }

    public static void main(String[] args) {
        String nombre = "Alfonso", ciudad = "Caceres";
        
        System.out.println(saludar());
        System.out.println(saludar(nombre));
        System.out.println(saludar(nombre, ciudad));
    }

}
