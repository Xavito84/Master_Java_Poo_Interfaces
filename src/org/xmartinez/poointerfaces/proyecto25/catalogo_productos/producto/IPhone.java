package org.xmartinez.poointerfaces.proyecto25.catalogo_productos.producto;

import org.xmartinez.poointerfaces.proyecto25.catalogo_productos.abstracta.Electronico;
import org.xmartinez.poointerfaces.proyecto25.catalogo_productos.abstracta.Productos;

import org.xmartinez.poointerfaces.proyecto25.catalogo_productos.interfaces.IProducto;

public class IPhone extends Electronico implements IProducto{

    private String modelo;
    private String color;

    public IPhone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio()/.7;
    }
}
