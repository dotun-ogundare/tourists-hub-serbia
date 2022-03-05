package com.scm.ftn.tourist.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product_location")
@Getter
@Setter
public class ProductLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "location_name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "location")
    private Set<Product> products;

}
