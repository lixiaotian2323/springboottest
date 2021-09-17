package com.example.provider;


import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;

@SpringBootTest
@ImportResource(value = "provider.xml")
class ProviderApplicationTests {

    @Test
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
        System.out.println("启动成功");
    }
}
