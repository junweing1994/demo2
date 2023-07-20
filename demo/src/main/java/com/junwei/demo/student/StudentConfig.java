package com.junwei.demo.student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student paul = new Student(
                "paul",
                "paul@gmail.com",
                LocalDate.of(2000, Month.JANUARY, 5),
                21
        );

            Student alex = new Student(
                    "alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 11),
                    21
            );
            repository.saveAll(
                    List.of(paul, alex)
            );
        };
    }
}
