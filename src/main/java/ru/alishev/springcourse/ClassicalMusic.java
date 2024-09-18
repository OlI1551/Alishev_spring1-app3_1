package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
//    private List<String> songs = new ArrayList<>();
//
//    // Блок инициализации объекта (англ. Instance initialization block)
//    // Выполняется каждый раз, когда создается объект класса
//    {
//        songs.add("Hungarian Rhapsody");
//        songs.add("Symphony no. 5 in C Minor, op. 67");
//        songs.add("Night on Bald Mountain");
//    }
//
//    @Override
//    public List<String> getSongs() {
//        return songs;
//    }
    private ClassicalMusic() {}
    private String[] classicalSongs = {"Für Elise", "The Four Seasons", "Carmen"};

    @Override
    public  String[] getSongs() {
        return  classicalSongs;
    }


    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
