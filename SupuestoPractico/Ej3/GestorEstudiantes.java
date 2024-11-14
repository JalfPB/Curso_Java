package SupuestoPractico.Ej3;

import java.util.ArrayList;

public class GestorEstudiantes {

    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    private ArrayList<Estudiante> listaEstudiantesClonada = new ArrayList<>();

    public GestorEstudiantes() {
        actualizarClon();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        for (Estudiante e : listaEstudiantes) {
            if (e.getDni().equals(estudiante.getDni())) {
                throw new IllegalArgumentException("Ya existe un estudiante con el DNI: " + estudiante.getDni());
            }
        }

        listaEstudiantes.add(estudiante);
        actualizarClon(); // Actualiza el clon cada vez que se modifica la lista
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        listaEstudiantes.remove(estudiante);
        actualizarClon(); // Actualiza el clon cada vez que se modifica la lista
    }

    // Este metodo busca al estudiante y devuelve su informacion y el estudiante
    public Estudiante buscarEstudiante(String dni) {
        for (Estudiante e : listaEstudiantes) {
            if (e.getDni().equals(dni)) {
                System.out.println(e.toString());
                return e;
            }
        }
        throw new IllegalArgumentException("No se ha encontrado Alumno con ese DNI");
    }

    public void devolverEstudianteNota(double nota) {
        for (Estudiante e : listaEstudiantes) {
            if (e.getNota() > nota) {
                System.out.println(e.toString());
            }
        }
    }

    // Metodo que actualiza el clon de la lista (copia superficial)
    private void actualizarClon() {
        listaEstudiantesClonada = new ArrayList<>(listaEstudiantes);
    }

    public ArrayList<Estudiante> copiaProfundaListaEstudiantes() {
        ArrayList<Estudiante> copiaProfunda = new ArrayList<>();
        for (Estudiante e : listaEstudiantes) {
            copiaProfunda.add(new Estudiante(e.getNombre(),e.getEdad(), e.getNota(), e.getDni())); // Se crea una nueva instancia para cada Estudiante
        }
        return copiaProfunda;
    }

    // Metodo para obtener el clon actual de la lista de estudiantes (copia
    // superficial)
    public ArrayList<Estudiante> getListaEstudiantesClonada() {
        return new ArrayList<>(listaEstudiantesClonada); // Evita que se modifique la lista original
    }

    public int convertirDoubleInt(double d){
        try{
            int n = (int)d;
            return n;
        }catch(Exception e){
            System.out.println("Ha ocurrido un error al convertir el numero de double a int");
            e.printStackTrace();
        }
        return 0;
    }

    public void mostrarMedia(){
        int media=0;
        for (Estudiante e : listaEstudiantes) {
            media += convertirDoubleInt(e.getNota());
        }
        System.out.println("La media de los estudiantes es: " + (media/listaEstudiantes.size()));
    }

    public void beca(){
        for (Estudiante e : listaEstudiantes) {
           if(e.getNota()>7)
           System.out.println(e.getNombre() + " es aplicable para beca porque tiene un nota superior a 7 (" + e.getNota() + ")");
        }
    }

    public void mostrarEstudiantes(){
        for (Estudiante e : listaEstudiantes) {
            e.mostrarDetalles();
        }
    }

}
