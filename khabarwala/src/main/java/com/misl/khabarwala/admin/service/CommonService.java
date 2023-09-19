package com.misl.khabarwala.admin.service;

import com.misl.khabarwala.admin.entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;

public interface CommonService <ENTITY, ID>{

    List<ENTITY> findAll();
    Optional<EmployeeEntity> findById(ID id);
    void updateEntity(ENTITY entity);
    void deleteEntity(ID id);
    ENTITY saveEntity(ENTITY entity);


}
