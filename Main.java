package com.tts;

import java.util.Locale;

import java.util.Random;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = "Hello World";
        System.out.println(text);

        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String yourName = scanner.next();
        System.out.println("Hello " + yourName);

        //Must print "yes" or "Y" to continue the questions.
        System.out.println("Do you wish to continue? (y or n)?");
        //String promptAnswer = "y";
        String promptAnswer = scanner.next().toLowerCase();

        if (promptAnswer.equals("y") || promptAnswer.equals("yes")) {
            System.out.println("Let's Continue! Do you have a red car? (y or n)?");
            String promptAnswer2 = scanner.next().toLowerCase();
            boolean redCar;
            if (promptAnswer2.equals("y") || promptAnswer2.equals("yes")) {
                redCar = true;
                System.out.println("That's a nice red car!");
            } else {
                redCar = false;
                System.out.println("Ah okay...");
            }

            System.out.println("What is your favorite pet's name?");
            scanner.next();

            System.out.println("What is your favorite pet's age?");
            int petAge = scanner.nextInt();

            System.out.println("What is your lucky number?");
            int luckyNumber = scanner.nextInt();

            System.out.println("Do you have a favorite quarterback? (y or n)?");
            String promptAnswer3 = scanner.next().toLowerCase();
            if (promptAnswer3.equals("y") || promptAnswer3.equals("yes")) {
                System.out.println("What is their jersey number?");
                int qbNumber = scanner.nextInt();
                System.out.println(qbNumber + " is a fitting number for the QB!");
            } else {
                int qbNumber = 0;
                System.out.println("Who needs a favorite QB anyway!");
            }

            System.out.println("What is the two digit model year of your car? (e.g. 99, 05, 11)");
            int carYear = scanner.nextInt();

            System.out.println("What is the first name of your favorite actor or actress?");
            String favAct = scanner.next().toUpperCase();
            // toUpperCase is here so that when I pull from the first character, it will return a number later

            System.out.println("Enter a random number between 1 and 50 (If you don't we'll pick one for you!).");
            int myNumber = scanner.nextInt();
            if (myNumber < 0) {
                do {
                    myNumber = (myNumber - myNumber) + 1;
                } while (myNumber < 1);
            }
            if (myNumber > 50) {
                do {
                    myNumber = myNumber - 50;
                } while (myNumber > 50);
            }
            System.out.println("Your number: " + myNumber);


            Random random = new Random();

            int upperbound1 = 10;
            int upperbound2 = 51;

            int randomNumber1 = random.nextInt(upperbound1) + 1;
            int randomNumber2 = random.nextInt(upperbound1) + 1;
            int randomNumber3 = random.nextInt(upperbound2) + 1;
            int magicBall = luckyNumber * randomNumber1;

            if (magicBall > 75) {
                do {
                    magicBall = magicBall - 75;
                } while (magicBall > 75);
            }

            int powerBall1 = petAge + carYear;
            int powerBall2 = luckyNumber + carYear;
            int powerBall3 = randomNumber3 - randomNumber2;
            int powerBall4 = favAct.charAt(0);
            int powerBall5 = favAct.charAt(favAct.length()-1);

            if (powerBall1 > 65) {
                do {
                    powerBall1 = powerBall1 - 65;
                } while (powerBall1 > 65);
            }
            if (powerBall2 > 65) {
                do {
                    powerBall2 = powerBall2 - 65;
                } while (powerBall2 > 65);
            }
            if (powerBall3 > 65) {
                do {
                    powerBall3 = powerBall3 - 65;
                } while (powerBall3 > 65);
            }
            if (powerBall4 > 65) {
                do {
                    powerBall4 = powerBall4 - 65;
                } while (powerBall4 > 65);
            }
            if (powerBall5 > 65) {
                do {
                    powerBall5 = powerBall5 - 65;
                } while (powerBall5 > 65);
            }

            System.out.println("Lottery Numbers: " + powerBall1 + "," + powerBall2 + "," + powerBall3 + "," + powerBall4 + "," + powerBall5 + ". Magic Ball: " + magicBall);

        } else {
            System.out.println("Please return later to complete the survey.");
        }
    }
}