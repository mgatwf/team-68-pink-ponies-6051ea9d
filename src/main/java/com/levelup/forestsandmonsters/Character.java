package com.levelup.forestsandmonsters;



import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class Character {
    public static final String DEFAULT_NAME = "PinkPonies";
    String name;
    GameMap map = null;
    Position currentPosition = null;
    int moveCount = 0;

    public Character(){
      name = DEFAULT_NAME;
    }
    public Character(String name) throws InstantiationException{
        if(name.trim().equals(""))
          this.name = DEFAULT_NAME;
        else if(name.matches("^[A-Za-z]*$"))
          this.name = name;
        else  throw new InstantiationException("Character Cannot be Created with an Invalid Name"); 
    }

    public String getName(){
        return name;
    }
    public void enterMap(GameMap map){
        this.map = map;
        this.currentPosition = map.startingPosition;
    }
    public Position getPosition(){
     return currentPosition;
    }
    public void move(DIRECTION direction){
       this.currentPosition = map.calculatePosition(this.currentPosition, direction);
        moveCount++;
    }
    public int getMoveCount(){
        return moveCount;
    }
}
