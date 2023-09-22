package com.levelup.forestsandmonsters.features;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.levelup.forestsandmonsters.GameController;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateInvalidCharSteps {
    GameController gc;
    String characterName;
    String actualMessage = "";

    @Given("player supplies the Invalid name {string}")
    public void givenTheCharactersNameIsInvalid(String characterName) {
        this.characterName = characterName;
    }

    @When("the character is created with provided invalid")
    public void whenTheCharacterProvidesInvalidName(){
        gc = new GameController();
        
    try{
       gc.createCharacter(characterName);
    }
    catch(InstantiationException exception)
     {
        actualMessage = exception.getMessage();
     }

    }

    @Then("the Game throws a Message back to the Gamer {string}")
    public String thenTheGameThrowsAnInvalidCharactersName(String expectedName) {
        
    String expectedMessage = "Character Cannot be Created with an Invalid Name";
    assertEquals(expectedMessage, actualMessage);
    
    if (actualMessage.contains(expectedMessage))
      return "Provide a valid Name";
    else
      return gc.getStatus().characterName;
    }
}
