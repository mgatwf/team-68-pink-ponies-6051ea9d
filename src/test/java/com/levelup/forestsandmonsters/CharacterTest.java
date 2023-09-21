package com.levelup.forestsandmonsters;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.levelup.forestsandmonsters.Character;
import org.junit.Test;

public class CharacterTest {
    @Test
    public void testDefaultNameWhenEmpty() {
        Character testObj = new Character();
        assertEquals(Character.DEFAULT_NAME, testObj.getName());
        testObj = new Character("");
        assertEquals(Character.DEFAULT_NAME, testObj.getName());
        testObj = new Character("    ");
        assertEquals(Character.DEFAULT_NAME, testObj.getName());
    }

    @Test
    public void testDefaultNameWhenNotEmpty(){
          Character testObj = new Character("TestName");
          assertEquals("TestName",testObj.getName());
    }

   

}
