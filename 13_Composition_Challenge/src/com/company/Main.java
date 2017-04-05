package com.company;

public class Main {

    public static void main(String[] args) {
        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one behavior that access an object via getter and
        // then that objects public method then add at least on method to hide
        // the object e.g. not using a getter
        // but to access the object used in composition within the main class.

        Door door = new Door(50, 230);
        Window window = new Window(60, 40);
        Bed bed = new Bed(100, 240, "King size");
        LightFixture lightFixture = new LightFixture(4, 100);
        Wardrobe wardrobe = new Wardrobe(240, 300);

        Room room = new Room(door, window, bed, lightFixture, wardrobe);

        House house = new House(room);

        house.getRoom().pressLightSwitcher();
        house.getRoom().getBed().makeBed();
        house.getRoom().getWardrobe().organizeWardrobe();
        house.getRoom().pressLightSwitcher();
    }
}
