package com.misl.khabarwala.admin.serviceImpl;

import com.misl.khabarwala.admin.domain.User;
import com.misl.khabarwala.admin.entity.UserEntity;
import com.misl.khabarwala.admin.mapper.UserMapper;
import com.misl.khabarwala.admin.reository.EmployeeRepository;
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
    EmployeeRepository employeeRepository;

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findAll() {
        List<UserEntity> users =  userRepository.findAll();
        return users.stream().map(userMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public Optional<User> findById(Long id) {
        UserEntity user = userRepository.findById(id).orElseThrow(()-> new RuntimeException("Id not found!"));
        return Optional.of(userMapper.toDto(user));
    }

    @Override
    public void updateEntity(User user, Long id) {

        UserEntity userEntity = userRepository.findById(id).orElseThrow( ()-> new RuntimeException("User not found."));
        userEntity.setUserName(user.getUserName())
        	.setPassword(user.getPassword())
        	.setEmployee(user.getEmployee());
        userRepository.save(userEntity);
    }

    @Override
    public void deleteEntity(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User saveEntity(User user) {

        UserEntity userEntity;

        if(user.getEmployee().getId() != null && employeeRepository.existsById(user.getEmployee().getId())){
            userEntity = userMapper.toEntity(user);
            userRepository.save(userEntity);
        }else {
            throw new RuntimeException("Employee not found, please create an employee first.");
        }

        return userMapper.toDto(userEntity);
    }

}
