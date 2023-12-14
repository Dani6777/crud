package cl.app.web.service;

import cl.app.web.entity.Estudiante;

import java.util.List;

public interface EstudianteServicio {

    public List<Estudiante> listarTodosLosEstudiantes();

    public  Estudiante guardarEstudiante(Estudiante estudiante);

    public  Estudiante findById(Long id);

    public Estudiante ActualizarEstudiante(Estudiante estudiante);

    public void eliminarEstudiante(Long id);
}
