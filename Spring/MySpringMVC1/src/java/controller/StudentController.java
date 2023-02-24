package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author Vipul Kumar
 */
public class StudentController extends AbstractController {
    
    public StudentController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
            ModelAndView mv = new ModelAndView();
            mv.addObject("heading","Student list");
            mv.addObject("r",143);
            mv.addObject("n","Vipul Kumar");
            mv.addObject("c","java");
            return mv;
    }
    
}
