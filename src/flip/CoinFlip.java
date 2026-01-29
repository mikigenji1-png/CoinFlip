package flip;

import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    private int userChoise = -1;
    private int flipResult = -1;
    private final int heads = 1;
    private final int tails = 0;


    public void options() { //opcje które może wybrać użytkownik
        System.out.println("Wybierz jedną z dwóch opcji");
        System.out.println(heads + " - orzeł");
        System.out.println(tails + " - reszka");
    }

    public void coinFlip() { //użytkownik wybiera opcje
        userChoise = scan.nextInt();
    }

    public void coinFlipSimulation() {//symulacja rzutu monetą poprzez wylosowanie 1 lub 2
        flipResult = rand.nextInt(2);
    }

    public void winOrLose() {

        if (userChoise == flipResult) {

            if (flipResult == heads) {
                System.out.println("Brawo! Wypadł orzeł — wygrałeś!");
            } else {
                System.out.println("Brawo! Wypadła reszka — wygrałeś!");
            }

        } else {

            if (flipResult == heads) {
                System.out.println("Wypadł orzeł — przegrałeś!");
            } else {
                System.out.println("Wypadła reszka — przegrałeś!");
            }
        }
    }
}
