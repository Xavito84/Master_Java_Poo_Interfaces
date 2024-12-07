package org.xmartinez.poointerfaces.proyecto25.catalogo_productos.abstracta;

import org.xmartinez.poointerfaces.proyecto25.catalogo_productos.interfaces.IElectronico;

abstract public class Electronico extends Productos implements IElectronico {

    protected String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }


    @Override
    public String getFabricante() {
        return  fabricante;
    }




}
