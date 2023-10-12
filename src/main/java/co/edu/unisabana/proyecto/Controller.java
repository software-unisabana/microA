package co.edu.unisabana.proyecto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @GetMapping(path = "/saludar")
  public String saludar(){
    return "daniel";
  }
}
