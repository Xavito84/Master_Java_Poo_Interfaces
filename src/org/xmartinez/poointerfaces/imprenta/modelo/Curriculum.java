package org.xmartinez.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements IImprimible{

    private Persona persona;
    private String carrera;
    private List<String> experiencia;


    public Curriculum(String contenido, Persona persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencia= new ArrayList<>();
    }

    public Curriculum addExperiencia(String exp){
        experiencia.add(exp);
        return this;
    }



    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder( "Nombre: " );
        sb.append(this.persona)
                .append("\nResumen: ").append(this.contenido)
                .append("\n").append("Profession: ")
                .append(this.carrera).append("\n")
                .append("Experiencias: \n");
        for (String exp: this.experiencia){
            sb.append("- ").append(exp).append("\n");
        }
        return sb.toString();
    }
}
