package com.test.manual_dependency;

import com.test.dependency_injection.SalaryReportPDF;

/**
 * @author dixon
 * @Project spring-dependency-injection
 */
public class SalaryService {

    private SalaryReportPDF salaryReport;
    public SalaryService(SalaryReportPDF salaryReport) {
        this.salaryReport = salaryReport;
    }

    public void printReport() {
        salaryReport.salaryReport();
    }
}
