package org.xmartinez.poointerfaces.proyecto25.catalogo_productos.producto;

import org.xmartinez.poointerfaces.proyecto25.catalogo_productos.abstracta.Libro;
import org.xmartinez.poointerfaces.proyecto25.catalogo_productos.interfaces.IProducto;

import java.util.Date;

public class Comics extends Libro implements IProducto {

    private String personaje;

    public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public double getPrecioVenta() {

        return getPrecio()/.65;
    }
}
