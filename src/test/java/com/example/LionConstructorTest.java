package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionConstructorTest {

    @Mock
    Feline feline;

    @Test(expected = Exception.class)
    public void run() throws Exception {
        Lion lion = new Lion("сОмка", feline);
    }

}
