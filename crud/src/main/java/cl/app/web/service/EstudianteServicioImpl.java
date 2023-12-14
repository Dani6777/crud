package cl.app.web.service;

import cl.app.web.entity.Estudiante;
import cl.app.web.repository.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.LongFunction;

@Service
public class EstudianteServicioImpl implements EstudianteServicio {

    @Autowired
    private EstudianteRepositorio repo;
    @Override
    public  List<Estudiante>  listarTodosLosEstudiantes(){
        return repo.findAll();
    }

    @Override
    public Estudiante guardarEstudiante(Estudiante estudiante){
        return repo.save(estudiante);
    }

    @Override
    public Estudiante findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Estudiante ActualizarEstudiante(Estudiante estudiante) {
        return repo.save(estudiante);
    }

    @Override
    public void eliminarEstudiante(Long id) {
        repo.deleteById(id);

    }
}
