package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    @Mock
    Feline feline;

    //проверка получения друзей Алекса
    @Test
    public void getFriendsForAlex() throws Exception {
        Alex alex = new Alex();
        List<String> actual = alex.getFriends();
        List<String> expected = Arrays.asList("Марти", "Глория", "Мелман");
        assertEquals(expected,actual);
    }

    //проверка получения места обитания Алекса
    @Test
    public void getPlaceOfLivingForAlex() throws Exception {
        Alex alex = new Alex();
        String actual = alex.getPlaceOfLiving();
        String expected = "Нью-Йоркский Зоопарк";
        assertEquals(expected,actual);
    }

    //проверка, что у Алекса нет котят
    @Test
    public void getKittensForAlexZero() throws Exception {
        Alex alex = new Alex(true,feline);
        Mockito.when(feline.getKittens(0)).thenReturn(0);
        int actual = alex.getKittens();
        int expected = 0;
        assertEquals(expected,actual);
    }

}
