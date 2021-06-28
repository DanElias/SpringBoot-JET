package com.crm.crm.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoLoader implements CommandLineRunner {
    private final ContactRepository repository;

    @Autowired
    public DemoLoader(ContactRepository repository) {
        this.repository = repository;
    }

    // Demo script that create a new entry in the db
    @Override
    public void run(String... strings) throws Exception{
        this.repository.save(new Contact("Emmanuel", "Henri", "me@me.com"));
    }
}
