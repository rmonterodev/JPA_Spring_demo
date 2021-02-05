package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    final Month JANUARY = Month.JANUARY;
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {


            Student mariam = new Student(
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000, JANUARY, 5)
            );

            Student alex = new Student(
                    "David",
                    "david@gmail.com",
                    LocalDate.of(2004, JANUARY, 5)
            );

            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}
