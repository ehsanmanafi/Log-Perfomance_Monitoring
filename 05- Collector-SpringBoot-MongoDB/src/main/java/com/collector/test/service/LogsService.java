package com.collector.test.service;

import com.collector.test.entity.Logs;
import com.collector.test.repository.LogsRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LogsService {
    private final LogsRepository logsRepository;

    public LogsService(LogsRepository logsRepository) {
        this.logsRepository = logsRepository;
    }
    public Logs SaveLog(Logs log){
        return logsRepository.save(log);
    }
    public Page<Logs> getAllLogs(){
        //make it pageable if you want
        return logsRepository.findAll(Pageable.unpaged());
    }
}
