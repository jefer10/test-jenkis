package com.example.pruebajenkis.Repit;
import org.junit.jupiter.api.Test;

import org.junit.Assert;
//import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class RepetirTest {
    private MockMvc mvc;


    @Test
    public void test_Repeat() {
        Assert.assertEquals("holaholahola",Repetir.repeat("hola",3));
    }

    @Test
    public void repeat_string_once(){
        Assert.assertEquals("hola",Repetir.repeat("hola",1));
    }

    @Test//cuando lo esparado es una exepcion
    public void repeat_string_negativa(){
        Assert.assertThrows(IllegalArgumentException.class,()->{
            Repetir.repeat("hola",-1);
        });
    }

}