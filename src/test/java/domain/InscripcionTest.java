package domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



public class InscripcionTest {

    @Test
    public void testInscripcionAprobadaConCorrelativasCumplidas() {
        // Creo materias
        Materia algoritmos = new Materia();
        algoritmos.setNombre("AyED");
        Materia paradigmas = new Materia();
        paradigmas.setNombre("PdP");
        Materia diseño = new Materia();
        diseño.setNombre("DDS");

        // Seteo correlativas
        paradigmas.establecerCorrelativas(algoritmos);
        diseño.establecerCorrelativas(paradigmas);

        // Creo alumno y le pongo materias aprobadas
        Alumno lucas = new Alumno();
        lucas.setNombreYApellido("Lucas Varela");
        lucas.establecerMateriasAprobadas(algoritmos, paradigmas);

        // Creo inscripción
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(lucas);
        inscripcion.establecerMateriasNecesarias(diseño);

        // Verifico que la inscripción sea válida
        assertTrue(inscripcion.aprobada());
    }

    @Test
    public void testInscripcionAprobadaSinCorrelativasCumplidas() {
        // Creo materias
        Materia algoritmos = new Materia();
        algoritmos.setNombre("AyED");
        Materia paradigmas = new Materia();
        paradigmas.setNombre("PdP");
        Materia diseño = new Materia();
        diseño.setNombre("DDS");

        // Seteo correlativas
        paradigmas.establecerCorrelativas(algoritmos);
        diseño.establecerCorrelativas(paradigmas);

        // Creo alumno y le pongo materias aprobadas
        Alumno lucas = new Alumno();
        lucas.setNombreYApellido("Lucas Varela");
        lucas.establecerMateriasAprobadas(paradigmas);

        // Creo inscripción
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(lucas);
        inscripcion.establecerMateriasNecesarias(diseño);

        // Verifico que la inscripción sea válida
        assertTrue(inscripcion.aprobada());
    }

}
