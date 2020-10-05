package com.test.no_dependency;
/**
 * @author dixon
 * @Project spring-dependency-injection
 */
public class Runner {

    public static void main(String[] args) {

        SalaryService salReport = new SalaryService();
        salReport.printReport();


    }
}
