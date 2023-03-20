package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void lionGenderTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void getLionDoNotHaveKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertEquals(0, lion.getKittens());
    }

    @Test
    public void getLionDoNotHaveKittensNoMan() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertEquals(0, lion.getKittens());
    }

    @Test
    public void getLionTFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void getLionTypeOfFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        assertTrue( lion.getFood().contains("Птицы"));
    }

    @Test(expected = AssertionError.class)
    public void exceptionMessageErrorTest() throws AssertionError {
        try {
            Lion lion = new Lion(" fgjkjfg", feline);
        }
        catch (Exception thrown) {
            Assert.assertNotEquals("Используйте допустимые значения пола животного - самец или самка", thrown.getMessage());
        }
    }

}