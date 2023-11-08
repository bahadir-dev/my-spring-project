package com.bahd.repository;

import com.bahd.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,String> {

    //display all departments in the furniture dept
    List<Department> findByDepartment(String department);

    //display all departments in the Health Division
    List<Department> findByDivisionIs(String division);
    List<Department> findByDivisionEquals(String division);

    //display top 3 depts with division name includes "Hea" without duplicates
    List<Department> findDistinctTop3ByDivisionContains(String pattern);

    // get departments in divisions
    @Query("SELECT d FROM Department d WHERE d.division IN ?1")
    List<Department> getDepartmentDivision(List<String> division);

    List<Department> retrieveDepartmentByDivision(String division);

    List<Department> retrieveDepartmentByDivisionContain(String pattern);


}
