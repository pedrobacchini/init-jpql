package com.github.pedrobacchinni.initjpql.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Entity
@EqualsAndHashCode(of = "id")
public class Domain {

    @Id
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "domain")
    private List<User> users;
}
