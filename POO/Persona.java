package POO;

public class Persona {
    private String nombre;
    private int edad;
    String ciudadResidencia;
    String profesion;
    String dni;

    //Los constructores se utilizan para inicializar los objetos de una clase

    public Persona(String n){
        nombre = n;
        edad = 37;
        ciudadResidencia="Cáceres";
        profesion = "Abogado";
        dni="101010C";
    }

    public void cambioNombre(String n){
        nombre = n;
    }

    public void cambioEdad(int edad){
        if(edad>0)
        this.edad = edad;
        else
        System.out.println("Edad no valida");
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni );
        System.out.println("Edad: " + edad);
        System.out.println("Ciudad: " + ciudadResidencia);
        System.out.println("Profesion: " + profesion);
        System.out.println("-----------------------------------");
    }
}
