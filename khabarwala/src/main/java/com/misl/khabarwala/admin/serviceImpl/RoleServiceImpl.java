package com.misl.khabarwala.admin.serviceImpl;

import com.misl.khabarwala.admin.domain.Role;
import com.misl.khabarwala.admin.entity.RoleEntity;
import com.misl.khabarwala.admin.mapper.RoleMapper;
import com.misl.khabarwala.admin.reository.RoleRepository;
import com.misl.khabarwala.admin.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    RoleMapper roleMapper;


    @Override
    public List<Role> findAll() {
        List<RoleEntity> roles = roleRepository.findAll();
        return roles.stream().map(roleMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public Optional<Role> findById(Long id) {
       RoleEntity role = roleRepository.findById(id).orElseThrow(RuntimeException::new);
        return Optional.of(roleMapper.entityToDto(role));
    }

    @Override
    public void updateEntity(Role role, Long id) {
        RoleEntity fetchRole = roleRepository.findById(id).orElseThrow(RuntimeException::new);
        fetchRole.setRole(role.getRole());
        roleRepository.save(fetchRole);
    }

    @Override
    public void deleteEntity(Long id) {
        roleRepository.deleteById(id);
    }

    @Override
    public Role saveEntity(Role role) {
        RoleEntity roleEntity = roleMapper.dtoToEntity(role);
        roleRepository.save(roleEntity);
        return roleMapper.entityToDto(roleEntity);
    }
}
