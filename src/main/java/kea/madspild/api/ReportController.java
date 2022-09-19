package kea.madspild.api;

import kea.madspild.dao.ReportDto;
import kea.madspild.dao.SignupDto;
import kea.madspild.srvs.ReportService;
import kea.madspild.srvs.SignupService;
import org.springframework.stereotype.Controller;
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

    @ModelAttribute("signup")
    public ReportDto reportDto() {
        return new ReportDto();
    }
    @PostMapping
    public String registerReport(@ModelAttribute("report") ReportDto reportDto) {
        reportService.save(reportDto);
        return "redirect:/report?success";
    }
}
