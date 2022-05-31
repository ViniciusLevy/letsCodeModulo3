package aula02ExercicioMagic;

import java.util.List;

public class Player {

    private int hp;
    private List<Card> playerDeck;

    public int getHp() {
        return hp;
    }

    public List<Card> getPlayerDeck() {
        return playerDeck;
    }

    public void addCard (Card card) {
        playerDeck.add(card);
    }
}
