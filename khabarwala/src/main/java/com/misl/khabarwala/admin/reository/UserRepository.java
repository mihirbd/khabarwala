package com.misl.khabarwala.admin.reository;

import com.misl.khabarwala.admin.entity.EmployeeEntity;
import com.misl.khabarwala.admin.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends RevisionRepository<UserEntity, Long, Long>, JpaRepository<UserEntity, Long> {

}
