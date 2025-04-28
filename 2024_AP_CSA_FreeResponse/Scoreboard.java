//write the Scoreboard class
public class Scoreboard {

    private String team1 = "";
    private String team2 = "";
    private int team1score = 0;
    private int team2score = 0;
    private int turn = 1;

    public Scoreboard(String team1in, String team2in) {
        team1 = team1in;
        team2 = team2in;
    }

    public void recordPlay(int scored) {
        if (scored > 0) {
            if (turn == 1) {
                team1score += scored;
            } else {
                team2score += scored;
            }
        } else {
            if (turn == 1) {
                turn = 2;
            } else {
                turn = 1;
            }
        }
    }

    public String getScore() {
        if (turn == 1) {
            return team1score + " - " + team2score + " " + team1;
        } else {
            return team1score + " - " + team2score + " " + team2;
        }
    }
}