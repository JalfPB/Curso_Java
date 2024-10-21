public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro("Fido", 3);
        Animal gato = new Gato("Miau", 2);
        perro.hacerSonido();
        gato.hacerSonido();
    }
}
