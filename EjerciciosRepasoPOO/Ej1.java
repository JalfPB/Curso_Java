package EjerciciosRepasoPOO;

public class Ej1 {
    /*
     * Una empresa informática necesita llevar un registro de todos sus empleados
     * que se encuentran en la oficina central, para ello, se debe crear una clase
     * que incluya lo siguiente:
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
     * Implementa también un main para probar lo implementado anteriormente.
     */

     public static void main(String[] args) {
        Empleado empleado = new Empleado("Alfonso", 10, 10);

        empleado.mostrarClasificacion();

        empleado.mostrarDatos();

        empleado.aumentarSalario(50);
        empleado.mostrarDatos();
     }


}
