package com.example;

import org.junit.runner.RunWith;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline predator;

    @Test
    public void getSound() {
        assertEquals("Мяу",new Cat(predator).getSound());
    }

    @Test
    public void getFood() throws Exception {
        Mockito.when(predator.eatMeat()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), new Cat(predator).getFood());
    }
}
