package com.misl.khabarwala.pos.service.impl;

import com.misl.khabarwala.configuration.exception.IdNotFoundException;
import com.misl.khabarwala.pos.domain.Supplier;
import com.misl.khabarwala.pos.entity.SupplierEntity;
import com.misl.khabarwala.pos.mapper.SupplierMapper;
import com.misl.khabarwala.pos.repository.SupplierRepository;
import com.misl.khabarwala.pos.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    SupplierRepository supplierRepository;

    @Autowired
    SupplierMapper supplierMapper;


    @Override
    public List<Supplier> findAll() {

        List<SupplierEntity> supplierEntities = supplierRepository.findAll();

        return supplierEntities.stream().map(supplierMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public Optional<Supplier> findById(Long id) {
        SupplierEntity supplier = supplierRepository.findById(id).orElseThrow(()-> new IdNotFoundException("Supplier id not found."));
        return Optional.of(supplierMapper.entityToDto(supplier));
    }

    @Override
    public void updateEntity(Supplier supplier, Long id) {
        SupplierEntity supplierEntity = supplierRepository.findById(id).orElseThrow(()-> new IdNotFoundException("Supplier id not found."));
        supplierEntity.setName(supplier.getName())
        	.setOrganization(supplier.getOrganization())
        	.setPhone(supplier.getPhone())
        	.setAddress(supplier.getAddress())
        	.setMaterialType(supplierEntity.getMaterialType());
        supplierRepository.save(supplierEntity);
    }

    @Override
    public void deleteEntity(Long id) {
        supplierRepository.deleteById(id);
    }

    @Override
    public Supplier saveEntity(Supplier supplier) {
       SupplierEntity supplierEntity = supplierRepository.save(supplierMapper.dtoToEntity(supplier));
        return supplierMapper.entityToDto(supplierEntity);
    }
}
