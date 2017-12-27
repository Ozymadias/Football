package team;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FootballTeamTest {

    @DataProvider
    private static final Object[][] nbOfGamesWon() {
        return new Object[][]{
                {0}, {1}, {2}, {3}
        };
    }

    @Test(dataProvider = "nbOfGamesWon")
    public void constructorShouldSetGamesWon(int nbOfGamesWon) {
        FootballTeam team = new FootballTeam(nbOfGamesWon);
        assertEquals(team.getGamesWon(), nbOfGamesWon,
                nbOfGamesWon + " games were passed to constructor, but " + team.getGamesWon() + " were returned");
    }
}
