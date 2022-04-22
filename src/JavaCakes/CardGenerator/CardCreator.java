package JavaCakes.CardGenerator;

import JavaCakes.ClassLib.Card;

import java.util.Random;

public class CardCreator {
    public Card CreateCard(int maxCombinedHealth, int maxCombinedAttack, int maxCombinedCost, int currentDeckSize) {
        Card thisCard = new Card();

        thisCard.maxAttack = getStatValue(maxCombinedAttack, currentDeckSize);
        thisCard.cost = getStatValue(maxCombinedCost, currentDeckSize);
        thisCard.maxHealth = getStatValue(maxCombinedHealth, currentDeckSize);
        thisCard.name = "test";
        return thisCard;
    }
    public int getStatValue(int maxCombinedStat, int currentDeckSize){
        Random randomNumber = new Random();
        int minValue = 1;
        int difference = maxCombinedStat - currentDeckSize;
        int maxValue = 5;
        if (difference < 5) {
            maxValue = difference;
        }
         return randomNumber.nextInt((maxValue - minValue) + 1) + minValue;
    }
}
