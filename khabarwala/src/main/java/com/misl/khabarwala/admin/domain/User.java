package com.misl.khabarwala.admin.domain;

import com.misl.khabarwala.admin.entity.EmployeeEntity;
import com.misl.khabarwala.admin.entity.RoleEntity;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Set;

@Data
@Accessors(chain = true)
public class User {
    private Long id;
    private String userName;
    private String password;
    private EmployeeEntity employee;
    private Set<RoleEntity> roles;
    private Boolean status;

}
