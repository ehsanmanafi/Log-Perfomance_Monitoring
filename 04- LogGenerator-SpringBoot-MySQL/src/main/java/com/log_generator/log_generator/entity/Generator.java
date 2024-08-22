package com.log_generator.log_generator.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "generator")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Generator {
    @Id
    Long id;
    String generator_name;
    String generator_date;
}
