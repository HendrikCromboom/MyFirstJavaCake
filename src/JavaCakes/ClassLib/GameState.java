package JavaCakes.ClassLib;

public class GameState {
    enum Phase{
        UPKEEP,
        DRAW,
        SPEND,
        COMBAT,
        END
    }
    Phase currentPhase;
    int turn;
    Player priority;
}
