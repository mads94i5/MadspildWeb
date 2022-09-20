package kea.madspild.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "Home/index";
    }
    @GetMapping("/error")
    public String error() {
        return "error";
    }
    @GetMapping("/about")
    public String about() {
        return "About/index";
    }
    @GetMapping("/report")
    public String report() {
        return "Report/index";
    }

}
