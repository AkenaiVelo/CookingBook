package com.cookbook;
 
import com.cookbook.DAO.PersonViewDAO;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class GuestController {
 
    @Autowired
    private PersonViewDAO personViewDAO;
 
    @RequestMapping(value="/guest")
    public ModelAndView guestbook(HttpServletRequest request) {
        // Handle a new guest (if any):
        String name = request.getParameter("name");
        /*
        if (name != null)
            guestDao.persist(new Guest(name));
                */
        ModelAndView m=new ModelAndView("guest.jsp");
        m.addObject("personViewDAO", personViewDAO);
 
        // Prepare the result view (guest.jsp):
        return m;
    }
}