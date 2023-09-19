package com.misl.khabarwala.admin.mapper;

import com.misl.khabarwala.admin.domain.Employee;
import com.misl.khabarwala.admin.domain.User;
import com.misl.khabarwala.admin.entity.EmployeeEntity;
import com.misl.khabarwala.admin.entity.UserEntity;
import lombok.experimental.Accessors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Accessors(chain = true)
@Component
public class UserMapper {

    @Autowired
    ModelMapper modelMapper;


    // Entity to DTO mapping
    public User toDto(UserEntity userEntity) {
        return modelMapper.map(userEntity, User.class);
    }

    // DTO to Entity mapping
    public UserEntity toEntity(User user) {
        return modelMapper.map(user, UserEntity.class);
    }

    // Entity to DTO mapping for Employee
    public Employee toDto(EmployeeEntity employeeEntity) {
        return modelMapper.map(employeeEntity, Employee.class);
    }

    // DTO to Entity mapping for Employee
    public EmployeeEntity toEntity(Employee employee) {
        return modelMapper.map(employee, EmployeeEntity.class);
    }
}
