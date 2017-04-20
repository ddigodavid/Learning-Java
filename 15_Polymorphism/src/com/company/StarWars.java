package com.company;

public class StarWars extends Movie {
    public StarWars() {
        super("Start Wars");
    }

    @Override
    public String plot() {
        return "The imperial forces try to take over the Universe";
    }
}
