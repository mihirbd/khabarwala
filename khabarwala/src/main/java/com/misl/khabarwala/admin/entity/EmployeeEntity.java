package com.misl.khabarwala.admin.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.envers.Audited;

import java.sql.Blob;

@Entity
@Data
@Accessors(chain = true)
@Audited
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String Phone;
    @Column(nullable = true, unique = true)
    private String email;
    private String address;
    @Column(unique = true)
    private String nid;
    private Blob image;

}
