package com.misl.khabarwala.admin.service;

import java.util.List;
import java.util.Optional;

public interface CommonService <ENTITY, ID>{

    List<ENTITY> findAll();
    Optional<ENTITY> findById(ID id);
    void updateEntity(ENTITY entity, ID id);
    void deleteEntity(ID id);
    ENTITY saveEntity(ENTITY entity);


}
