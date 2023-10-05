package com.misl.khabarwala.pos.service.impl;

import com.misl.khabarwala.configuration.exception.IdNotFoundException;
import com.misl.khabarwala.pos.domain.RawGoods;
import com.misl.khabarwala.pos.entity.RawGoodsEntity;
import com.misl.khabarwala.pos.mapper.RawGoodsMapper;
import com.misl.khabarwala.pos.repository.RawGoodsRepository;
import com.misl.khabarwala.pos.service.RawGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RawGoodsServiceImpl implements RawGoodsService {

    @Autowired
    RawGoodsRepository rawGoodsRepository;

    @Autowired
    RawGoodsMapper rawGoodsMapper;


    @Override
    public List<RawGoods> findAll() {

        List<RawGoodsEntity> rawGoodsEntities = rawGoodsRepository.findAll();

        return rawGoodsEntities.stream().map(rawGoodsMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public Optional<RawGoods> findById(Long id) {
        RawGoodsEntity rawGoods = rawGoodsRepository.findById(id).orElseThrow(()-> new IdNotFoundException("Raw Goods id not found."));
        return Optional.of(rawGoodsMapper.entityToDto(rawGoods));
    }

    @Override
    public void updateEntity(RawGoods rawGoods, Long id) {
        RawGoodsEntity rawGoodsEntity = rawGoodsRepository.findById(id).orElseThrow(()-> new IdNotFoundException("Raw Goods id not found."));
        rawGoodsEntity.setName(rawGoods.getName())
        	.setCode(rawGoods.getCode())
        	.setStock(rawGoods.getStock())
        	.setUnit(rawGoods.getUnit());
        rawGoodsRepository.save(rawGoodsEntity);
    }

    @Override
    public void deleteEntity(Long id) {
        rawGoodsRepository.deleteById(id);
    }

    @Override
    public RawGoods saveEntity(RawGoods rawGoods) {
       RawGoodsEntity rawGoodsEntity = rawGoodsRepository.save(rawGoodsMapper.dtoToEntity(rawGoods));
        return rawGoodsMapper.entityToDto(rawGoodsEntity);
    }
}
