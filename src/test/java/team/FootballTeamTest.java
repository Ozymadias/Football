package team;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FootballTeamTest {

    @Test
    public void constructorShouldSetGamesWon() {
        FootballTeam team = new FootballTeam(3);
        assertEquals(team.getGamesWon(), 3,
                "3 games were passed to constructor, but " + team.getGamesWon() + " were returned");
    }
}
