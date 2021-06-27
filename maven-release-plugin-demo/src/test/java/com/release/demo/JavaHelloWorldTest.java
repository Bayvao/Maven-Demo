package com.release.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaHelloWorldTest {

    @Test
    void getHello() {
        System.out.println(new JavaHelloWorld().getHello());
    }
}