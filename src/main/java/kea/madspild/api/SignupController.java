package kea.madspild.api;

import kea.madspild.dao.SignupDto;
import kea.madspild.srvs.SignupService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class SignupController {

    private final SignupService signupService;

    public SignupController(SignupService signupService) {
        this.signupService = signupService;
    }

    @ModelAttribute("signup")
    public SignupDto signupDto() {
        return new SignupDto();
    }
    @PostMapping
    public String registerSignup(@ModelAttribute("signup") SignupDto signupDto) {
        signupService.save(signupDto);
        return "redirect:/register?success";
    }
}
