package com.cookbook.Controller;

import com.cookbook.Other.Loger;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {
    
    String status="opcja1";

    @RequestMapping(value = "/register")
    public String index(HttpServletRequest request,Model m) {
        Loger.logger.error("register Controler main");
         String button1 = request.getParameter("statusCheck");
         String button2 = request.getParameter("LogIn");
         if (button1!= null)
         {
             status="opcja2";
             m.addAttribute("status", status);
             return "register.jsp";
         }else if(button2!=null)
         {
             status="opcja3";
             m.addAttribute("status", status);
             return "register.jsp";
         }
        m.addAttribute("status", status);
        return "register.jsp";
    }
}