package EjerciciosRepasoPOO;

public class Empleado {
    /*
     * Atributos: nombre completo, permanencia (número de años en la empresa) y
     * salario.
     * Métodos:
     * 1. Constructor con y sin parámetros de entrada.
     * 2. Método que permita mostrar la clasificación según la permanencia de
     * acuerdo al siguiente algoritmo:
     * a. Si la permanencia es menor o igual a 3, “Principiante”.
     * b. Si la permanencia es mayor que 3 y menor que 18, “Intermedio”.
     * c. Si la permanencia es mayor o igual a 18, “Senior”.
     * 3. Método que muestre los datos del empleado por pantalla, incluida la
     * permanencia( se debe utilizar salto de línea para separar los atributos).
     * 4. Un método que permita aumentar el salario en un porcentaje que sería
     * pasado como parámetro al método.
     */

    private String nombreCompleto;
    private int permanencia;
    private double salario;

    public Empleado() {
        this.nombreCompleto = "";
        this.permanencia = 0;
        this.salario = 0;
    }

    public void aumentarSalario(int porcentaje){
        salario = salario + ((salario*porcentaje)/100);
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + this.nombreCompleto);
        System.out.println("Permanencia: " + this.permanencia);
        System.out.println("Salario: " + this.salario);
    }

    public void mostrarClasificacion(){
        if(permanencia<=3){
            System.out.println("Principiante");
        }else if(permanencia > 3 && permanencia < 18){
            System.out.println("Intermedio");
        }else if(permanencia>=18){
            System.out.println("Senior");
        }
    }

    public Empleado(String nombreCompleto, int permanencia, double salario) {
        this.nombreCompleto = nombreCompleto;
        this.permanencia = permanencia;
        this.salario = salario;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getPermanencia() {
        return permanencia;
    }

    public void setPermanencia(int permanencia) {
        this.permanencia = permanencia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
