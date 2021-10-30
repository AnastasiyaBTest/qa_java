package com.example;

import org.junit.Test;

public class AnimalExceptionTest {

    @Test(expected = Exception.class)
    public void getFoodWithOtherParamThrowsException() throws Exception{
        Animal animal = new Animal();
        animal.getFood("Human");
    }
}
