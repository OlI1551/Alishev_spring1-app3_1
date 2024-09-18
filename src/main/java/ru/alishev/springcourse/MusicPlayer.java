package ru.alishev.springcourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Random;


@Component
public class MusicPlayer {
    private Music classicalMusic;
    private Music rockMusic;


    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic, @Qualifier("rockMusic") Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }



    public void playMusic(MusicGenre genre) {
        Random random = new Random();

        // случайное целое число между 0 и 2
        int randomNumber = random.nextInt(3);

        if (genre == MusicGenre.CLASSICAL) {
            // случайная классическая песня
//            System.out.println(classicalMusic.getSongs().get(randomNumber));
            System.out.println(classicalMusic.getSongs()[randomNumber]);
        } else {
            // случайная рок песня
            System.out.println(rockMusic.getSongs()[randomNumber]);
        };
    }
}
