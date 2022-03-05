package com.scm.ftn.tourist.dao;

import com.scm.ftn.tourist.entity.ProductLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "productLocation", path = "product-location")
public interface ProductLocationRepository extends JpaRepository<ProductLocation, Long> {
}
