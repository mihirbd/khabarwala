package com.misl.khabarwala.admin.reository;

import com.misl.khabarwala.admin.entity.EmployeeEntity;
import com.misl.khabarwala.admin.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends RevisionRepository<RoleEntity, Long, Long>, JpaRepository<RoleEntity, Long> {

}
