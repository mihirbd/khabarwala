package com.misl.khabarwala.pos.controller;

import com.misl.khabarwala.admin.controller.BaseController;
import com.misl.khabarwala.pos.domain.Supplier;
import com.misl.khabarwala.pos.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("suppliers")
public class SupplierController implements BaseController<Supplier, Long> {

    @Autowired
    SupplierService supplierService;

    @Override
    public List<Supplier> getAll() {
        return supplierService.findAll();
    }

    @Override
    public Optional<Supplier> get(Long id) {
        return supplierService.findById(id);
    }

    @Override
    public ResponseEntity<Supplier> save(Supplier supplier) {
        return ResponseEntity.ok(supplierService.saveEntity(supplier));
    }

    @Override
    public ResponseEntity<?> update(Supplier supplier, Long id) {
        supplierService.updateEntity(supplier, id);
        return status(HttpStatus.ACCEPTED).body(null);
    }

    @Override
    public ResponseEntity<?> delete(Long id) {
        supplierService.deleteEntity(id);
        return status(HttpStatus.ACCEPTED).body(null);
    }
}
