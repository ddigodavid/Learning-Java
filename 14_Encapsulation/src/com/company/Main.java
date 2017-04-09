package com.company;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//
//        player.name = "Rodrigo";
//        player.health = 1000;
//        player.weapon = "Sword";
//
//        player.loseHealth(10);
//        System.out.println(String.format("Remaining health: %d", player.healthRemaining()));
//        player.loseHealth(990);

        EnhancedPlayer player = new EnhancedPlayer("Rodrigo", 50, "Sword");
        System.out.println(String.format("Initial health is %d", player.getHitPoints()));
    }
}
