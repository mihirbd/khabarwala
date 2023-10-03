package com.misl.khabarwala.admin.reository;

import com.misl.khabarwala.admin.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends RevisionRepository<EmployeeEntity, Long, Long>, JpaRepository<EmployeeEntity, Long> {
}
