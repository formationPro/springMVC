package fr.formation.inti.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
public class HelloWorldController {
 
    @RequestMapping("/hello")
    public String hello(Model model) {
        
        model.addAttribute("message", "Hello Spring MVC");
        
        return "hellopage";
        
    }
   
    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String authorInfo(Model model) {
  
        return "redirect:/hello";
    }
 
    
    @RequestMapping("/form")
    public String userInfo(Model model,
            @RequestParam(value = "nom") String name) {
   
        model.addAttribute("name", "Hello "+name);
   
        return "helloform";
    }
    
    @RequestMapping("/formA")
    public String userInfo(Model model) {
   
        return "redirect:/helloform";
    }
}