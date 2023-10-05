package com.misl.khabarwala.pos.repository;

import com.misl.khabarwala.pos.entity.RawGoodsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;

public interface RawGoodsRepository extends RevisionRepository<RawGoodsEntity, Long, Long>, JpaRepository<RawGoodsEntity, Long> {
}
