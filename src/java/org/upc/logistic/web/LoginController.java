package org.upc.logistic.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.upc.logistic.bean.User;
import org.upc.logistic.service.LoginService;

@Controller
@RequestMapping("/login")
@SessionAttributes("formUser")
public class LoginController {
    
    @Resource(name="loginService")
    private LoginService loginService;
    
    @RequestMapping(value = "/getForm", method = RequestMethod.GET)
    public String welcomeHandler(Model model,HttpSession session) { //@ModelAttribute("formUser") User user,
        model.addAttribute("formUser", new User());
        return "login";
    }

    @RequestMapping(value = "/valid", method = RequestMethod.POST)
    public String valid(@ModelAttribute("formUser") User user, Model model,HttpSession session) { //
        if (loginService.validLogin(user)) {
            return "home";
        }else{
             model.addAttribute("error", "User or password Wrong!!!");
             return "login";
        }
    }
}
