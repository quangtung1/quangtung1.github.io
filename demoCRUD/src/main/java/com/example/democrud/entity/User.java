package com.example.democrud.entity;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "user")
public class User {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    private String name;

    private String email;

    private String phone;

    private String avatar;

    private String password;
}
