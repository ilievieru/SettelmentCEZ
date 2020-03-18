package com.ness.SettelmentCEZV1.report.db.repositories;

import com.ness.SettelmentCEZV1.report.db.entities.ProducerReport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducerReportRepository extends CrudRepository<ProducerReport, Long> {
}
