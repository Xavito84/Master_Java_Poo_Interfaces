package org.xmartinez.poointerfaces.proyecto25.catalogo_productos.abstracta;

import org.xmartinez.poointerfaces.proyecto25.catalogo_productos.interfaces.IProducto;

abstract public class Productos implements IProducto {

    protected int precio;



    public Productos(int precio) {
        this.precio = precio;
    }


    @Override
    public int getPrecio() {
        return this.precio;
    }
}
