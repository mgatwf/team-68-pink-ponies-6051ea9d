Feature: CreateInvalidCharacter

Scenario Outline:: Invalid character name

    Given player supplies the Invalid name <characterNameInput>
    When the character is created with provided invalid
    Then the Game throws a Message back to the Gamer <characterNameOutput>
    Examples:
        | "Anee##"              | "Provide a valid Name"         |

