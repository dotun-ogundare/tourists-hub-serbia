package com.scm.ftn.tourist.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String street;

    private String city;

    private String state;

    private String country;

    private String zipCode;

    @OneToOne
    @PrimaryKeyJoinColumn //joining based on the primary key of the order and the primary key of the address
    private Order order;
}
