package com.test.dependency_injection;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author dixon
 * @Project spring-dependency-injection
 */
@Component
@Profile("xlsx-reports")
public class SalaryReportXlsx implements SalaryReport {

    @Override
    public void salaryReport() {
        System.out.println("Excel Report Generated");
    }
}
