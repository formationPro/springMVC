package fr.formation.inti.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
public class HelloWorldController2 {
 
    @RequestMapping("/test")
    public String hello3(Model model) {
        
        model.addAttribute("message", "Hello Spring MVC");
        model.addAttribute("test",15);
        
        return "hellopage";
        
    }
    
}