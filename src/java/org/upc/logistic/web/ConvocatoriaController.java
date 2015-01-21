package org.upc.logistic.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.upc.logistic.bean.Convocatoria;
import org.upc.logistic.bean.User;
import org.upc.logistic.service.ConvocatoriaService;
import org.upc.logistic.service.LoginService;

@Controller
@RequestMapping("/conv")
@SessionAttributes("formConv")
public class ConvocatoriaController {
    
    @Resource(name="convocatoriaService")
    private ConvocatoriaService convocatoriaService;
    
    @RequestMapping(value = "/getForm", method = RequestMethod.GET)
    public String welcomeHandler(Model model,HttpSession session) { //@ModelAttribute("formUser") User user,
        
        model.addAttribute("formConv", new Convocatoria());
          model.addAttribute("listArea", convocatoriaService.listArea());
            model.addAttribute("listPuesto", convocatoriaService.listPuestos());
        return "convocatoria";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@ModelAttribute("formConv") Convocatoria convocatoria, Model model,HttpSession session) { //
        if (convocatoriaService.register(convocatoria)) {
              model.addAttribute("formConv", convocatoria);
            return "detailConv";
        }else{
             model.addAttribute("error", "User or password Wrong!!!");
             return "errorConv";
        }
    }
}
