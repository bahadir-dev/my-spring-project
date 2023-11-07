package com.bahd.bootstrap;

import com.bahd.repository.CourseRepository;
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
    private final CourseRepository courseRepository;

    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository, CourseRepository courseRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.courseRepository = courseRepository;
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
        System.out.println("get employee detail: "+employeeRepository.getEmployeeDetail());
        System.out.println("get employee salary: "+employeeRepository.getEmployeeSalary());
        System.out.println("get employee detail with 1 parameter: "+employeeRepository.getEmployeeDetail("dtrail8@tamu.edu"));
        System.out.println("get employee detail with 2 parameters: "+employeeRepository.getEmployeeDetail("jhookd@booking.com",126588));


        System.out.println("--------EMPLOYEE END--------");

        System.out.println("--------COURSE START--------");
        courseRepository.findByCategory("Spring").forEach(System.out::println);
        courseRepository.findByCategoryOrderByName("Spring").forEach(System.out::println);
        System.out.println(courseRepository.existsByName("JavaScript"));
        System.out.println(courseRepository.countByCategory("Spring"));
        System.out.println("--------COURSE END--------");
    }
}
