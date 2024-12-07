package org.xmartinez.poointerfaces.imprenta;

import org.xmartinez.poointerfaces.imprenta.modelo.*;

import static org.xmartinez.poointerfaces.imprenta.modelo.Genero.PROGRAMACION;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv= new Curriculum("Resumen laboral...", new Persona("Lola","Martínez"),"FullStack");
        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrolador fullstack")
                .addExperiencia("Angular");


        Libro libro= new Libro(new Persona("Erich", "Gama"), "Patrones de diseños: Elementos Reusables POO", PROGRAMACION);

        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));



        Informe informe= new Informe("Estudio de microservicios",new Persona("Lucas", "Lopez"), new Persona("Julian","Ortega"));

        imprimir(cv);
        System.out.println("***********************************\n");
        imprimir(informe);
        System.out.println("***********************************\n");
        imprimir(libro);// como no hereda de hoja hay que implementar una interfaz

    }

    public static void imprimir(IImprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
