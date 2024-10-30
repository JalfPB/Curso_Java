package Polimorfismo.Interfaces.Ejercicios.Ej20;

public class Empleado implements Comparable<Empleado>{

    float salario;

    public Empleado(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado [salario=" + salario + "]";
    }

    @Override
    public int compareTo(Empleado e){

        return Float.compare(e.salario, this.salario);

    }

}
