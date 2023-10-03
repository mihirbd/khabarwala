package com.misl.khabarwala.pos.entity;

import com.misl.khabarwala.admin.domain.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private Date date;
   private User createdBy;
   private User updatedBy;

}
