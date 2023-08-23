package com.employee.employee.resources;

import com.employee.employee.module.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @RequestMapping("/{id}")
    public Employee getEmployees(@PathVariable("id") String id){
        return new Employee("sam",123,1234.5);
    }

}
