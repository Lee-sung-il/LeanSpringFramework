package com.sungil.springboot.myfirstwebapp.login;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {

//    /login => com.sungil.springboot.myfirstwebapp.login.LoginController => login.jsp
//    http://localhost:8080/login?name=Ranga
//    Model
    @RequestMapping( "/login")
    public String goToLoginPage() {
        return "login";
    }
}
