package kea.madspild.api;
import kea.madspild.ents.Signup;
import kea.madspild.srvs.SignupService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/register")
public class SignupController {
    private final SignupService signupService;

    public SignupController(SignupService signupService) {
        super();
        this.signupService = signupService;
    }
    @GetMapping
    public String showForm(Model model) {
        Signup signup = new Signup();
        model.addAttribute("signup", signup);
        return "Signup/index";
    }
    @PostMapping
    public String registerSignup(@ModelAttribute("signup") Signup signup) {
        signupService.save(signup);
        return "redirect:/register?success";
    }
}
