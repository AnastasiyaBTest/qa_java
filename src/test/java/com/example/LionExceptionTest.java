package com.example;

import org.junit.Test;


public class LionExceptionTest {

    //Проверка исключения при создании льва с определенным полом
    @Test(expected = Exception.class)
    public void lionWithOtherParamThrowsException() throws Exception{
        Lion lion = new Lion("Human");
    }

}
