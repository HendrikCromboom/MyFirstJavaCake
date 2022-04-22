package JavaCakes.CardGenerator;

import JavaCakes.ClassLib.Card;

public class CardPowerNamingExtension extends Card {
    public int combinedPower;
    public CardPowerNamingExtension(int maxHealth, int maxAttack, int cost){
        combinedPower = ((maxHealth + maxAttack)/ cost);
    }
}
