package com.cookbook.Controller;

import com.cookbook.DAO.PersonViewDAO;
import com.cookbook.Other.Loger;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class IndexController {

    @Autowired
    private PersonViewDAO personViewDAO;

    @RequestMapping(value = "/index")
    public ModelAndView index(HttpServletRequest request) {
        Loger.logger.error("Index Controler");
        /*
        String name = request.getParameter("name");
         if (name != null)
         guestDao.persist(new Guest(name));
         */
        ModelAndView m = new ModelAndView("index.jsp");
        m.addObject("personViewDAO", personViewDAO);
        return m;
    }
}
