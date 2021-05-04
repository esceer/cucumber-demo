package com.example.cucumber.clients;

import org.springframework.stereotype.Component;

@Component
public class FooClient {

    public void createFoo() {
        System.out.println("Created Foo");
    }

    public boolean existsFoo() {
        return true;
    }

    public boolean notExistsFoo() {
        return true;
    }
}
