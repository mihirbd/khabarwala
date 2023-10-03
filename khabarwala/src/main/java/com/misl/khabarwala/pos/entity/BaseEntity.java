package com.misl.khabarwala.pos.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {

   private Date date;
   private String createUserName;
   private String updateUserName;

}
