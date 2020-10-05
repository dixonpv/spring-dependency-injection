package com.test.dependency_injection;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author dixon
 * @Project spring-dependency-injection
 */
@Component
@Profile("pdf-reports")
public class SalaryReportPDF implements SalaryReport {

    @Override
    public void salaryReport() {
        System.out.println("PDF Report generated");
    }
}
