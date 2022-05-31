package aula02ExercicioMagic;

import java.util.ArrayList;
import java.util.List;

public class PartyBoard implements IBoard{

    private List<Card> deck1 = new ArrayList<>();
    private List<Card> deck2 = new ArrayList<>();
    private List<Card> deck3 = new ArrayList<>();
    private List<Card> deck4 = new ArrayList<>();
    private List<Card> deck5 = new ArrayList<>();
    private Player player1;
    private Player player2;
    private Player player3;
    private Player player4;
    private Player player5;
    private List<AttackCard> partyBoard = new ArrayList<>();
    private int partyHp;


    @Override
    public void addDeck(List<Card> deck) {
        if (deck.size() == 80) {
            if (deck1.isEmpty()) {
                this.deck1 = deck;
            } else if (deck2.isEmpty()) {
                this.deck2 = deck;
            } else if (deck3.isEmpty()) {
                this.deck3 = deck;
            } else if (deck4.isEmpty()) {
                this.deck4 = deck;
            } else if (deck5.isEmpty()) {
                this.deck5 = deck;
            } else {
                System.out.println("Decks already added.");
            }
        } else {
            System.out.println("Deck doesn't fit the parameters to be added");
        }
    }

    @Override
    public boolean canPlayCard(AttackCard attackCard) {
        int attackCardsPartyBoard = 0;
        int specialAttackCardsPartyBoard = 0;

        if (partyBoard.size() < 34) {
            for (AttackCard attackCard1: partyBoard) {
                if (attackCard instanceof AttackCard) {
                    attackCardsPartyBoard++;
                } else if (attackCard instanceof SpecialAttackCard) {
                    specialAttackCardsPartyBoard++;
                }
            }
        }

        if (attackCard instanceof AttackCard && attackCardsPartyBoard < 25) {
            partyBoard.add(attackCard);
            return true;
        } else if(attackCard instanceof SpecialAttackCard && specialAttackCardsPartyBoard < 9) {
            partyBoard.add(attackCard);
            return true;
        }

        System.out.println("Can't add more cards, slots are full.");
        return false;
    }

    @Override
    public void checkWinner() {
        partyHp = player1.getHp() + player2.getHp() + player3.getHp() + player4.getHp() + player5.getHp();
        if (partyHp == 0) {
            System.out.println("Game Over");
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
        } else if (player3 == null) {
            player3 = player;
            System.out.println("Player Two sucessfully added");
        } else if (player4 == null) {
            player4 = player;
            System.out.println("Player Two sucessfully added");
        } else if (player5 == null) {
            player5 = player;
            System.out.println("Player Two sucessfully added");
        } else {
            System.out.println("Player's already added.");
        }
    }
}
