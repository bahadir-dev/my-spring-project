package com.bahd.repository;

import com.bahd.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    //display all employees with email address 'npointona@vistaprint.com'
    List<Employee> findByEmailEquals(String email);

    //display employees with firstName ' ', last name ,also show all employees with an email address
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);

    //display all employees that first name is not
    List<Employee> findByFirstNameIsNot(String firstName);

    //display all employees where last name starts with
    List<Employee> findByLastNameStartingWith(String pattern);

    //dispaly all employees with salaries higher than
    List<Employee> findBySalaryGreaterThan(Integer salary);

    //display all employees with salaries less than
    List<Employee> findBySalaryLessThanEqual(Integer salary);

    //display all employees that has been hired between dates
    List<Employee> findByHireDateBetween(LocalDate start, LocalDate endDate);

    //dispaly all employees where salaries greater and equal to '' in desc order
    List<Employee> findBySalaryIsGreaterThanEqualOrderBySalaryDesc(Integer salary);

    //display top unique 3 employees that is making less than ''
    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

    //display all employee sthat do not have an email address
    List<Employee> findByEmailIsNull();

    @Query("SELECT e FROM Employee e WHERE e.email='sdubber7@t-online.de'")
    Employee getEmployeeDetail();

    @Query("SELECT e.salary from Employee e WHERE e.email='sdubber7@t-online.de'")
    Integer getEmployeeSalary();

    @Query("SELECT e from Employee e where e.email=?1")
    Optional<Employee> getEmployeeDetail(String email);

    @Query("SELECT e FROM Employee e WHERE e.email=?1 AND e.salary=?2")
    Employee getEmployeeDetail(String email, int salary);




}
