package com.example.kak.kakv1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.constraints.Null;

@Controller
public class HomeController {

    @Value("${message}")
    private String message;

    @RequestMapping("/")
    public String index(){
        return ("/Layout");
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET, params = {"argName"})
    public String Controller(@RequestParam(value="argName", required = true) String argName) {
      return "about";
    }
}
