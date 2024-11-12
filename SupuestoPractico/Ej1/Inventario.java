package SupuestoPractico.Ej1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Stack;

public class Inventario implements Serializable{

    ArrayList<Producto> listaProductos = new ArrayList<>();
    private Stack<Producto> pilaEliminados = new Stack<>();

    public void anadirProducto(Producto p) {
        listaProductos.add(p);
    }

    public void eliminarProducto(int id) {
        Producto productoAEliminar = null;
        
        for (Producto p : listaProductos) {
            if (p.getId() == id) {
                productoAEliminar = p;
                break;
            }
        }

        if (productoAEliminar != null) {
            listaProductos.remove(productoAEliminar);
            pilaEliminados.push(productoAEliminar);
            System.out.println("Producto eliminado y guardado en la pila para deshacer.");
        } else {
            System.out.println("Producto con ID " + id + " no encontrado.");
        }
    }

    public void deshacerEliminacion() {
        // Verificar si hay algún producto en la pila para deshacer
        if (!pilaEliminados.isEmpty()) {
            Producto ultimoEliminado = pilaEliminados.pop();
            listaProductos.add(ultimoEliminado);
            System.out.println("Se ha deshecho la eliminación del producto: " + ultimoEliminado);
        } else {
            System.out.println("No hay productos para deshacer la eliminación.");
        }
    }

    public void listarProductos() {
        for (Producto p : listaProductos) {
            System.out.println(p.toString());
        }
    }

    public Producto buscarProductoNombre(String nombre) {

        for (Producto p : listaProductos) {
            if (p.getNombre() == nombre) {
                return p;
            }
        }

        return null;
    }

    public void aumentarCantidad(Producto p, int cantidad) {
        if (cantidad < 0)
            cantidad = 0;
        p.setCantidad(p.getCantidad() + cantidad);
    }

    public void reducirCantidad(Producto p, int cantidad) {
        if (cantidad < 0)
            cantidad = 0;
        if ((p.getCantidad() - cantidad) == 0) {
            p.setCantidad(0);
        } else
            p.setCantidad(p.getCantidad() - cantidad);
    }

    public void guardarInventario(String rutaArchivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {
            oos.writeObject(this);
            System.out.println("Inventario guardado exitosamente en " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar el inventario: " + e.getMessage());
        }
    }

    public static Inventario cargarInventario(String rutaArchivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            return (Inventario) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar el inventario: " + e.getMessage());
            return null;
        }
    }

    // Metodo para guardar el inventario en un archivo de texto
    public void guardarInventarioTexto(String rutaArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (Producto producto : listaProductos) {
                writer.write(producto.getId() + "," + producto.getNombre() + "," + producto.getPrecio() + ", " + producto.getCantidad());
                writer.newLine();
            }
            System.out.println("Inventario guardado exitosamente en " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar el inventario: " + e.getMessage());
        }
    }

    // Metodo para cargar el inventario desde un archivo de texto
    public void cargarInventarioTexto(String rutaArchivo) {
        listaProductos.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 4) {
                    int id = Integer.parseInt(partes[0]);
                    String nombre = partes[1];
                    double precio = Double.parseDouble(partes[2]);
                    int cantidad = Integer.parseInt(partes[3].trim());
                    listaProductos.add(new Producto(id, nombre, precio, cantidad));
                }
            }
            System.out.println("Inventario cargado exitosamente desde " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al cargar el inventario: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error de formato en el archivo: " + e.getMessage());
        }
    }
}
