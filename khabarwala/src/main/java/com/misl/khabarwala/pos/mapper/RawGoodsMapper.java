package com.misl.khabarwala.pos.mapper;

import com.misl.khabarwala.pos.domain.RawGoods;
import com.misl.khabarwala.pos.entity.RawGoodsEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RawGoodsMapper {

    @Autowired
    ModelMapper modelMapper;

    public RawGoods entityToDto(RawGoodsEntity rawGoodsEntity) { return modelMapper.map(rawGoodsEntity, RawGoods.class); }

    public RawGoodsEntity dtoToEntity(RawGoods rawGoods) {
        return modelMapper.map(rawGoods, RawGoodsEntity.class);
    }
}
