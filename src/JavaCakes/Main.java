package JavaCakes;

import JavaCakes.CardGenerator.CardCreator;
import JavaCakes.ClassLib.Game;
import JavaCakes.ClassLib.Player;

public class Main {
    public static void main(String[] args){
        Game newGame = new Game();
        newGame.start();
        CardCreator cardCreator = new CardCreator();
        Player player = new Player();
        player.deck = cardCreator.CreateDeck();
        Player opponent = new Player();
        opponent.deck = cardCreator.CreateDeck();
    }
}
