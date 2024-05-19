package com.keshav.levelone;

public class Joueur extends Structure{
    String name;
    Structure player = new Structure();

    public void InitPosPlayer() {
        player.setPosX(0);
        player.setPosY(0);
        player.setWidth(3);
        player.setHeight(3);
    }

    // Method to move the player up
    public void moveUp(int amount) {
        player.setPosY(player.getPosY() - amount);
    }

    // Method to move the player down
    public void moveDown(int amount) {
        player.setPosY(player.getPosY() + amount);
    }

    // Method to move the player left
    public void moveLeft(int amount) {
        player.setPosX(player.getPosX() - amount);
    }

    // Method to move the player right
    public void moveRight(int amount) {
        player.setPosX(player.getPosX() + amount);
    }


}
