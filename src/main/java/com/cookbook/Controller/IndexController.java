package com.cookbook.Controller;
 
import com.cookbook.DAO.PersonViewDAO;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class IndexController {
 
    @Autowired
    private PersonViewDAO personViewDAO;
 
    @RequestMapping(value="/index")
    public ModelAndView index(HttpServletRequest request) {
        // Handle a new guest (if any):
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