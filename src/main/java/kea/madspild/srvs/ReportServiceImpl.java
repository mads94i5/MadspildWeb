package kea.madspild.srvs;

import kea.madspild.dao.ReportDao;
import kea.madspild.dao.ReportDto;
import kea.madspild.dao.SignupDao;
import kea.madspild.dao.SignupDto;
import kea.madspild.ents.Report;
import kea.madspild.ents.Signup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportServiceImpl implements ReportService {

    private final ReportDao reportDao;
    @Autowired
    public ReportServiceImpl(@Qualifier("report-mysql") ReportDao reportDao) {
        this.reportDao = reportDao;
    }
    @Override
    public int save(ReportDto reportDto) {
        Report report = new Report(reportDto.getZipCode(),
                reportDto.getName(), reportDto.getAddress(),
                reportDto.getDescription());
        return reportDao.addReport(report);
    }
}
