package org.xmartinez.poointerfaces.imprenta.modelo;

public class Pagina extends Hoja{

    public Pagina(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
        return this.contenido ;
    }
}
