package com.example.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.activation.DataSource;

@SpringBootApplication
@ImportResource(value = "provider.xml")
@EnableTransactionManagement
public class ProviderApplication /*implements CommandLineRunner*/ {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
        //SpringApplication.run(ProviderApplication  .class, args);
        System.out.println("启动成功");
    }
    /*@Autowired
    DataSource dataSource;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("DATASOURCE = " + dataSource);
    }*/

}
