package com.bahd.bootstrap;

import com.bahd.entity.Department;
import com.bahd.entity.Employee;
import com.bahd.entity.Region;
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
        List<Region> regionList = new ArrayList<>();

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

        Region r1 = new Region("Asia","Japan");
        Region r2 = new Region("America", "USA");
        Region r3 = new Region("Europe" , "UK");
        Region r4 = new Region("Central" , "Peru");
        Region r5 = new Region("South" , "Australia");

        e1.setDepartment(d1);
        e2.setDepartment(d2);
        e3.setDepartment(d3);
        e4.setDepartment(d4);
        e5.setDepartment(d5);

        e1.setRegion(r1);
        e2.setRegion(r2);
        e3.setRegion(r3);
        e4.setRegion(r4);
        e5.setRegion(r5);

        employeeList.addAll(Arrays.asList(e1,e2,e3,e4,e5));
        departmentList.addAll(Arrays.asList(d1,d2,d3,d4,d5));
        regionList.addAll(Arrays.asList(r1,r2,r3));

        employeeRepository.saveAll(employeeList);
 //       departmentRepository.saveAll(departmentList);


    }
}
