package org.xmartinez.poointerfaces.imprenta.modelo;

public class Informe extends Hoja implements IImprimible{

    private Persona autor;
    private Persona revisor;


    public Informe(String contenido, Persona autor, Persona revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public Persona getRevisor() {
        return revisor;
    }

    public void setRevisor(Persona revisor) {
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: "+ this.autor+
                "\nRevisado por: "+ this.revisor+
                "\n"+this.contenido;
    }
}
