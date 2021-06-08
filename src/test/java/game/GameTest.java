package game;

import game.card.*;
import game.card.manager.CardDistribution;
import game.card.manager.CardManager;
import game.card.manager.CardSeating;
import game.card.manager.CardSeatingImpl;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import tools.ToolsMock;
import java.util.List;
import static org.junit.Assert.assertEquals;


@RunWith(JUnitParamsRunner.class)
public class GameTest {

    @Test
    @Parameters(method = "differentSeating")
    public void startGameTest(CardManager cardManagerPrimaryGame, CardManager cardManagerBonusGame, Integer expectedWin) {


        CardSeating cardSeating = new CardSeatingImpl(new ToolsMock());
        Game game = new Game(cardSeating, cardManagerPrimaryGame, cardManagerBonusGame);
        Integer win = game.startGame();

        assertEquals(win, expectedWin);
    }

    private Object[] differentSeating() {
        return new Object[]{
                win12(),
                win23(),
                win33(),
                win0(),
                win21(),
                win51(),
                win18()
        };
    }

    private Object[] win12() {
        return new Object[]{new CardManager() {

            // CardManagerPrimaryGame
            public List<CardDistribution> createCardDistributionList() {

                addToCardDistributionList(new AdditionalLifeCard(), 4);
                addToCardDistributionList(new AwardedCard(11), 1);
                addToCardDistributionList(new EndPrimaryGameCard(), 3);
                addToCardDistributionList(new ExtraCard(), 1);
                addToCardDistributionList(new EndPrimaryGameCard(), 2);

                return cardDistributionList;
            }
        }, new CardManager() {

            //CardManagerBonusGame
            public List<CardDistribution> createCardDistributionList() {


                addToCardDistributionList(new AwardedCard(1), 1);
                addToCardDistributionList(new EndBonusGameCard(), 1);

                return cardDistributionList;
            }
        }, 12 // expected value

        };
    }


    private Object[] win23() {
        return new Object[]{new CardManager() {

            // CardManagerPrimaryGame
            public List<CardDistribution> createCardDistributionList() {


                addToCardDistributionList(new AwardedCard(10), 2);
                addToCardDistributionList(new AwardedCard(1), 3);
                addToCardDistributionList(new EndPrimaryGameCard(), 1);
                addToCardDistributionList(new AwardedCard(11), 1);
                addToCardDistributionList(new ExtraCard(), 1);

                return cardDistributionList;
            }
        }, new CardManager() {

            //CardManagerBonusGame
            public List<CardDistribution> createCardDistributionList() {

                addToCardDistributionList(new AwardedCard(1), 6);

                return cardDistributionList;
            }
        }, 23

        };
    }

    private Object[] win33() {
        return new Object[]{new CardManager() {

            // CardManagerPrimaryGame
            public List<CardDistribution> createCardDistributionList() {


                addToCardDistributionList(new AwardedCard(11), 1);
                addToCardDistributionList(new ThreeTimesWinCard(), 1);
                addToCardDistributionList(new ExtraCard(), 1);
                addToCardDistributionList(new EndPrimaryGameCard(), 1);

                return cardDistributionList;
            }
        }, new CardManager() {

            // CardManagerBonusGame
            public List<CardDistribution> createCardDistributionList() {


                addToCardDistributionList(new EndBonusGameCard(), 1);
                addToCardDistributionList(new AwardedCard(1), 1);


                return cardDistributionList;
            }
        }, 33

        };
    }

    private Object[] win0() {
        return new Object[]{new CardManager() {

            // CardManagerPrimaryGame
            public List<CardDistribution> createCardDistributionList() {


                addToCardDistributionList(new EndPrimaryGameCard(), 2);
                addToCardDistributionList(new AwardedCard(11), 1);
                addToCardDistributionList(new ExtraCard(), 1);

                return cardDistributionList;
            }
        }, new CardManager() {

            // CardManagerBonusGame
            public List<CardDistribution> createCardDistributionList() {

                addToCardDistributionList(new AwardedCard(1), 1);
                addToCardDistributionList(new EndPrimaryGameCard(), 1);

                return cardDistributionList;
            }
        }, 0

        };
    }

    private Object[] win21() {
        return new Object[]{new CardManager() {

            // CardManagerPrimaryGame
            public List<CardDistribution> createCardDistributionList() {


                addToCardDistributionList(new AwardedCard(11), 1);
                addToCardDistributionList(new ResettingCard(), 1);
                addToCardDistributionList(new AwardedCard(3), 1);
                addToCardDistributionList(new ExtraCard(), 1);
                addToCardDistributionList(new EndPrimaryGameCard(), 1);

                return cardDistributionList;
            }
        }, new CardManager() {

            // CardManagerBonusGame
            public List<CardDistribution> createCardDistributionList() {


                addToCardDistributionList(new AwardedCard(2), 9);
                addToCardDistributionList(new EndBonusGameCard(), 1);

                return cardDistributionList;
            }
        }, 21

        };
    }

    private Object[] win51() {
        return new Object[]{new CardManager() {

            // CardManagerPrimaryGame
            public List<CardDistribution> createCardDistributionList() {


                addToCardDistributionList(new ExtraCard(), 1);
                addToCardDistributionList(new AwardedCard(11), 1);
                addToCardDistributionList(new AwardedCard(3), 1);
                addToCardDistributionList(new ExtraCard(), 1);
                addToCardDistributionList(new AwardedCard(1), 1);
                addToCardDistributionList(new EndPrimaryGameCard(), 1);

                return cardDistributionList;
            }
        }, new CardManager() {

            // CardManagerBonusGame
            public List<CardDistribution> createCardDistributionList() {


                addToCardDistributionList(new AwardedCard(2), 9);
                addToCardDistributionList(new EndBonusGameCard(), 1);

                return cardDistributionList;
            }
        }, 51

        };
    }

    private Object[] win18() {
        return new Object[]{new CardManager() {

            // CardManagerPrimaryGame
            public List<CardDistribution> createCardDistributionList() {


                addToCardDistributionList(new ThreeTimesWinCard(), 1);
                addToCardDistributionList(new ResettingCard(), 1);
                addToCardDistributionList(new ExtraCard(), 1);

                return cardDistributionList;
            }
        }, new CardManager() {

            // CardManagerBonusGame
            public List<CardDistribution> createCardDistributionList() {


                addToCardDistributionList(new AwardedCard(2), 9);
                addToCardDistributionList(new EndBonusGameCard(), 1);

                return cardDistributionList;
            }
        }, 18

        };
    }
}
