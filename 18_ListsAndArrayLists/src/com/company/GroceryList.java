package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.printf("\tYou have %d items in your grocery list\n", groceryList.size());

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.printf("\t\t%d. %s\n", i + 1, groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.printf("\tGrocery item %d was modified\n", position + 1);
    }

    public void removeGroceryItem(int position) {
        String item = groceryList.get(position);
        groceryList.remove(position);

        System.out.printf("\t%s was remove from grocery item\n", item);
    }

    public String findItem(String keyword) {
        if (groceryList.contains(keyword)) {
            int itemIndex = groceryList.indexOf(keyword);
            return String.format("\tFound! %d. %s", (itemIndex + 1), groceryList.get(itemIndex));
        }

        return String.format("\t%s not found in the list", keyword);
    }
}
