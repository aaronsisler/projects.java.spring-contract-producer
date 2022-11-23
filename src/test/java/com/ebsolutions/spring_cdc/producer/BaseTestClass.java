package com.ebsolutions.spring_cdc.producer;

import com.ebsolutions.spring_cdc.producer.controller.EvenOddController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Application.class)

public class BaseTestClass {

    @Autowired
    private EvenOddController evenOddController;

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(evenOddController);
    }
}
