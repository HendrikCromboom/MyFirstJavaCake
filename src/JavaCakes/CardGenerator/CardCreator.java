package JavaCakes.CardGenerator;

import JavaCakes.ClassLib.Card;
import JavaCakes.ClassLib.CardCollection;
import JavaCakes.ClassLib.Deck;
import JavaCakes.ClassLib.Rules;

public class CardCreator {
    public Deck CreateDeck(){
        Deck deck = new Deck();
        for(int i = 0; i < Rules.maxDeckSize; i++){
            Card thisCard = CreateCard();
            deck.cards.add(thisCard);
        }
        return deck;
    }
    public Card CreateCard(){
        Card thisCard = new Card();
        thisCard.cost = 2;
        thisCard.maxAttack = 1;
        thisCard.maxHealth = 2;
        thisCard.name = "test";
        return thisCard;
    }
}
