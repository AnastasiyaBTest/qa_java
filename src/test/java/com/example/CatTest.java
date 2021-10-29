package com.example;

import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {

    @Mock
    Feline predator;

    //Тест проверяет, что метод возвращает "Мяу"
    @Test
    public void shouldGetSoundMeow() {
        Cat cat = new Cat(predator);
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals(expected,actual);
    }

    //Тест проверяет, что метод возвращает список еды
    @Test
    public void shouldGetFoodForPredator() throws Exception {
        Cat cat = new Cat(new Feline());
        List<String> actual = cat.getFood();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected,actual);
    }



}
