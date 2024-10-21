package POO;

public class Circulo {

    //variables
    private double radio;
    private String color;
    private int centroX, centroY;

    public Circulo(){ // crea un Circulo de radio 50, negro y centro en (100,100)
        radio = 50;
        color = "negro";
        centroX = 100;
        centroY = 100;
    }

    

    public double getRadio() { // consulta el radio del circulo
        return radio;
    }



    public void setRadio(double radio) {
        this.radio = radio;
    }



    public String getColor() {
        return color;
    }



    public void setColor(String color) {
        this.color = color;
    }



    public int getCentroX() {
        return centroX;
    }



    public void setCentroX(int centroX) {
        this.centroX = centroX;
    }



    public int getCentroY() {
        return centroY;
    }



    public void setCentroY(int centroY) {
        this.centroY = centroY;
    }



    public void decrece(){ // decrementa el radio del circulo
        radio = radio / 1.3;
    }

    public double area(){ // calcula el area del circulo
        return Math.PI * radio; 
    }



    @Override
    public String toString() {
        return "Circulo [radio=" + radio + ", color=" + color + ", centroX=" + centroX + ", centroY=" + centroY + "]";
    }

    

}
