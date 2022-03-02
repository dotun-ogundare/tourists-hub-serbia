package com.scm.ftn.tourist.dao;

import com.scm.ftn.tourist.entity.Attraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttractionRepository extends JpaRepository<Attraction, Long> {
}
