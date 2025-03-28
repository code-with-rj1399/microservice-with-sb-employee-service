package com.microservices_with_sb.microservice_with_sb_employee_service.repository;

import com.microservices_with_sb.microservice_with_sb_employee_service.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class EmployeeInMemoryRepository {

    private static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee(100L, 1L, "Sudheer", 25, "Developer"));
        employeeList.add(new Employee(102L, 1L, "Ramya", 27, "Developer"));
        employeeList.add(new Employee(103L, 2L, "Madhav", 27, "Developer"));
        employeeList.add(new Employee(104L, 2L, "Keshav", 31, "Accountant"));
        employeeList.add(new Employee(105L, 2L, "Bob", 55, "Manager"));
        employeeList.add(new Employee(106L, 3L, "Cler", 75, "Manager"));
        employeeList.add(new Employee(107L, 3L, "Martin", 85, "MarketingManager"));
        employeeList.add(new Employee(108L, 3L, "RJ", 95, "CEO"));
    }

    public Employee add(Employee e){
        employeeList.add(e);
        return e;
    }

    public Employee findById(Long id){
        return employeeList.stream().filter(e -> Objects.equals(id, e.id())).findFirst().orElseThrow();
    }

    public List<Employee> findAll(){
        return employeeList;
    }

    public List<Employee> findByDepartmentId(Long departmentId) {
        return employeeList.stream().filter(e -> Objects.equals(e.departmentId(), departmentId)).toList();
    }
}
