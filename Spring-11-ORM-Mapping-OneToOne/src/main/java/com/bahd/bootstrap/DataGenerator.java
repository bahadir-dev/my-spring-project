package com.bahd.bootstrap;

import com.bahd.entity.Department;
import com.bahd.entity.Employee;
import com.bahd.enums.Gender;
import com.bahd.repository.DepartmentRepository;
import com.bahd.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {

    EmployeeRepository employeeRepository;
    DepartmentRepository departmentRepository;

    public DataGenerator(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<Employee> employeeList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();

        Employee e1 = new Employee("Berrie","Hispot","bhspot@dez.com", LocalDate.of(2006,4,23),120000, Gender.M);
        Employee e2 = new Employee("Jess","Root","jroot@mz.com", LocalDate.of(2002,5,25),220000, Gender.F);
        Employee e3 = new Employee("Matt","Roza","mroza@dez.com", LocalDate.of(2002,9,9),125000, Gender.M);
        Employee e4 = new Employee("Truz","Gpee","tgpee@frz.com", LocalDate.of(2000,7,30),100000, Gender.M);
        Employee e5 = new Employee("Zerr","Sert","zsert@fon.com", LocalDate.of(2003,11,21),100000, Gender.F);


        Department d1 = new Department("Sports","Outdoors");
        Department d2 = new Department("Tools","Hardware");
        Department d3 = new Department("Clothing","Home");
        Department d4 = new Department("Phones & Tablets","Electronics");
        Department d5 = new Department("Computers","Electronics");

        employeeList.addAll(Arrays.asList(e1,e2,e3,e4,e5));
        departmentList.addAll(Arrays.asList(d1,d2,d3,d4,d5));

        employeeRepository.saveAll(employeeList);
        departmentRepository.saveAll(departmentList);
    }
}
