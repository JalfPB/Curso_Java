package EjerciciosPOO;

public class Televisor {

    private int canal = 1;
    private int volumen = 5;
    private int color = 7;

    // contructor por defecto sin parametros
    public Televisor() {
    }

    public Televisor(int valorCanal) {
        canal = valorCanal;
    }

    public void subirCanal() {
        setCanal(canal + 1);
        imprimirCanal();
    }

    public void bajarCanal() {
        setCanal(canal - 1);
        imprimirCanal();
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int valorCanal) {
        if (valorCanal < 0 )
            canal = 10;
        else if (valorCanal > 10)
            canal = 0;
        else
            canal = valorCanal;
    }

    public void imprimirCanal(){
        System.out.println("Canal " + getCanal());
    }

    // Volumen
    public void subirVolumen() {
        setVolumen(volumen + 1);
        imprimirVolumen();
    }

    public void bajarVolumen() {
        setVolumen(volumen - 1);
        imprimirVolumen();
    }

    public void imprimirVolumen(){
        System.out.println("Volumen " + getVolumen());
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int valorVolumen) {
        if (valorVolumen < 1)
            volumen = 1;
        else if(valorVolumen > 15)
            volumen = 15;
        else 
            volumen = valorVolumen;
    }

    // Color
    public void subirColor() {
        setColor(color + 1);
        imprimirColor();
    }

    public void bajarColor() {
        setColor(color - 1);
        imprimirColor();
    }

    public void imprimirColor(){
        System.out.println("Color " + getColor());
    }

    public int getColor() {
        return color;
    }

    public void setColor(int valorVolumen) {
        if (valorVolumen < 1)
            color = 1;
        else if(valorVolumen > 7)
            color = 7;
        else 
            color = valorVolumen;
    }

}
