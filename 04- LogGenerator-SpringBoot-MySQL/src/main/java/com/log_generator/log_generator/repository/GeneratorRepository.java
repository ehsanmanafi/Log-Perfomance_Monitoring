package com.log_generator.log_generator.repository;

import com.log_generator.log_generator.entity.Generator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneratorRepository extends JpaRepository<Generator,Long> {
}
