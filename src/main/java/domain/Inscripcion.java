package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasAInscribirse = new ArrayList<>();

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Materia> getMateriasAsociadas() {
        return materiasAInscribirse;
    }

    /*
    public void setMateriasAInscribirse(List<Materia> materiasAInscribirse) {
        this.materiasAInscribirse = materiasAInscribirse;
    }
    */

    public void establecerMateriasNecesarias(Materia ... materias){
        materiasAInscribirse.addAll(Arrays.asList(materias));
    }

    public boolean aprobada(){
        /// Set es como List pero que no permite elementos repetidos
        Set<Materia> correlativas =
                materiasAInscribirse.stream() // empezar a recorrer la lista
                .flatMap(m -> m.getCorrelativas().stream()) // obtengo las correlativas de cada materia
                .collect(Collectors.toSet()); // lo convierto a Set para evitar duplicados

        return this.alumno.getMateriasAprobadas().containsAll(correlativas);
    }
}
