package com.cookbook.Controller;
 
import com.cookbook.DAO.PersonViewDAO;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
@Controller
public class IndexController {
 
    @Autowired
    private PersonViewDAO personViewDAO;
 
    @RequestMapping(value="/index")
    public ModelAndView index(HttpServletRequest request) {
       
            Logger logger = LoggerFactory.getLogger(IndexController.class);
            logger.error("ERROR");

        System.out.print("xxxx");
        String name = request.getParameter("name");
        /*
        if (name != null)
            guestDao.persist(new Guest(name));
                */
        ModelAndView m=new ModelAndView("index.jsp");
        m.addObject("personViewDAO", personViewDAO);
 
        // Prepare the result view (guest.jsp):
        return m;
    }
}