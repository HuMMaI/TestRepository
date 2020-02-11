package org.example;

import org.junit.Before;
import org.junit.Test;

public class MyClassTest {
    private MyClass myClass;

    @Before
    public void setup(){
        myClass = new MyClass();
    }

    @Test
    public void itSayHi(){
        myClass.sayHi();
    }
}
