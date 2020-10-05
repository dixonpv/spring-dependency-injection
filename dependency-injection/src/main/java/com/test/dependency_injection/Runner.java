package com.test.dependency_injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author dixon
 * @Project spring-dependency-injection
 */
public class Runner {

    public static void main(String... args) {

          AnnotationConfigApplicationContext context = getSpringContext("xlsx-reports");
          SalaryService salaryService = context.getBean(SalaryService.class);
          salaryService.printReport();
          context.close();

        }

        private static AnnotationConfigApplicationContext getSpringContext(String profile) {
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
            context.getEnvironment().setActiveProfiles(profile);
            context.register(Configuration.class);
            context.refresh();
            return context;
        }

}
