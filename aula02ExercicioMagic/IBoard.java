package aula02ExercicioMagic;

import java.util.List;

public interface IBoard {

    void addDeck(List<Card> deck);
    boolean canPlayCard(AttackCard attackCard);
    void checkWinner();
    void addPlayer(Player player);

}
