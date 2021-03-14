package ru.telda;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("ru.telda.mapper")
public class RegionCatalogApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegionCatalogApplication.class, args);
    }

}
