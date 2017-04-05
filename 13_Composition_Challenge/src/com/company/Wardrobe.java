package com.company;

public class Wardrobe extends DefaultRoomsObject {
    public Wardrobe(int width, int height) {
        super(width, height);
    }

    public void organizeWardrobe() {
        organizeClothes();
        clean();
    }

    private void clean() {
        System.out.println("Wardrobe -> Cleaning");
    }

    private void organizeClothes() {
        System.out.println("Wardrobe -> Organizing clothes");
    }
}
