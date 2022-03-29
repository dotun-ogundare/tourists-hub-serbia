package com.scm.ftn.tourist.entity;

import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "country")
@Getter
@Setter
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    //set up one-to-many for states
    @OneToMany(mappedBy = "country")
    @JsonIgnore //ensures states is not returned when http request is made to country
    private List<State> states;

}
