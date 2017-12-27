package team;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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

    @DataProvider
    private static final Object[][] illegalNbOfGames() {
        return new Object[][]{
                {-10}, {-1}
        };
    }

    @Test(dataProvider = "illegalNbOfGames", expectedExceptions = IllegalArgumentException.class)
    public void shouldThrowExceptionForIllegalGamesNb(int illegalNbOfGames) {
        new FootballTeam(illegalNbOfGames);
    }

    private static final int ANY_NUMBER = 123;

    @Test
    public void shouldBePossibleToCompareTeams() {
        FootballTeam team = new FootballTeam(ANY_NUMBER);

        assertTrue(team instanceof Comparable, "FootballTeam should implement Comparable");
    }

    @Test
    public void teamsWithMoreMatchesWonShouldBeGreater() {
        int smallerNb = 2;
        FootballTeam teamWithSmallerNb = new FootballTeam(smallerNb);
        int greaterNb = 3;
        FootballTeam teamWithGreaterNb = new FootballTeam(greaterNb);

        assertTrue(teamWithGreaterNb.compareTo(teamWithSmallerNb) > 0,
                "team with " + greaterNb + " should be ranked before the team with " + smallerNb + " games won");
    }
}
