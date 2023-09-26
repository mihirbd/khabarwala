package com.misl.khabarwala.admin.controller;

import com.misl.khabarwala.admin.domain.Employee;
import com.misl.khabarwala.admin.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("employees")
public class EmployeeController implements BaseController<Employee, Long>{

    @Autowired
    EmployeeService employeeService;

    @Override
    public List<Employee> getAll() {
        return employeeService.findAll();
    }

    @Override
    public Optional<Employee> get(Long id) {
        return employeeService.findById(id);
    }

    @Override
    public ResponseEntity<Employee> save(Employee employee) {
        return ResponseEntity.ok(employeeService.saveEntity(employee));
    }

    @Override
    public ResponseEntity<?> update(Employee employee, Long id) {
        employeeService.updateEntity(employee, id);
        return status(HttpStatus.ACCEPTED).body(null);
    }

    @Override
    public ResponseEntity<?> delete(Long id) {
        employeeService.deleteEntity(id);
        return status(HttpStatus.ACCEPTED).body(null);
    }
}
