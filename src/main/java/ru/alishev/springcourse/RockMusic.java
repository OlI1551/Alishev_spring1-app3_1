package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    private String[] rockSongs = {"Bohemian Rhapsody", "Let It Be", "Wind of Change"};

    @Override
    public  String[] getSongs() {
        return  rockSongs;
    }
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
