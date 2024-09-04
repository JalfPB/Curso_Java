package Ejercicios4;

public class Ej45 {
    // Implementa un array que simule el funcionamiento de una cola, donde los
    // elementos se agregan al final y se eliminan desde el frente.

    public class Cola {
        private int[] cola;
        private int frente;
        private int fin;
        private int tamaño;
        private int capacidad;
    
        public Cola(int capacidad) {
            this.capacidad = capacidad;
            cola = new int[capacidad];
            frente = 0;
            fin = -1;
            tamaño = 0;
        }
    
        public boolean estaVacia() {
            return tamaño == 0;
        }
    
        public boolean estaLlena() {
            return tamaño == capacidad;
        }
    
        public void encolar(int elemento) {
            if (estaLlena()) {
                System.out.println("La cola está llena. No se puede encolar el elemento " + elemento);
                return;
            }
            fin = (fin + 1) % capacidad; // Manejo circular del array
            cola[fin] = elemento;
            tamaño++;
            System.out.println("Se encoló: " + elemento);
        }
    
        public int desencolar() {
            if (estaVacia()) {
                System.out.println("La cola está vacía. No se puede desencolar.");
                return -1; // Indicador de error
            }
            int elemento = cola[frente];
            frente = (frente + 1) % capacidad; // Manejo circular del array
            tamaño--;
            return elemento;
        }
    
        public int obtenerFrente() {
            if (estaVacia()) {
                System.out.println("La cola está vacía.");
                return -1; // Indicador de error
            }
            return cola[frente];
        }
    
        public int obtenerTamaño() {
            return tamaño;
        }
    
        public void mostrarCola() {
            if (estaVacia()) {
                System.out.println("La cola está vacía.");
                return;
            }
            System.out.print("Cola actual: ");
            for (int i = 0; i < tamaño; i++) {
                System.out.print(cola[(frente + i) % capacidad] + " ");
            }
            System.out.println();
        }
    }
    
        public static void main(String[] args) {
            Cola cola = new Cola(5); // Crear una cola con capacidad de 5 elementos
            cola.encolar(1);
            cola.encolar(2);
            cola.encolar(3);
            cola.mostrarCola();
    
            System.out.println("Elemento desencolado: " + cola.desencolar());
            cola.mostrarCola();
    
            System.out.println("Frente de la cola: " + cola.obtenerFrente());
            System.out.println("Tamaño de la cola: " + cola.obtenerTamaño());
        }
    }


