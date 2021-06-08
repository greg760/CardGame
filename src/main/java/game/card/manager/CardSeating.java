package game.card.manager;

import game.card.Card;
import java.util.List;

public abstract class CardSeating {

    public abstract List<Card> createCardSeating(CardManager cardManager);
}
