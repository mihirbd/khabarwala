package com.misl.khabarwala.pos.repository;

import com.misl.khabarwala.pos.entity.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends RevisionRepository<SupplierEntity, Long, Long>, JpaRepository<SupplierEntity, Long>{
}

