package team;

class FootballTeam implements Comparable<FootballTeam> {
    private int gamesWon;

    FootballTeam(int i) {
        if (i < 0)
            throw new IllegalArgumentException();
        gamesWon = i;
    }

    int getGamesWon() {
        return gamesWon;
    }

    public int compareTo(FootballTeam other) {
        return this.gamesWon - other.gamesWon;
    }
}
