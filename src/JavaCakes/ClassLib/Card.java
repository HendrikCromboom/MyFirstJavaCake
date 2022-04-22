package JavaCakes.ClassLib;

public class Card {
    public int health;
    public int attack;
    public boolean isAlive(){
        return health > 0;
    }
    public boolean inHand;
    public boolean inDeck;
    public boolean onField;
    public boolean inGraveyard;
}
