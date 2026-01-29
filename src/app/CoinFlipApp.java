package app;

import flip.CoinFlip;

public class CoinFlipApp {
    public static void main(String[] args) {//main
        CoinFlip coinFlip = new CoinFlip();
        coinFlip.options();
        coinFlip.coinFlip();
        coinFlip.coinFlipSimulation();
        coinFlip.winOrLose();
    }
}
