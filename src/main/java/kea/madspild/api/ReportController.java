package kea.madspild.api;
import kea.madspild.ents.Report;
import kea.madspild.srvs.ReportService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/report")
public class ReportController {
    private final ReportService reportService;
    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }
    @GetMapping
    public String showForm(Model model) {
        Report report = new Report();
        model.addAttribute("report", report);
        return "Report/index";
    }
    @PostMapping
    public String registerReport(@ModelAttribute("report") Report report) {
        reportService.save(report);
        return "redirect:/report?success";
    }
}
