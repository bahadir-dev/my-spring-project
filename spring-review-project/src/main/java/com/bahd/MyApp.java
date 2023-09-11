package com.bahd;

import com.bahd.config.EmployeeConfig;
import com.bahd.service.OvertimeSalaryService;
import com.bahd.service.SalaryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(EmployeeConfig.class);

        SalaryService salaryService = container.getBean(SalaryService.class);
        salaryService.calculateRegularSalary();

        OvertimeSalaryService overtimeSalaryService = container.getBean(OvertimeSalaryService.class);
        overtimeSalaryService.calculateRegularSalary();
    }
}
