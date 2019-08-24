package ru.geekbrains.spring.extraconfig;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({"ru.geekbrains.spring.extraconfig"})
@Import({ExtraConfig.class})
public class MainConfig {
}