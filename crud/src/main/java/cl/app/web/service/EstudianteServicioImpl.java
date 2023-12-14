package cl.app.web.service;

import cl.app.web.entity.Estudiante;
import cl.app.web.repository.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServicioImpl implements EstudianteServicio {

    @Autowired
    private EstudianteRepositorio repo;
    @Override
    public  List<Estudiante>  listarTodosLosEstudiantes(){
        return repo.findAll();
    }
}
