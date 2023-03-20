package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {

    @Test
    public void getMeowSoundCatTest() {
        Cat cat = new Cat(new Feline());
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getTypeOfFoodCatTest() throws Exception {
        Cat cat = new Cat(new Feline());
        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), cat.getFood());
    }

}