package JavaCakes;

import JavaCakes.CardGenerator.DeckCreator;
import JavaCakes.ClassLib.Game;
import JavaCakes.ClassLib.Player;

public class Main {
    public static void main(String[] args){
        Game newGame = new Game();
        newGame.start();
        DeckCreator deckCreator = new DeckCreator();
        Player player = new Player();
        player.deck = deckCreator.CreateDeck();
        Player opponent = new Player();
        opponent.deck = deckCreator.CreateDeck();
    }
}
