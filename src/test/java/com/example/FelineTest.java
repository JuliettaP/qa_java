package com.example;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void eatMeat() throws Exception {
        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"),new Feline().eatMeat());
    }

    @Test
    public void getFamily() {
        assertEquals("Кошачьи", new Feline().getFamily());
    }

    @Test
    public void getKittens() {
        assertEquals(1,new Feline().getKittens());
        assertEquals(2,new Feline().getKittens(2));
        assertEquals(0,new Feline().getKittens(0));
    }
}

