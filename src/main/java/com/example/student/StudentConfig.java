package com.example.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.APRIL;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student riyaz = new Student(
                    "Riyaz Pasha",
                    "test@mail.com",
                    LocalDate.of(1998, APRIL, 24),
                    23
            );
            Student romeo = new Student(
                    "Romeo",
                    "test2@mail.com",
                    LocalDate.of(1998, APRIL, 24),
                    23
            );

            repository.saveAll(List.of(riyaz, romeo));
        };
    }
}
