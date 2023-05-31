package com.mvc.springmvc;

import com.mvc.jee.UserValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Autowired
    UserValidationService userValidationService;
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(){
        return "login";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String handleLoginPage(@RequestParam String name,@RequestParam String password, ModelMap model){
        if (userValidationService.isUserValid(name,password)){
            model.put("name",name);
            model.put("password",password);
            return "welcome";
        }
        else {
            model.put("errorMessage","Invalid Credentials!");
            return "login";
        }
    }
}
