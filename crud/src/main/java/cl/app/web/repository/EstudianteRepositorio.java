package cl.app.web.repository;

import cl.app.web.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante, Long> {


}
