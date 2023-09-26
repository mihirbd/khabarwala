package com.misl.khabarwala.admin.controller;

import com.misl.khabarwala.admin.domain.Role;
import com.misl.khabarwala.admin.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    RoleService roleService;

    @GetMapping
    public List<Role> getAllRole(){
        return roleService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Role> getRole(@PathVariable("id") Long id){
        return roleService.findById(id);
    }

    @PostMapping
    public Role saveRole(@RequestBody Role role){
        return roleService.saveEntity(role);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateRole(@RequestBody Role role, @PathVariable("id") Long id){
        roleService.updateEntity(role, id);
        return status(HttpStatus.OK).body(null);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteRole(Long id){
        roleService.deleteEntity(id);
        return status(HttpStatus.ACCEPTED).body(null);
    }

}
