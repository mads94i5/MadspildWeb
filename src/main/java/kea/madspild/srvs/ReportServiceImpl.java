package kea.madspild.srvs;
import kea.madspild.dao.ReportDao;
import kea.madspild.ents.Report;
import org.springframework.stereotype.Service;
@Service
public class ReportServiceImpl implements ReportService {
    private final ReportDao reportDao;
    public ReportServiceImpl(ReportDao reportDao) {
        this.reportDao = reportDao;
    }
    @Override
    public Report save(Report report) {
        return reportDao.save(report);
    }
}
