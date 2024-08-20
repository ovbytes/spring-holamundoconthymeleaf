package com.mycompany;


import com.mycompany.domain.Persona;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Value("${index.saludo}")
    private String saludo;
    
    @GetMapping("/")
    public String inicio(Model model) {
        var mensaje="Message with Thymeleaf";
        
        var persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("juanperez@gmail.com");
        persona.setTelefono("9999999");
        
        var persona2 = new Persona();
        persona2.setNombre("Ana");
        persona2.setApellido("Sanchez");
        persona2.setEmail("anasan@gmail.com");
        persona2.setTelefono("888888");
        
        var personas=Arrays.asList(persona, persona2);
        
        log.info("Executing the Spring Controller MVC");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        model.addAttribute("personas", personas);
        return "index";
    }

}
