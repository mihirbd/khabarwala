package com.misl.khabarwala.admin.serviceImpl;

import com.misl.khabarwala.admin.domain.Employee;
import com.misl.khabarwala.admin.entity.EmployeeEntity;
import com.misl.khabarwala.admin.mapper.EmployeeMapper;
import com.misl.khabarwala.admin.reository.EmployeeRepository;
import com.misl.khabarwala.admin.service.EmployeeService;
import com.misl.khabarwala.configuration.exception.IdNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeMapper employeeMapper;


    @Override
    public List<Employee> findAll() {
        List<EmployeeEntity> employees = employeeRepository.findAll();
        return employees.stream().map(employeeMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public Optional<Employee> findById(Long id) {
       EmployeeEntity employee = employeeRepository.findById(id).orElseThrow(()-> new IdNotFoundException("Employee id not found!"));
        return Optional.of(employeeMapper.entityToDto(employee));
    }

    @Override
    public void updateEntity(Employee employee, Long id) {
        EmployeeEntity fetchEmployee = employeeRepository.findById(id).orElseThrow(()-> new IdNotFoundException("Employee id not found!"));
        fetchEmployee.setFirstName(employee.getFirstName())
        	.setLastName(employee.getLastName())
        	.setPhone(employee.getPhone())
        	.setEmail(employee.getEmail())
        	.setAddress(employee.getAddress())
        	.setNid(employee.getNid())
        	.setImage(employee.getImage());
        employeeRepository.save(fetchEmployee);
    }

    @Override
    public void deleteEntity(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee saveEntity(Employee employee) {
        EmployeeEntity employeeEntity = employeeMapper.dtoToEntity(employee);
        employeeRepository.save(employeeEntity);
        return employeeMapper.entityToDto(employeeEntity);
    }
}
