package com.collector.test;

import com.collector.test.entity.Logs;
import com.collector.test.service.LogsService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    private final LogsService logsService;

    public KafkaListeners(LogsService logsService) {
        this.logsService = logsService;
    }

    @KafkaListener(topics = "app-error-logs", groupId = "groupId")
    void listener(ConsumerRecord<String,String> data) {
        logsService.SaveLog(Logs.builder().logMessage(data.value()).build());
        System.out.println("Listener received: " + data.value() + " ");
    }

}
