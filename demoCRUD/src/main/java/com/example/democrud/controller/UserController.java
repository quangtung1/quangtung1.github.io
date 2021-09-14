package com.example.democrud.controller;

import com.example.democrud.model.dto.UserDTO;
import com.example.democrud.model.request.CreateUse;
import com.example.democrud.model.request.UpdateUser;
import com.example.democrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
@Autowired private UserService userService;
    @PostMapping("/create")
    public ResponseEntity<?> createUser(@RequestBody CreateUse user){
        UserDTO result= userService.create(user);
        return ResponseEntity.ok(result);
    }
    @GetMapping("/read")
    public ResponseEntity<?> readUser(){
        List<UserDTO> result = userService.read();
        return ResponseEntity.ok(result);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@RequestBody UpdateUser user, @PathVariable Long id){
        UserDTO result = userService.update(user,id);
        return ResponseEntity.ok(result);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        userService.delete(id);
        return ResponseEntity.ok("Delete successful");
    }
}
