package com.log_generator.log_generator.service;

import com.log_generator.log_generator.entity.Generator;
import com.log_generator.log_generator.repository.GeneratorRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GeneratorService {
    private final GeneratorRepository generatorRepository;

    public GeneratorService(GeneratorRepository generatorRepository) {
        this.generatorRepository = generatorRepository;
    }
    public Page<Generator> getAllGenerator(){
        //make it pageable if necessary
        return generatorRepository.findAll(Pageable.unpaged());
    }
}
