package com.misl.khabarwala.admin.domain;

import com.misl.khabarwala.admin.entity.EmployeeEntity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class User {
    private Long id;
    private EmployeeEntity employeeEntity;
    private String userName;
    private String password;
}
