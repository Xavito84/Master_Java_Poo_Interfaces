package org.xmartinez.poointerfaces.proyecto25.catalogo_productos.abstracta;

import org.xmartinez.poointerfaces.proyecto25.catalogo_productos.interfaces.ILibro;
import org.xmartinez.poointerfaces.proyecto25.catalogo_productos.interfaces.IProducto;

import java.util.Date;

abstract public class Libro extends Productos implements ILibro, IProducto {

    protected Date fechaPublicacion;
    protected String autor;
    protected String titulo;
    protected String editorial;

    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }



    public String getAutor() {
        return autor;
    }



    public String getTitulo() {
        return titulo;
    }



    public String getEditorial() {
        return editorial;
    }



    @Override
    public double getPrecioVenta() {
        return getPrecio()/.8;
    }
}
