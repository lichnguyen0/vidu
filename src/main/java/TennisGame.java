public class TennisGame {
    private int scoreOfPlayer1 = 0;
    private int scoreOfPlayer2 = 0;
    private final String player1Name;
    private final String player2Name;

    private static final String[] SCORE_NAMES = {"Love", "Fifteen", "Thirty", "Forty"};

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name)) {
            scoreOfPlayer1++;
        } else {
            scoreOfPlayer2++;
        }
    }

    public String getScore() {
        if (isTie()) {
            return getTieScore();
        }

        if (isEndGame()) {
            return getEndGameScore();
        }

        return getNormalScore();
    }

    private boolean isTie() {
        return scoreOfPlayer1 == scoreOfPlayer2;
    }

    private boolean isEndGame() {
        return scoreOfPlayer1 >= 4 || scoreOfPlayer2 >= 4;
    }

    private String getTieScore() {
        if (scoreOfPlayer1 >= 3) {
            return "Deuce";
        }
        return SCORE_NAMES[scoreOfPlayer1] + "-All";
    }

    private String getEndGameScore() {
        int scoreDifference = scoreOfPlayer1 - scoreOfPlayer2;
        if (scoreDifference == 1) {
            return "Advantage " + player1Name;
        } else if (scoreDifference == -1) {
            return "Advantage " + player2Name;
        } else if (scoreDifference >= 2) {
            return "Win for " + player1Name;
        } else {
            return "Win for " + player2Name;
        }
    }

    private String getNormalScore() {
        return SCORE_NAMES[scoreOfPlayer1] + "-" + SCORE_NAMES[scoreOfPlayer2];
    }
}
