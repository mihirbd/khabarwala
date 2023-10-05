package com.misl.khabarwala.pos.mapper;

import com.misl.khabarwala.pos.domain.Supplier;
import com.misl.khabarwala.pos.entity.SupplierEntity;
import lombok.experimental.Accessors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Accessors(chain = true)
@Component
public class SupplierMapper {
    @Autowired
    ModelMapper modelMapper;

    public Supplier entityToDto(SupplierEntity supplierEntity) { return modelMapper.map(supplierEntity, Supplier.class); }

    public SupplierEntity dtoToEntity(Supplier supplier) {
        return modelMapper.map(supplier, SupplierEntity.class);
    }

}
