package Tests;

import Cat.Cat;
import Dog.Dog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class JavaTest
{

    @Test
    public void testLabradorVoiceCheck() {

        Dog labrador = new Dog();
        labrador.voice = "Woooof!";
        assertEquals("Woooof!", labrador.voice, "It is a wrong dog voice!");

    }

    @Test
    public void testCatVoiceCheck() {
         Cat mayCoon = new Cat();
         mayCoon.voice = "Murrr!";
         assertEquals("Murrr!", mayCoon.voice, "Wrong cat voice!");
    }
}

