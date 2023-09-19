package com.misl.khabarwala.admin.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(fetch = FetchType.EAGER)
    private EmployeeEntity employeeEntity;
    private String userName;
    private String password;

}
