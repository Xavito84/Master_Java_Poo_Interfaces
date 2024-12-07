package org.xmartinez.poointerfaces.proyecto25.catalogo_productos.producto;

import org.xmartinez.poointerfaces.proyecto25.catalogo_productos.abstracta.Electronico;
import org.xmartinez.poointerfaces.proyecto25.catalogo_productos.interfaces.IProducto;

public class TvLcd extends Electronico implements IProducto {

    private int pulgadas;

    public TvLcd(int precio, String fabricante, int pulgadas) {
        super(precio, fabricante);
        this.pulgadas = pulgadas;
    }

    public int getPulgadas() {
        return this.pulgadas;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio()/.6;
    }
}
