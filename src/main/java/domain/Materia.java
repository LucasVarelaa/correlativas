package domain;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    /*
    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }
    */

    public void establecerCorrelativas(Materia ... materias){
        correlativas.addAll(Arrays.asList(materias));
    }

}