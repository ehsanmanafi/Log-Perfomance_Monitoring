package com.log_generator.log_generator.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class LoggingData {
    String _id;
    String source;
    String user;
    String start_time;
    String end_time;
}
