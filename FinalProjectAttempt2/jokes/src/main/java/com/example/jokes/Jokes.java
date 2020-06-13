package com.example.jokes;

import java.util.Random;

public class Jokes {
    //Many of these jokes are pulled from https://www.fatherly.com/play/50-great-clean-jokes-for-funny-people-who-dont-swear/
    private static String[] jokes = new String[] {
            "How does NASA organize a party?\n" +
            "\n" +
            "They planet.", "What’s a pirate’s favorite letter?\n" +
            "\n" +
            "You think it’s R, but it be the C.", "Which bird has the worst manners?\n" +
            "\n" +
            "Mocking birds.", "What language do pigs speak?\n" +
            "\n" +
            "Swine language.", "Sometimes I tuck my knees into my chest and lean forward.\n" +
            "\n" +
            "That’s just how I roll.", "What do you get from a pampered cow?\n" +
            "\n" +
            "Spoiled milk.", "What happens when it rains cats and dogs?\n" +
            "\n" +
             "You step in a poo-dle", "What’s the best thing about Switzerland?\n" +
            "\n" +
            "I don’t know, but the flag is a big plus.", "Where to spaghetti and sauce go to dance?\n" +
            "\n" +
            "The meat ball.", "What did the big flower say to the little flower?\n" +
            "\n" +
            "Hi, bud!", "It was so cold in D.C. today…\n" +
            "\n" +
            "…that I saw a politician with his hands in his own pockets.", "How many tickles does it take to get an octopus to laugh?\n" +
            "\n" +
            "Ten tickles.", "What’s the difference between a poorly dressed man on a unicycle and a well-dressed man on a bicycle?\n" +
            "\n" +
            "Attire", "What did one toilet say to the other?\n" +
            "\n" +
            "You look flushed.", "My teachers told me I’d never amount to much because I procrastinate so much.\n" +
            "\n" +
            "I told them, “Just you wait!”", "I couldn’t figure out why the baseball kept getting bigger.\n" +
            "\n" +
            "Then it hit me.", "What happens to a frog’s car when it breaks down?\n" +
            "\n" +
            "It gets toad away.", "Why don’t ants ever get sick?\n" +
            "\n" +
            "Because they have little anty bodies.", "Is this pool safe for diving?\n" +
            "\n" +
            "It deep ends.", "What is worse than raining cats and dogs?\n" +
            "\n" +
            "Hailing taxis!", "What did the nose say to the finger?\n" +
            "\n" +
            "Quit picking on me!", "Why were they called the Dark Ages?\n" +
            "\n" +
            "Because there were lots of knights.", "Two goldfish are in a tank.\n" +
            "\n" +
            "One looks at the other and says, “You know how to drive this thing?!”", "What do you get when you cross a snowman with a vampire?\n" +
            "\n" +
            "Frostbite", "What do you call a pile of kittens?\n" +
            "\n" +
            "A meowntain.", "What is the lunchmeat that tastes like hot dogs?\n" +
            "\n" +
            "They say: Bologna?\n" +
            "\n" +
            "This isn’t bologna, but a serious question.", "What gets wetter the more it dries?\n" +
            "\n" +
            "A towel.", "Why aren’t koalas actual bears?\n" +
            "\n" +
            "The don’t meet the koalafications.", "Never criticize someone until you have walked a mile in their shoes.\n" +
            "\n" +
            "That way, when you criticize them, you’ll be a mile away, and you’ll have their shoes.", "What’s a writing utensil’s favorite place to go on vacation?\n" +
            "\n" +
            "Pencil-vania!", "Where do beef burgers go to dance?\n" +
            "\n" +
            "The meatball.", "What mouse walks on two feet?\n" +
            "\n" +
            "They answer: Mickey Mouse\n" +
            "\n" +
            "What duck walks on two feet?\n" +
            "\n" +
            "They say: Donald Duck!\n" +
            "\n" +
            "No! All ducks, silly!", "When does a joke become a “dad” joke?\n" +
            "\n" +
            "When the punchline is a parent.", "Want to hear a roof joke?\n" +
            "\n" +
            "The first one’s on the house.", "What did the left eye say to the right eye?\n" +
            "\n" +
            "Between you and me, something smells.", "What’s orange and sounds like a parrot?\n" +
            "\n" +
            "A carrot.", "What’s the difference between a hippo and a Zippo?\n" +
            "\n" +
            "One is really heavy, and the other is a little lighter.", "Why are teddy bears never hungry?\n" +
            "\n" +
            "Because they’re always stuffed.", "Did you hear about the cheese factory that exploded in France?\n" +
            "\n" +
            "There was nothing left but de Brie.", "Why does Humpty Dumpty love autumn?\n" +
            "\n" +
            "Because he always has a great fall.", "What do you call two monkeys that share an Amazon account? \n" +
            "\n" +
            "Prime mates.", "Which rock group has four guys who can’t sing or play instruments?\n" +
            "\n" +
            "Mount Rushmore.", "What do Alexander the Great and Winnie the Pooh have in common?\n" +
            "\n" +
            "Same middle name.", " Why is no one friends with Dracula?\n" +
            "\n" +
            "Because he’s a pain in the neck.", " What time do you go to the dentist?\n" +
            "\n" +
            "At tooth-hurty.", "Why did the A go to the bathroom and come out as an E?\n" +
            "\n" +
            "Because he had a vowel movement.", "What do you call a droid that takes the long way around?\n" +
            "\n" +
            "R2 detour."
    };

    public static String getJoke(){
        int randIndex = getRandomInt(jokes.length - 1);
        return jokes[randIndex];
    }

    private static int getRandomInt(int max){
        Random random = new Random();
        return random.nextInt(max + 1);
    }
}