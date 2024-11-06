package Datos_Colecciones.Ejercicios2.Ej9;

import java.util.PriorityQueue;
import java.util.Comparator;

public class ColaImpresion {

    private PriorityQueue<Documento> colaImpresion;

    public ColaImpresion() {
        colaImpresion = new PriorityQueue<>(new Comparator<Documento>() {
            @Override
            public int compare(Documento doc1, Documento doc2) {
                return Integer.compare(doc1.prioridad, doc2.prioridad);
            }
        });
    }

    public void encolarDocumento(String nombre, boolean prioridadAlta) {
        int prioridad = prioridadAlta ? 1 : 2;
        Documento nuevoDocumento = new Documento(nombre, prioridad);
        colaImpresion.add(nuevoDocumento);
        System.out.println("Documento encolado: " + nuevoDocumento);
    }

    public void imprimirDocumento() {
        if (!colaImpresion.isEmpty()) {
            Documento siguiente = colaImpresion.poll();
            System.out.println("Imprimiendo " + siguiente);
        } else {
            System.out.println("No hay documentos en la cola de impresión.");
        }
    }

    public void mostrarCola() {
        if (colaImpresion.isEmpty()) {
            System.out.println("La cola de impresión está vacía.");
        } else {
            System.out.println("Documentos en la cola de impresión:");
            for (Documento doc : colaImpresion) {
                System.out.println(doc);
            }
        }
    }
}

