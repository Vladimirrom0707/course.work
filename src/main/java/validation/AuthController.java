package validation;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class AuthController {
    @GetMapping(value = "/login")
    public String Login(Model model,String error,String logout) {
        if (error != null)
            model.addAttribute("error","Your username and password are invalid.");

        if (logout != null)
            model.addAttribute("message","You have been logged out successfully.");

        return "login";
    }
}
