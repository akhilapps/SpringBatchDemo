

package com.java.spring.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableBatchProcessing
public class BatchApplication extends SpringBootServletInitializer {
    
    private static final Logger logger = LoggerFactory.getLogger(BatchApplication.class);
    
    public static void main(String[] args) {
        SpringApplication.run(BatchApplication.class, args);
    }
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        logger.debug("Debug Message Logged de !!!");
        return builder.sources(BatchApplication.class);
    }
    
}
