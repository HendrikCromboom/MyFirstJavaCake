package JavaCakes.CardGenerator;

import JavaCakes.ClassLib.Card;
import JavaCakes.ClassLib.Deck;
import JavaCakes.ClassLib.Rules;

public class DeckCreator {
    public Deck CreateDeck(){
        Deck deck = new Deck();
        CardCreator cardCreator = new CardCreator();
        int maxCombinedHealth = 100;
        int maxCombinedAttack = 100;
        int maxCombinedCost = 100;
        for(int i = 0; i < Rules.maxDeckSize; i++){
            Card thisCard = cardCreator.CreateCard(maxCombinedHealth, maxCombinedAttack, maxCombinedCost, deck.Size());
            deck.cards.add(thisCard);
            maxCombinedAttack -= thisCard.maxAttack;
            maxCombinedCost -= thisCard.cost;
            maxCombinedHealth -= thisCard.maxHealth;
        }
        return deck;
    }

}
