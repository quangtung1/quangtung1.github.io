package com.example.democrud.service;

import com.example.democrud.entity.User;
import com.example.democrud.model.dto.UserDTO;
import com.example.democrud.model.mapper.UseMapper;
import com.example.democrud.model.request.CreateUse;
import com.example.democrud.model.request.UpdateUser;
import com.example.democrud.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public UserDTO create(CreateUse cre) {
        User user = new User();
        user.setName(cre.getName());
        user.setEmail(cre.getEmail());
        user.setPassword(cre.getPassword());
        user.setPhone(cre.getPhone());
        user.setAvatar(cre.getAvatar());
        userRepo.save(user);
        return UseMapper.toUser(user);
    }

    public List<UserDTO> read() {
        List<User> users = userRepo.findAll();
        List<UserDTO> result = new ArrayList<UserDTO>();
        for (User user : users) {
            result.add(UseMapper.toUser(user));
        }
        return result;
    }

    public UserDTO update(UpdateUser up, Long id) {
        Optional<User> result = userRepo.findById(id);
        if (result.isEmpty()) {
            System.out.println("NOT FOUND ID");
        }

        User user = result.get();
        user.setName(up.getName());
        user.setEmail(up.getEmail());
        user.setPassword(up.getPassword());
        user.setPhone(up.getPhone());
        user.setAvatar(up.getAvatar());
        userRepo.save(user);
        return UseMapper.toUser(user);
    }
    public void delete(Long id){
        Optional<User> result = userRepo.findById(id);
        if (result.isEmpty()) {
            System.out.println("NOT FOUND ID");
        }
        userRepo.deleteById(id);
    }
}