package com.github.pedrobacchinni.initjpql.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Getter
@Entity
@EqualsAndHashCode(of = "id")
public class Configuration {

    @Id
    private Integer id;

    @MapsId
    @OneToOne
    private User user;

    private boolean receiveNotification;

    private boolean finishSessionAutomatic;
}
