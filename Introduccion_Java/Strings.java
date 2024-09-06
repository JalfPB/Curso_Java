public class Strings {

    public static void main(String[] args) {
        String nada = "";
        String nombre = "Pepe";
        String apellido = "Martinez";
        String nombreCompleto1 = nombre + apellido;
        String nombreCompleto2 = nombre + " " + apellido;
        System.out.println(nada);
        System.out.println(nombreCompleto1);
        System.out.println(nombreCompleto2);
        String largo = """
                asdjasdasjdsajd
                asdasdsakjdosak
                asdpkasdpsakasd
                alsdkjsadjasdas
                """;
        System.out.println(largo);
    }

}
