package com.example.greeting;

import com.example.greeting.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class GreetingController {

  @Autowired
  private EmployeeService employeeService;

  @GetMapping("/")
  public String sayHello() {
    return "Hello World...";
  }

  @GetMapping("/index")
  public ModelAndView greeting(Model model) {
    model.addAttribute("employees", employeeService.populateEmployees());
    ModelAndView mv = new ModelAndView("index");
    mv.addObject(model);
    return mv;
  }
}
