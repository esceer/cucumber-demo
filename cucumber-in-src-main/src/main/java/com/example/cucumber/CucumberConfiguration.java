package com.example.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootTest(classes = CucumberConfiguration.class)
@CucumberContextConfiguration
public class CucumberConfiguration {
}
