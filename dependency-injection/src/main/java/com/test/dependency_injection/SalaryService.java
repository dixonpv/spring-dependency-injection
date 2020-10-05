package com.test.dependency_injection;

import org.springframework.stereotype.Service;

/**
 * @author dixon
 * @Project spring-dependency-injection
 */
@Service
public class SalaryService {

    public final SalaryReport salaryReport;

    public SalaryService(SalaryReport salaryReport) {
        this.salaryReport = salaryReport;
    }

    public void printReport() {
        salaryReport.salaryReport();
    }
}
