package com.ohgiraffers.springdatajpa;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Chap05SpringDataJpaLectureSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chap05SpringDataJpaLectureSourceApplication.class, args);
    }

    /* 설명. ModelMapper를 사용하기 위해 Bean 생성해야한다 */
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
