package com.example.democrud.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateUse {
    private long id;

    private String name;

    private String email;

    private String phone;

    private String avatar;

    private String password;
}
