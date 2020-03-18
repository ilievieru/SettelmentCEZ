package com.ness.SettelmentCEZV1.report.db.services;

import com.ness.SettelmentCEZV1.report.db.entities.ProducerReport;
import com.ness.SettelmentCEZV1.report.db.repositories.ProducerReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProducerReportService {

    @Autowired
    ProducerReportRepository producerReportRepository;

    public void save(ProducerReport producerReport) {
        producerReportRepository.save(producerReport);
    }
}
