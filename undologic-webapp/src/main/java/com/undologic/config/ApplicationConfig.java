package com.undologic.config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by psmelser on 03/06/15.
 */
@Configuration
@Import({DataConfiguration.class, DomainConfig.class})
@PropertySource(value = { "classpath:application.properties" })
public class ApplicationConfig {

    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        PropertySourcesPlaceholderConfigurer config = new PropertySourcesPlaceholderConfigurer();
        config.setIgnoreUnresolvablePlaceholders(Boolean.TRUE);
        config.setLocation(new ClassPathResource("application.properties"));
        return config;
    }


}
