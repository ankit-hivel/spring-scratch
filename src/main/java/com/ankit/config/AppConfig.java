package com.ankit.config;

import com.ankit.Laptop;
import com.ankit.Programmer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "programmer")
    public Programmer programmer(@Qualifier("lap1") Laptop lap) {
        Programmer pg = new Programmer();
        pg.setAge(41);
        pg.setLaptop(lap);
        return pg;
    }

    @Bean(name = "lap1")
//    @Primary
    @Scope(value = "prototype")
    public Laptop laptop() {
        return new Laptop();
    }
}
