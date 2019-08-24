package ru.geekbrains.spring.extraconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"ru.geekbrains.spring.extraconfig"})
public class ExtraConfig {
    @Bean
    public TestServiceA testServiceNewA() {
        return new TestServiceA();
    }

    @Bean
    public TestServiceB testServiceNewB() {
        return new TestServiceB();
    }
}