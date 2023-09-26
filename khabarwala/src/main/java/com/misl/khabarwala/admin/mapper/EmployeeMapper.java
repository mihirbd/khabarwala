package com.misl.khabarwala.admin.mapper;

import com.misl.khabarwala.admin.domain.Employee;
import com.misl.khabarwala.admin.entity.EmployeeEntity;
import lombok.experimental.Accessors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Accessors(chain = true)
@Component
public class EmployeeMapper {

    @Autowired
    ModelMapper modelMapper;

    // Entity to DTO mapping for Employee
    public Employee entityToDto(EmployeeEntity employeeEntity) {
        return modelMapper.map(employeeEntity, Employee.class);
    }

    // DTO to Entity mapping for Employee
    public EmployeeEntity dtoToEntity(Employee employee) {
        return modelMapper.map(employee, EmployeeEntity.class);
    }

}
