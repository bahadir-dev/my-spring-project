package com.bahd.bootstrap;

import com.bahd.repository.DepartmentRepository;
import com.bahd.repository.EmployeeRepository;
import com.bahd.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("--------REGION START--------");

        System.out.println("FindByCountry: " + regionRepository.findByCountry("Canada"));
        System.out.println("findDistinctBy Country:" + regionRepository.findDistinctByCountry("USA"));
        System.out.println("find regions with country including United :" +regionRepository.findByCountryContainsIgnoreCase("united"));
        System.out.println("find regions with country including United ordered by country :" +regionRepository.findByCountryContainingOrderByCountry("Asia"));
        System.out.println("find top 2 in Canada: "+regionRepository.findTop2ByCountry("Canada"));
        System.out.println("--------REGION END--------");

        System.out.println("--------DEPARTMENT START--------");
        System.out.println("Departments in furniture: "+ departmentRepository.findByDepartment("Furniture"));
        System.out.println("Departments in health:" +departmentRepository.findByDivisionIs("Health"));
        System.out.println("finddistinct top 3 by diviison contains:"+ departmentRepository.findDistinctTop3ByDivisionContains("Hea"));
        System.out.println("--------DEPARTMENT END--------");

        System.out.println("--------EMPLOYEE START--------");
        System.out.println("Emplyee with email id:" + employeeRepository.findByEmailEquals("npointona@vistaprint.com") );

        System.out.println("--------DEPARTMENT END--------");
    }
}
