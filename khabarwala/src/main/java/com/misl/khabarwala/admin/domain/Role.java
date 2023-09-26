package com.misl.khabarwala.admin.domain;

import com.misl.khabarwala.admin.entity.UserEntity;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Set;

@Data
@Accessors(chain = true)
public class Role {
    private Long id;
    private String role;
    private Set<UserEntity> users;
}
