public class BetMore_Game {
    public String result = "";
    public Computer p1;
    public Player_2 p2;

    public BetMore_Game(Computer p1, Player_2 p2) {
        this.p1 = p1;
        this.p2 = p2;
        result = announceWinner(p1, p2);
    }

    public String announceWinner(Computer p1, Player_2 p2) {
        if (p1.generatedNumber > p2.generatedNumber) {
            System.out.println("The winner is Computer!");
            return "lost";
        } else if (p1.generatedNumber < p2.generatedNumber) {
            System.out.println("The winner is Player 2!");
            return "won";
        } else {
            System.out.println("We have a draw!");
            return "drawn";
        }

    }
}