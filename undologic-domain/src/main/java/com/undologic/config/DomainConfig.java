package com.undologic.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by psmelser on 16/06/15.
 */
@Configuration
@ComponentScan({"com.undologic.entities", "com.undologic.service"})
public class DomainConfig {
}
