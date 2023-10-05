package com.misl.khabarwala.pos.controller;

import com.misl.khabarwala.admin.controller.BaseController;
import com.misl.khabarwala.pos.domain.RawGoods;
import com.misl.khabarwala.pos.service.RawGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("rawGoods")
public class RawGoodsController implements BaseController<RawGoods, Long> {

    @Autowired
    RawGoodsService rawGoodsService;

    @Override
    public List<RawGoods> getAll() {
        return rawGoodsService.findAll();
    }

    @Override
    public Optional<RawGoods> get(Long id) {
        return rawGoodsService.findById(id);
    }

    @Override
    public ResponseEntity<RawGoods> save(RawGoods rawGoods) {
        return ResponseEntity.ok(rawGoodsService.saveEntity(rawGoods));
    }

    @Override
    public ResponseEntity<?> update(RawGoods rawGoods, Long id) {
        rawGoodsService.updateEntity(rawGoods, id);
        return status(HttpStatus.ACCEPTED).body(null);
    }

    @Override
    public ResponseEntity<?> delete(Long id) {
        rawGoodsService.deleteEntity(id);
        return status(HttpStatus.ACCEPTED).body(null);
    }
}
