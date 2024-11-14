package SupuestoPractico.Ej3;

public class Main {

    public static void main(String[] args) {
        GestorEstudiantes ge = new GestorEstudiantes();

        ge.agregarEstudiante(new Estudiante("Alfonso", 23, 9, "123456A"));
        ge.agregarEstudiante(new Estudiante("Andrea", 21, 8, "123456B"));
        ge.agregarEstudiante(new Estudiante("Pedro", 25, 3, "123456C"));

        ge.mostrarMedia();
        ge.beca();
        ge.mostrarEstudiantes();

    }

}
