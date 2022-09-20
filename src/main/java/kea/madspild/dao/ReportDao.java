package kea.madspild.dao;

import kea.madspild.ents.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportDao extends JpaRepository<Report, Long> {

}
