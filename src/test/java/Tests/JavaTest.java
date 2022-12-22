package Tests;

import Cat.Cat;
import Dog.Dog;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class JavaTest {

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

    @ParameterizedTest
    @CsvFileSource(resources = "/testData.csv", useHeadersInDisplayName = true)
    public void csvFileTestSource(String Login, String Password, String Role) {

        Assertions.assertNotNull(Password);
        Assertions.assertFalse(Login.isBlank());
        Assertions.assertNotNull(Role);
        String csv = Login + " " + Password+ " " + Role;
        System.out.println(csv);




    }
}
