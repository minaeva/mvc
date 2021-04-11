package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/home")
public class FirstController {

    @RequestMapping("/first")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askDetails() {
        return "ask-details-view";
    }

/*
    @RequestMapping("/showDetails")
    public String showDetails(HttpServletRequest request, Model model) {
        String empName = request.getParameter("empName");
        empName = "Mr. " + empName;
        model.addAttribute("nameAttribute", empName);
        model.addAttribute("descr", " udemy master");

        return "show-details-view";
    }
*/

    @RequestMapping("/showDetails")
    public String showDetails(@RequestParam("empName") String name,
                              Model model) {
        String empName = "Mister " + name;
        model.addAttribute("nameAttribute", empName);
        model.addAttribute("descr", " udemy master");

        return "show-details-view";
    }


}
