public class Game_Chair {

    public Game_Chair(Computer p1, Player_2 p2) {
       findWinner(p1, p2);
    }

    public void findWinner(Computer p1, Player_2 p2){
        BetMore_Game game = new BetMore_Game(p1, p2);
        if (game.result=="won"){
         System.out.println("Player 2 earned " + p2.bet +" in their balance");
         p2.balance += p2.bet;
        } else if(game.result == "lost"){
         System.out.println("Player 2 lost " + p2.bet +" from their balance");
         p2.balance -= p2.bet;
        } else{
         System.out.println("Player 2 earned half of the bet: " + p2.bet/2 +" in their balance");
         p2.balance += p2.bet/2;
        }
        System.out.println("Your balance is now "+ p2.balance);
    }
}
