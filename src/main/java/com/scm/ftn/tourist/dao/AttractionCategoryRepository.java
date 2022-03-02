package com.scm.ftn.tourist.dao;

import com.scm.ftn.tourist.entity.AttractionCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "attractionCategory", path = "attraction-category")
public interface AttractionCategoryRepository extends JpaRepository<AttractionCategory, Long> {
}
