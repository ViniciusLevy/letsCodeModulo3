package aula02ExercicioMagic;

import java.util.ArrayList;
import java.util.List;

public class VersusBoard implements IBoard{

    private List<Card> deck1 = new ArrayList<>();
    private List<Card> deck2 = new ArrayList<>();
    private Player player1;
    private Player player2;
    private List<AttackCard> player1Board = new ArrayList<>();
    private List<AttackCard> player2Board = new ArrayList<>();

    @Override
    public void addDeck(List<Card> deck) {
        if (deck.size() == 50) {
            if (deck1.isEmpty()) {
                this.deck1 = deck;
            } else if (deck2.isEmpty()) {
                this.deck2 = deck;
            } else {
                System.out.println("Decks already added.");
            }
        } else {
            System.out.println("Deck doesn't fit the parameters to be added");
        }
    }

    @Override
    public boolean canPlayCard(AttackCard attackCard) {
        int attackCardsPlayer1 = 0;
        int specialAttackCardsPlayer1 = 0;
        int attackCardsPlayer2 = 0;
        int specialAttackCardsPlayer2 = 0;

        if (player1Board.size() < 7) {
            for (Card card: deck1) {
                if (attackCard instanceof AttackCard) {
                    attackCardsPlayer1++;
                } else if (attackCard instanceof SpecialAttackCard) {
                    specialAttackCardsPlayer1++;
                }
            }
        }

        if (attackCard instanceof AttackCard && attackCardsPlayer1 < 5) {
            player1Board.add(attackCard);
            return true;
        } else if(attackCard instanceof SpecialAttackCard && specialAttackCardsPlayer1 < 2) {
            player1Board.add(attackCard);
            return true;
        }

        if (player2Board.size() < 7) {
            for (Card card: deck2) {
                if (attackCard instanceof AttackCard) {
                    attackCardsPlayer2++;
                } else if (attackCard instanceof SpecialAttackCard) {
                    specialAttackCardsPlayer2++;
                }
            }
        }

        if (attackCard instanceof AttackCard && attackCardsPlayer2 < 5) {
            player2Board.add(attackCard);
            return true;
        } else if(attackCard instanceof SpecialAttackCard && specialAttackCardsPlayer2 < 2) {
            player2Board.add(attackCard);
            return true;
        }

        System.out.println("Can't add more cards, slots are full.");
        return false;
    }

    @Override
    public void checkWinner() {
        if (player1.getHp() == 0 && player2.getHp() != 0) {
            System.out.println("Player Two is the Winner!");
        } else {
            System.out.println("Player One is the Winner!");
        }
    }

    @Override
    public void addPlayer(Player player) {
        if (player1 == null) {
            player1 = player;
            System.out.println("Player One sucessfully added");
        } else if (player2 == null) {
            player2 = player;
            System.out.println("Player Two sucessfully added");
        } else {
            System.out.println("Player's already added.");
        }
    }
}
