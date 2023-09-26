package com.misl.khabarwala.admin.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public interface BaseController <DOMAIN, ID> {

    @GetMapping
    List <DOMAIN> getAll();

    @GetMapping("{id}")
    Optional <DOMAIN> get(@PathVariable("id") ID id);

    @PostMapping
    ResponseEntity <DOMAIN> save(@RequestBody DOMAIN domain);

    @PutMapping("{id}")
    ResponseEntity <?> update(@RequestBody DOMAIN domain, @PathVariable("id") ID id);

    @DeleteMapping("{id}")
    ResponseEntity <?> delete(@PathVariable("id") ID id);

}
