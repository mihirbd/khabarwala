package com.misl.khabarwala.admin.serviceImpl;

import com.misl.khabarwala.admin.entity.EmployeeEntity;
import com.misl.khabarwala.admin.reository.EmployeeRepository;
import com.misl.khabarwala.admin.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public List<EmployeeEntity> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<EmployeeEntity> findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void updateEntity(EmployeeEntity employeeEntity) {
        employeeRepository.save(employeeEntity);
    }

    @Override
    public void deleteEntity(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public EmployeeEntity saveEntity(EmployeeEntity employeeEntity) {
        return null;
    }
}
