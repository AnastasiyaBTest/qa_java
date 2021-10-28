package com.example;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {

    @Test
    public void shouldGetSoundMeow() {
        Cat cat = new Cat(new Feline());
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals(expected,actual);
    }

    @Test
    public void shouldGetFoodPredator() throws Exception {
        Cat cat = new Cat(new Feline());
        List<String> actual = cat.getFood();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected,actual);
    }



}
