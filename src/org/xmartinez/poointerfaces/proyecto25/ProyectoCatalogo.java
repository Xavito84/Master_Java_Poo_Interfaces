package org.xmartinez.poointerfaces.proyecto25;

import org.xmartinez.poointerfaces.proyecto25.catalogo_productos.abstracta.Productos;
import org.xmartinez.poointerfaces.proyecto25.catalogo_productos.interfaces.*;
import org.xmartinez.poointerfaces.proyecto25.catalogo_productos.producto.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) {
        try {
            IPhone iPhone = new IPhone(1030, "Apple", "Iphone 16 Pro", "Blanco");
            TvLcd tele = new TvLcd(560, "Samsung", 55);
            TvLcd tele2 = new TvLcd(1600, "Sony", 65);


            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaPublicacion = sdf.parse("11/02/2015");

            Comics comics = new Comics(35, fechaPublicacion, "JJ", "Spiderman vuelve a la ciudad", "Marvel", "Spiderman");


            IProducto[] productos = new Productos[4];
            productos[0] = iPhone;
            productos[1] = tele;
            productos[2] = tele2;
            productos[3] = comics;

            for (IProducto producto : productos) {



                // Para los Electronicos  ============
                if (producto instanceof IElectronico) {

                    System.out.print("Fabricante: " + ((IElectronico) producto).getFabricante());

                    // Para los IPhone ============
                    if (producto instanceof IPhone) {
                        System.out.print("\n");
                        System.out.print("Modelo: " + ((IPhone) producto).getModelo());
                        System.out.print(" - ");
                        System.out.print("Color: " + ((IPhone) producto).getColor());
                    }

                    // Para los LCD  ============
                    if (producto instanceof TvLcd) {
                        System.out.print("\n");
                        System.out.print("Pulgadas: " + ((TvLcd) producto).getPulgadas());
                    }
                }

                // Para los Libros  ============
                if (producto instanceof ILibro) {

                    System.out.print("Titulo: " + ((ILibro) producto).getTitulo());
                    System.out.print("\n");
                    System.out.print("Autor: " + ((ILibro) producto).getAutor());

                    // Para los Comics  ============
                    if (producto instanceof Comics) {
                        System.out.println("\nFecha publicacion: " +((Comics) producto).getFechaPublicacion());

                        System.out.println("Editorial: "+ ((Comics) producto).getEditorial());

                        System.out.print("Personaje: " + ((Comics) producto).getPersonaje());

                    }

                }
                System.out.print("\n");
                System.out.print("Precio: " + producto.getPrecio()+"€");
                System.out.print("\n");
                System.out.print("Precio final: " + producto.getPrecioVenta()+"€");
                System.out.println("\n******************************************");


            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
