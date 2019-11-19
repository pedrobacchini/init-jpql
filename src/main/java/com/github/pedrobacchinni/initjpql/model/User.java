package com.github.pedrobacchinni.initjpql.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name="\"user\"")
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    private Integer id;

    private String username;

    private String password;

    private String name;

    private LocalDateTime lastAccess;

    @ManyToOne
    private Domain domain;

    @OneToOne
    private Configuration configuration;
}
