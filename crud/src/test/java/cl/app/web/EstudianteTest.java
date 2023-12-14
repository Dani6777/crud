package cl.app.web;


import cl.app.web.entity.Estudiante;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EstudianteTest {



    @Test
    public void testEstudinte(){
        Estudiante estudiante = new Estudiante();
        estudiante.setId(1L);
        estudiante.setNombre("John");
        estudiante.setApellido("Doe");
        estudiante.setCorreo("john.doe@example.com");

        assertEquals(Long.valueOf(1L), estudiante.getId());
        assertEquals("John", estudiante.getNombre());
        assertEquals("Doe", estudiante.getApellido());
        assertEquals("john.doe@example.com", estudiante.getCorreo());
    }
}
