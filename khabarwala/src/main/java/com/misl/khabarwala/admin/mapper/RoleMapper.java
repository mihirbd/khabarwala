package com.misl.khabarwala.admin.mapper;

import com.misl.khabarwala.admin.domain.Role;
import com.misl.khabarwala.admin.entity.RoleEntity;
import lombok.experimental.Accessors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Accessors(chain = true)
@Component
public class RoleMapper {

    @Autowired
    ModelMapper modelMapper;

    public Role entityToDto(RoleEntity roleEntity) { return modelMapper.map(roleEntity, Role.class); }

    public RoleEntity dtoToEntity(Role role) {
        return modelMapper.map(role, RoleEntity.class);
    }

}
