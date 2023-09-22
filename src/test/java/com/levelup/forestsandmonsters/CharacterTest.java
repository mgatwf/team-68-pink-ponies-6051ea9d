package com.levelup.forestsandmonsters;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class CharacterTest {
    @Test
    public void testDefaultNameWhenEmpty() throws InstantiationException {
        Character testObj = new Character();
        assertEquals(Character.DEFAULT_NAME, testObj.getName());
        testObj = new Character("");
        assertEquals(Character.DEFAULT_NAME, testObj.getName());
        testObj = new Character("    ");
        assertEquals(Character.DEFAULT_NAME, testObj.getName());
    }

    @Test
    public void testDefaultNameWhenNotEmpty() throws InstantiationException{
          Character testObj = new Character("TestName");
          assertEquals("TestName",testObj.getName());
    }

   @Test
    public void testCharacterNameWithSpecialChars(){
        Exception exception = assertThrows(InstantiationException.class, () -> {
                  Character testObj = new Character("Varsha$#");

    });
    }

}
