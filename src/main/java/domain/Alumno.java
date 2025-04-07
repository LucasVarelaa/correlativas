package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alumno {
    private String nombreYApellido;
    private List<Materia> materiasAprobadas = new ArrayList<>();

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    /*
    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
    */

    public String getNombreYApellido() {
        return nombreYApellido;
    }

    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }

    public void establecerMateriasAprobadas(Materia ... materias){
        materiasAprobadas.addAll(Arrays.asList(materias));
    }
}
