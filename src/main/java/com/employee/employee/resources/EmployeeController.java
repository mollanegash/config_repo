package com.employee.employee.resources;

import com.employee.employee.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
//    @RequestMapping("/{id}")
//    public Employee getEmployees(@PathVariable("id") String id){
//        return new Employee("sam",123,1234.5);
//
//    }
//@RequestMapping("/{empId}")
//public List<Employee> getAllEmployees(@PathVariable("empId") String empId){
//
//        return Collections.singletonList(
//                new Employee("sami",123,123)
//
//        );
//
//
//    }

    @RequestMapping("/{empId}")
    public List<Employee> getAllEmployee(@PathVariable("empId") String empId){
        Employee em1=new Employee("sami",123,12300);
        Employee em2=new Employee("dani",12,1200);
        List<Employee> em = List.of(em1,em2);
//        List<Employee> em = new ArrayList<>();
//        em.add(em1);
//        em.add(em2);
        return em;
    }
}
