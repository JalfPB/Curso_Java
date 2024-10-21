package POO;

public final class ObjetoInmutable {

    private final int n;
    private final String s;
    private final Punto p;
    public ObjetoInmutable(int n, String s, Punto p) {
    this.n = n;
    this.s = new String(s);
    this.p = new Punto(p.getX(), p.getY());
    }
    public int getN() {
    return n;
    }
    public String getS() {
    return new String(s);
    }
    public Punto getPunto() {
    return new Punto(p.getX(), p.getY());
    }

}
