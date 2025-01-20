# Log-Performance Monitoring

This project is a system for monitoring logs and application performance in Spring Boot. Also, it helps you track logs and analyze performance in real-time.
Minimal code for Backend (LogGenerator-SpringBoot-MySQL) and consumer part (Collector-SpringBoot-MongoDB) just to focus more on the scenario.

## Features:
- **Log Monitoring:** View and store execution logs.
- **Performance Analysis:** Measure method execution time and provide detailed reports.

## Environments:
1. Flunet-bit 
2. ElasticAPM
3. ElasticSerach
4. Kibana
5. Kafka
6. SpringBoot
7. MySQL
8. MongoDB

## Installation Procedure:
1. Check for the availability of 2020, 9200, 8200, 2181, 29092, 8282, 27017, 8080 ports
2. Run Fluent-bit By Command in "01-Fluent-bit Config" Folder
3. Run ElasticAPM and ElasticSearach and ElasticKibana by their commands in "02- Elastic Stack Config" folder.
4. run kafka and zookeeper with docker compose file in "03- Kafka Docker Composer" folder
4. Download and run Log Generator App(04- LogGenerator-SpringBoot-MySQL)
5. Download and run a sample collector for kafka (05- Collector-SpringBoot-MongoDB)

   
## Prerequisites:
- Java 11+
- Maven 3.6+
- Spring Boot framework

## Installation & Usage:
1. Clone the repository:
   ```bash
   git clone https://github.com/ehsanmanafi/Log-Performance_Monitoring.git
   cd Log-Performance_Monitoring



