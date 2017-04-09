package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        pagesPrinted = 0;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void fillTonerLevel() {
        this.tonerLevel = 100;
    }

    public int fillTonerLevel(int levelToIncrease) {
        if (this.tonerLevel + levelToIncrease <= 100) {
            this.tonerLevel += levelToIncrease;
            return 0;
        }

        int remaining = levelToIncrease - (100 - this.tonerLevel);
        fillTonerLevel();
        return remaining;
    }

    public boolean print(int numberOfPages) {
        if (numberOfPages * 3 > this.tonerLevel) {
            System.out.println("Your toner lever is under the necessary to print this number of pages. Please, fill" +
                    " your printer with more toner.");
            return false;
        }

        this.pagesPrinted += numberOfPages;

        for (int i = 1; i <= numberOfPages; i++) {
            if (i % 2 == 0 || ! this.isDuplex()) {
                System.out.println(String.format("Printing page number: %d (Front side)", i));
            } else {
                System.out.println(String.format("Printing page number: %d (Back side)", i));
            }

            this.tonerLevel -= 3;
            System.out.println(String.format("-----Toner level: %d\n", this.getTonerLevel()));
        }

        return true;
    }
}