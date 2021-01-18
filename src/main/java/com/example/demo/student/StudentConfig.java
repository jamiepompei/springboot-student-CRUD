package com.example.demo.student;


import java.util.Arrays;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;


import static java.time.Month.*;

@Configuration
public class StudentConfig {



    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, JANUARY, 5)
            );

            Student kyle = new Student(
                    "Kyle",
                    "kyle.grace@gmail.com",
                    LocalDate.of(2000, FEBRUARY, 17)
            );

            studentRepository.saveAll(
                    Arrays.asList(mariam, kyle)
            );
        };
    }
}
