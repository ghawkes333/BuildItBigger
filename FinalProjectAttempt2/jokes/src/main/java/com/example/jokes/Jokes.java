package com.example.jokes;

import java.util.Random;

public class Jokes {
    private static String[] jokes = new String[] {"Joke 1", "Joke 2", "Joke 3"};

    public static String getJoke(){
        int randIndex = getRandomInt(jokes.length - 1);
        return jokes[randIndex];
    }

    private static int getRandomInt(int max){
        Random random = new Random();
        return random.nextInt(max + 1);
    }
}