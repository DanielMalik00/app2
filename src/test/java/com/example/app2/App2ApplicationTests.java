package com.example.app2;

import org.junit.Test;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;

public class App2ApplicationTests {

    @Test
    public void added() {
        App2Application app2Application = new App2Application();
        assertEquals(10, app2Application.added(5,5));
    }
}