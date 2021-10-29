package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
   // private final static String FAMILY = "Кошачьи";
   // private final static int KITTENS_COUNT = 1;

    @Test
    public void predatorShouldEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected,actual);
    }

    @Test
    public void shouldGetFamilyPredator() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected,actual);
    }

    @Test
    public void shouldGetKittensOne() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals(expected,actual);
    }
}
