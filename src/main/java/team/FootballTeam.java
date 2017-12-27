package team;

class FootballTeam {
    private int gamesWon;

    FootballTeam(int i) {
        if (i < 0)
            throw new IllegalArgumentException();
        gamesWon = i;
    }

    int getGamesWon() {
        return gamesWon;
    }
}
