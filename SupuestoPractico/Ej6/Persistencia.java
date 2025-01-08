package SupuestoPractico.Ej6;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Persistencia {
    public static void guardarPedido(Pedido pedido, String archivo) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
            writer.write(pedido.toString());
            writer.newLine();
        }
    }

    public static Pedido cargarPedido(String archivo) throws IOException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String estado = null;
            Date fecha = null;
            List<Prenda> prendas = new ArrayList<>();

            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.startsWith("Estado:")) {
                    estado = linea.split(":")[1].trim();
                } else if (linea.startsWith("Fecha:")) {
                    String fechaStr = linea.split(":")[1].trim();
                    try {
                        fecha = dateFormat.parse(fechaStr);
                    } catch (ParseException e) {
                        System.out.println("Error al parsear la fecha: " + fechaStr);
                        throw new IOException("Formato de fecha incorrecto.");
                    }
                } else if (linea.startsWith("Prendas:")) {
                    continue; // Saltamos la línea de encabezado de prendas
                } else {
                    // Leer prendas
                    String[] datosPrenda = linea.split(",");
                    if (datosPrenda.length == 3) {
                        String tipo = datosPrenda[0].trim();
                        double precio = Double.parseDouble(datosPrenda[1].trim());
                        String estadoPrenda = datosPrenda[2].trim();

                        Prenda prenda = null;
                        switch (tipo) {
                            case "Camisa":
                                prenda = new Camisa(precio, estadoPrenda);
                                break;
                            case "Pantalón":
                                prenda = new Pantalon(precio, estadoPrenda);
                                break;
                            case "Vestido":
                                prenda = new Vestido(precio, estadoPrenda);
                                break;
                            default:
                                System.out.println("Tipo de prenda desconocido: " + tipo);
                                continue;
                        }
                        prendas.add(prenda);
                    }
                }
            }

            if (estado != null && fecha != null && !prendas.isEmpty()) {
                return new Pedido(estado, fecha, prendas);
            } else {
                throw new IOException("El archivo no contiene datos suficientes para reconstruir el pedido.");
            }
        }
    }
}
