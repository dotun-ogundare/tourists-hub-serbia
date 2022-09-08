package com.scm.ftn.tourist.dao;

import com.scm.ftn.tourist.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin("http://localhost:4200")
//@CrossOrigin // this will allow any website
//@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {

    //query method: select * from product where categoryid is
    Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);

    //Page<Product> findByNameContaining(@RequestParam("name") String name, Pageable pageable);
    Page<Product> findByNameContainingIgnoreCase(@RequestParam("name") String name, Pageable pageable);

}
