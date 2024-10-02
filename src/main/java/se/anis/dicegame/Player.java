package se.anis.dicegame;

public class Player {
    private String playerName;
    private int score;

    private boolean hasPlayedTurn = false;

    public Player(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getPlayerName() {
        return playerName;
    }

    public boolean hasPlayedTurn() {
        return hasPlayedTurn;
    }

    public void setHasPlayedTurn(boolean hasPlayedTurn) {
        this.hasPlayedTurn = hasPlayedTurn;
    }
}





