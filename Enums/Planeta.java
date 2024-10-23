package Enums;

public enum Planeta {

    MERCURIO(3.303e+23,2.4397e6),
    VENUS(4.869e+24,6.0518e6),
    TIERRA(5.976e+24,6.37814e6);

    private final double masa;
    private final double radio;

    Planeta(double masa, double radio){
        this.masa = masa;
        this.radio = radio;
    }

    public double getMasa() {
        return masa;
    }

    public double getRadio() {
        return radio;
    }

    public double gravedadSuperficial(){
        final double G = 6.67300E-11;
        return G * masa / (radio * radio);
    }

}
