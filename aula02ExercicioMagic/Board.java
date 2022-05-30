package aula02ExercicioMagic;

import java.util.ArrayList;
import java.util.List;

public abstract class Board {

    protected int playerCounter = 0;
    protected int deckCounter = 0;
    protected List<StandardCard> decks = new ArrayList<>();
    protected List<Player> players = new ArrayList<>();


    public abstract void insertDeck();
    public abstract void insertPlayer();
    public abstract void playACard(StandardCard card);
    public abstract void checksWinner();
}
