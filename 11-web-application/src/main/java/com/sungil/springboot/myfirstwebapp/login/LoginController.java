package com.sungil.springboot.myfirstwebapp.login;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

    private final AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    //    /login => com.sungil.springboot.myfirstwebapp.login.LoginController => login.jsp
//    http://localhost:8080/login?name=Ranga
//    Model
//    GET, POST
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String goToLoginPage() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
       if (!authenticationService.authenticate(name, password)) {
           model.put("errorMessage", "Invalid Credentials. Please try again.");
           return "login";
       }

        model.put("name", name);
//        Authentication
//        name - in28minutes
//        password - dummy
        return "welcome";
    }
}
