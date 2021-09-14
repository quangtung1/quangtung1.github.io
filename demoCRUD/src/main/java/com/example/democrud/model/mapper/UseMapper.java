package com.example.democrud.model.mapper;

import com.example.democrud.entity.User;
import com.example.democrud.model.dto.UserDTO;

public class UseMapper {
    public static UserDTO toUser(User user) {
        UserDTO tmp = new UserDTO();
        tmp.setId(user.getId());
        tmp.setName(user.getName());
        tmp.setEmail(user.getEmail());
        tmp.setPhone(user.getPhone());
        tmp.setAvatar(user.getAvatar());
        return  tmp;
    }
}
