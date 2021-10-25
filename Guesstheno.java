package com.company;
import java.util.Scanner;
import java.util.Random;
public class Guesstheno {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("*****Welcome to the Game*****");
        System.out.println("Guess the number between 1 to 100");
        Random constructor = new Random();
        int guess;
        int computerinput = constructor.nextInt(101);

        for (int i = 1; i <= 100; i++) {
            int userinput;
            userinput = Sc.nextInt();
            if (userinput == computerinput) {
                System.out.println("you guessed the right number");
                System.out.println("Thanks for Playing");
                break;
            } else if (userinput > computerinput) {
                System.out.println("the number is too large");
            } else if (userinput < computerinput) {
                System.out.println("the number is small");
            }
        }
    }
}
