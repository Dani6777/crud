package cl.app.web.controller;

import cl.app.web.service.EstudianteServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApiController {

    @Autowired
    private EstudianteServicioImpl servicio;


    @GetMapping("/estudiantes")
    public  String index(Model model){
        model.addAttribute("estudiantes", servicio.listarTodosLosEstudiantes());
        return "estudiantes";
    }


}
