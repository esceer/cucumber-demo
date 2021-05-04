package com.example.cucumber;

import io.cucumber.core.cli.Main;

public class CucumberApplication {

    public static void main(final String[] runtimeArgs) {
        Main.main("classpath:features",
                "--glue", "com.example.cucumber",
                "--plugin", "pretty");
    }
}
