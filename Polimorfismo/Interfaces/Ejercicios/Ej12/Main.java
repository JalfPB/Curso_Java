package Polimorfismo.Interfaces.Ejercicios.Ej12;

public class Main {

    public static void main(String[] args) {
        Persona[] personas = new Persona[3];
        personas[0] = new Persona(12, "A");
        personas[1] = new Persona(83, "B");
        personas[2] = new Persona(56, "C");
        Persona aux;

        if(personas[1].compareTo(personas[0]) < 0){
            aux =personas[0];
            personas[0] = personas[1];
            personas[1] = aux;
        }

        if(personas[2].compareTo(personas[1]) < 0){
            aux = personas[1];
            personas[1] = personas[2];
            personas[2] = aux;
        }

        for (Persona p : personas){
            System.out.println(p.toString());
        }
    }

}
