package com.test.no_dependency;

import com.test.dependency_injection.SalaryReport;
import com.test.dependency_injection.SalaryReportPDF;

/**
 * @author dixon
 * @Project spring-dependency-injection
 */
public class SalaryService {

    private SalaryReportPDF salaryReport = new SalaryReportPDF();

    public void printReport() {


        salaryReport.salaryReport();
    }

}
