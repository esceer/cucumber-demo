package com.example.cucumber.clients;

import org.springframework.stereotype.Component;

@Component
public class BarClient {

    public void createBar() {
        System.out.println("Created Bar");
    }

    public boolean existsBar() {
        return true;
    }

    public boolean notExistsBar() {
        return true;
    }
}
