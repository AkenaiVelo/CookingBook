package com.cookbook.Controller;

import com.cookbook.Other.Loger;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
    
    String status="opcja1";

    @RequestMapping(value = "/register.jsp")
    public ModelAndView index(HttpServletRequest request) {
        Loger.logger.error("register Controler main");
        System.out.print("test");
        
         String button1 = request.getParameter("statusCheck");
         String button2 = request.getParameter("LogIn");
         if (button1!= null)
         {
             Loger.logger.error("Sprawdzam status");
             status="opcja2";
         }else if(button2!=null)
         {
             Loger.logger.error("Rejestruje");
             status="opcja3";
         }
         
        ModelAndView m = new ModelAndView("register.jsp");
        m.addObject("status", status);
        return m;
    }
}