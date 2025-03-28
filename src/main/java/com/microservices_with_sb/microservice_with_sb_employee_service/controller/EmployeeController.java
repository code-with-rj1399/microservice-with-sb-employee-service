package com.microservices_with_sb.microservice_with_sb_employee_service.controller;

import com.microservices_with_sb.microservice_with_sb_employee_service.model.Employee;
import com.microservices_with_sb.microservice_with_sb_employee_service.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);


    @Autowired
    private EmployeeService employeeService;


    @GetMapping
    public List<Employee> getAllEmployees(){
        log.info("Get all employees");
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeByID(@PathVariable Long id){
        log.info("Get employee by id {}", id);
        return employeeService.getEmployeeById(id);
    }
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        log.info("Add employee id");
        employeeService.addEmployee(employee);
        return employee;
    }

    @GetMapping("/department/{departmentId}")
    public List<Employee> getEmployeesByDepartment(@PathVariable Long departmentId){
        log.info("Get employees by department");
        return employeeService.getEmployeesByDepartment(departmentId);
    }
}
