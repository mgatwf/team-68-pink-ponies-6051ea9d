Feature: CreateCharacter
![Gamer](images/gamerErin.png)

I want to create a new custom character, setting only their name.
This split is VERY simple: the only customization is setting the name.

Scenario Outline:: Set character name

    Given player supplies the name <characterNameInput>
    When the character is created
    Then the Game sets the character name to <characterNameOutput>
    Examples:
        | characterNameInput | characterNameOutput |
        | "Bob"          | "Bob"           |
        | ""              | "PinkPonies"         |
        | "m@n" | "PinkPonies"

Scenario Outline:: Invalid character name

    Given player supplies the Invalid name <characterNameInput>
    When the character is created with provided invalid
    Then the Game throws a Message back to the Gamer <characterNameOutput>
    Examples:
        | "Anee##"              | "Provide a valid Name"         |

