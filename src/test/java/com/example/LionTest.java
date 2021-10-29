package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class LionTest {

//для теста использовать параметразацию для другого не использовать
    @Test
    public void shouldGetFoodPredator() throws Exception {
        Lion lion = new Lion(true,new Feline());
        List<String> actual = lion.getFood();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected,actual);
    }

    @Test
    public void shouldGetKittensOne() {
        Lion lion = new Lion(true, new Feline());
        int actual = lion.getKittens();
        int expected = 1;
        assertEquals(expected,actual);
    }

}
