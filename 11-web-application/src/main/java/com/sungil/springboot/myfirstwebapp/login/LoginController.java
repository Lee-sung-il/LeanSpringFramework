package com.sungil.springboot.myfirstwebapp.login;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class LoginController {

//    /login => com.sungil.springboot.myfirstwebapp.login.LoginController => login.jsp
//    http://localhost:8080/login?name=Ranga
//    Model
    @RequestMapping( "/login")
    public String goToLoginPage(@RequestParam String name , ModelMap model) {
        model.put("name", name);
        return "login";
    }
}
