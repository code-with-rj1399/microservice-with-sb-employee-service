package com.microservices_with_sb.microservice_with_sb_employee_service.service;

import com.microservices_with_sb.microservice_with_sb_employee_service.model.Employee;
import com.microservices_with_sb.microservice_with_sb_employee_service.repository.EmployeeInMemoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeInMemoryRepository repository;


    public Employee addEmployee(Employee e){
        repository.add(e);
        return e;
    }

    public Employee getEmployeeById(Long id){
        return repository.findById(id);
    }

    public List<Employee> getAllEmployees(){
        return repository.findAll();
    }

    public List<Employee> getEmployeesByDepartment(Long departmentId) {
        return repository.findByDepartmentId(departmentId);
    }
}
