package com.match.match.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class User {

    private Integer id;

    private String name;

    private String lastname;

    private String email;

    private String password;

}
