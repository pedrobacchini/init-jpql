package com.github.pedrobacchinni.initjpql.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class UserDTO {

    private int id;

    private int login;

    private String nome;
}
