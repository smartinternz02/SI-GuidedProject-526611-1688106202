package com.externship.appointment.Doctor_storage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DoctorDataLoader implements CommandLineRunner {

    private DoctorRepository doctorRepository;

    @Autowired
    public DoctorDataLoader(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Create and save the default doctor records
    	Doctor doctor2 = new Doctor();
        doctor2.setEmail("doctor2@example.com");
        doctor2.setName("Dr. Jane Smith");
        doctor2.setSpecialization("Dermatology");
        doctor2.setDegree("MD");
        doctor2.setState("New York");
        doctor2.setCity("New York City");
        doctor2.setPassword("password2");
        doctorRepository.save(doctor2);

        Doctor doctor3 = new Doctor();
        doctor3.setEmail("doctor3@example.com");
        doctor3.setName("Dr. Robert Johnson");
        doctor3.setSpecialization("Orthopedics");
        doctor3.setDegree("MD");
        doctor3.setState("Texas");
        doctor3.setCity("Houston");
        doctor3.setPassword("password3");
        doctorRepository.save(doctor3);

        Doctor doctor4 = new Doctor();
        doctor4.setEmail("doctor4@example.com");
        doctor4.setName("Dr. Emily Davis");
        doctor4.setSpecialization("Pediatrics");
        doctor4.setDegree("MD");
        doctor4.setState("Florida");
        doctor4.setCity("Miami");
        doctor4.setPassword("password4");
        doctorRepository.save(doctor4);

        Doctor doctor5 = new Doctor();
        doctor5.setEmail("doctor5@example.com");
        doctor5.setName("Dr. Michael Wilson");
        doctor5.setSpecialization("Neurology");
        doctor5.setDegree("MD");
        doctor5.setState("California");
        doctor5.setCity("San Francisco");
        doctor5.setPassword("password5");
        doctorRepository.save(doctor5);

        System.out.println("Default records added to the database.");
    }
}

