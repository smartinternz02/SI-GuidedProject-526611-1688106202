package com.externship.appointment.Person_storage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private PersonRepository personRepository;

    @Autowired
    public DataLoader(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Create and save the default person records
        Person person1 = new Person();
        person1.setEmail("person1@example.com");
        person1.setPassword("password1");
        personRepository.save(person1);

        Person person2 = new Person();
        person2.setEmail("person2@example.com");
        person2.setPassword("password2");
        personRepository.save(person2);

        Person person3 = new Person();
        person3.setEmail("person3@example.com");
        person3.setPassword("password3");
        personRepository.save(person3);

        Person person4 = new Person();
        person4.setEmail("person4@example.com");
        person4.setPassword("password4");
        personRepository.save(person4);

        Person person5 = new Person();
        person5.setEmail("person5@example.com");
        person5.setPassword("password5");
        personRepository.save(person5);

        System.out.println("Default records added to the database.");
    }
}
