package com.misl.khabarwala.admin.domain;


import lombok.Data;
import lombok.experimental.Accessors;

import java.sql.Blob;

@Data
@Accessors(chain = true)
public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
    private String Phone;
    private String email;
    private String address;
    private String nid;
    private Blob image;
}
