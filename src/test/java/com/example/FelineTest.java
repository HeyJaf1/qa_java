package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void getNutritionFeline() throws Exception {
        Feline feline = new Feline();
        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), feline.getFood("Хищник"));
    }

    @Test
    public void getGenealogyFelineTest() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittenValueFelineTest() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }
}