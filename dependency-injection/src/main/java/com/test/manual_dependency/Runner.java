package com.test.manual_dependency;

import com.test.dependency_injection.SalaryReportPDF;

/**
 * @author dixon
 * @Project spring-dependency-injection
 */
public class Runner {

    public static void main(String[] args) {

        SalaryService salaryService = new SalaryService(new SalaryReportPDF());
        salaryService.printReport();

    }

}
