package com.github.pedrobacchinni.initjpql.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Entity
@ToString
@EqualsAndHashCode(of = "id")
public class Domain {

    @Id
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "domain")
    @ToString.Exclude
    private List<User> users;
}
