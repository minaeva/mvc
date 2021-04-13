package mvc;

//import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/home")
public class FirstController {

    @RequestMapping("/")
    public String showHome() {
        return "home-view";
    }

    @RequestMapping("/first")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askDetails(Model model) {

        model.addAttribute("employee", new Employee());
        return "ask-details-view";
    }

    @RequestMapping("/showDetails")
    public String showDetails(@Valid @ModelAttribute("employee") Employee employee,
                              BindingResult result) {
//        String name = employee.getName();
//        employee.setName("mr " + name);

        String email = employee.getEmail();
        String surname = employee.getSurname();
        if (result.hasErrors()) {
            return "ask-details-view";
        } else {
            return "show-details-view";
        }
    }

    @RequestMapping("/show")
    public String showDetails(HttpServletRequest request, Model model) {
        String empName = request.getParameter("empName");
        empName = "Mr. " + empName;
        model.addAttribute("nameAttribute", empName);
        model.addAttribute("descr", " udemy master");

        return "show-view";
    }

/*
    @RequestMapping("/showDetails")
    public String showDetails(@RequestParam("empName") String name,
                              Model model) {
        String empName = "Mister " + name;
        model.addAttribute("nameAttribute", empName);
        model.addAttribute("descr", " udemy master");

        return "show-details-view";
    }
*/


}
