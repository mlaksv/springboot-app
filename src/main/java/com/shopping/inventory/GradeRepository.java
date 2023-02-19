package com.shopping.inventory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends CrudRepository<Grade, Long> {
    
}
