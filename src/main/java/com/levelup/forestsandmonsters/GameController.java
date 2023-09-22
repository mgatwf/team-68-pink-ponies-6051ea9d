package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {

    GameMap map;
    Character character;
    public class GameStatus {
     
        public String characterName;
        public Point currentPosition;
        public int moveCount;

        @Override
        public String toString() {
            return "Character " + characterName + " was on position " + currentPosition.x + "," + currentPosition.y + " at move count " + moveCount;
        }
    }

    GameStatus status;

    public GameController() {
        status = new GameStatus();
    }

    // TODO: Ensure this AND CLI commands match domain model
    public static enum DIRECTION {
        NORTH, SOUTH, EAST, WEST
    }

    // Pre-implemented to demonstrate ATDD
    // TODO: Update this if it does not match your design
    public void createCharacter(String name) throws InstantiationException {
        this.character = new Character(name);
        this.status.characterName = character.getName();
    }

    public void startGame() {
        map = new GameMap();
        if(character == null)
        {
            this.character = new Character();
        }
        character.enterMap(map);
        this.status.characterName = this.character.name;
        this.status.currentPosition = this.character.getPosition().coordinates;
        this.status.moveCount = this.character.getMoveCount();
    }

    public GameStatus getStatus() {
        GameStatus snapshotStatus = new GameStatus();
        snapshotStatus.characterName = this.status.characterName;
        snapshotStatus.currentPosition = this.status.currentPosition;
        snapshotStatus.moveCount = this.status.moveCount;
        return snapshotStatus;
    }

    public void move(DIRECTION directionToMove) {
        character.move(directionToMove);
        this.status.currentPosition = character.getPosition().coordinates;
        this.status.moveCount = character.getMoveCount();
    }

    public void setCharacterPosition(Point coordinates) {
        // TODO: IMPLEMENT THIS TO SET CHARACTERS CURRENT POSITION -- exists to be testable
        if(character == null)
            this.character = new Character();
        this.character.currentPosition = new Position(coordinates.x, coordinates.y);        
        this.status.characterName = this.character.name;
        this.status.currentPosition = this.character.currentPosition.coordinates;
        this.status.moveCount = this.character.moveCount;
    }

    public void setCurrentMoveCount(int moveCount) {        
        // TODO: IMPLEMENT THIS TO SET CURRENT MOVE COUNT -- exists to be testable
         if(character == null)
            this.character = new Character();
         this.character.moveCount = moveCount;
        
    }

    public int getTotalPositions() {
        // TODO: IMPLEMENT THIS TO GET THE TOTAL POSITIONS FROM THE MAP -- exists to be
        // testable
        return this.map.getTotalPositions();
    }

}
