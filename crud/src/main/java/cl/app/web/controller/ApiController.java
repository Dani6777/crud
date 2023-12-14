package cl.app.web.controller;

import cl.app.web.entity.Estudiante;
import cl.app.web.service.EstudianteServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ApiController {

    @Autowired
    private EstudianteServicioImpl servicio;


    @GetMapping("/estudiantes")
    public  String index(Model model){
        model.addAttribute("estudiantes", servicio.listarTodosLosEstudiantes());
        return "estudiantes";
    }

    @GetMapping("/estudiantes/nuevo")
    public String nuevoEstudiante(Model model){
        model.addAttribute("estudiantes",new Estudiante());
        return "nuevo_estudiante";
    }

    @PostMapping("/estudiantes")
    public  String guardarEstudiantes(@ModelAttribute("estudiante")Estudiante estudiantes){
        servicio.guardarEstudiante(estudiantes);
        return "redirect:/estudiantes";
    }

    @GetMapping("/estudiantes/editar/{id}")
    public  String editarEstudiante(@PathVariable Long id, Model model){
        model.addAttribute("estudiantes",servicio.findById(id));
        return "editar_estudiante";
    }

    @PostMapping("/estudiantes/{id}")
    public String actualizarEstudiante(@PathVariable Long id, @ModelAttribute("estudiantes") Estudiante estudiante, Model model){
        Estudiante estudianteExiste = servicio.findById(id);
        estudianteExiste.setId(id);
        estudianteExiste.setNombre(estudiante.getNombre());
        estudianteExiste.setApellido(estudiante.getApellido());
        estudianteExiste.setCorreo(estudiante.getCorreo());
        servicio.guardarEstudiante(estudianteExiste);
        return "redirect:/estudiantes";
    }

    @GetMapping("/estudiantes/{id}")
    public  String eliminarEstudiante(@PathVariable Long id){
        servicio.eliminarEstudiante(id);
        return "redirect:/estudiantes";
    }


}
