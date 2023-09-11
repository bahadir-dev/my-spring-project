package com.bahd.service;

import com.bahd.repository.EmployeeRepository;
import com.bahd.repository.HoursRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OvertimeSalaryService {

    EmployeeRepository employeeRepository;
    HoursRepository hoursRepository;

    public OvertimeSalaryService(EmployeeRepository employeeRepository, @Qualifier("overtimeHours") HoursRepository hoursRepository) {
        this.employeeRepository = employeeRepository;
        this.hoursRepository = hoursRepository;
    }

    public void calculateRegularSalary(){
        //HourlyRate * Regular Hours
        System.out.println(employeeRepository.getHourlyRate() * hoursRepository.getHours());
    }
}
