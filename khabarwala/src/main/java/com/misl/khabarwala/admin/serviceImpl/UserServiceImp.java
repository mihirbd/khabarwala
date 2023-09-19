package com.misl.khabarwala.admin.serviceImpl;

import com.misl.khabarwala.admin.domain.User;
import com.misl.khabarwala.admin.entity.EmployeeEntity;
import com.misl.khabarwala.admin.entity.UserEntity;
import com.misl.khabarwala.admin.mapper.UserMapper;
import com.misl.khabarwala.admin.reository.UserRepository;
import com.misl.khabarwala.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> findAll() {
        List<UserEntity> alluser=  userRepository.findAll();
        return alluser.stream().map(userMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public Optional<EmployeeEntity> findById(Long aLong) {

        return Optional.empty();
    }

    @Override
    public void updateEntity(User user) {
        UserEntity userEntity = userMapper.toEntity(user);
        userRepository.save(userEntity);

    }

    @Override
    public void deleteEntity(Long aLong) {


    }

    @Override
    public User saveEntity(User user) {
        UserEntity userEntity = userMapper.toEntity(user);
        userRepository.save(userEntity);
        return userMapper.toDto(userEntity);
    }


}
