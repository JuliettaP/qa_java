package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getFood() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"),new Lion("Самец", feline).getFood());
    }

    @Test
    public void getKittens() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1,new Lion("Самка", feline).getKittens());
    }
}
