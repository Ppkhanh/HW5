import java.util.Scanner;

public class Player_2 extends Player{
    public Player_2(){
        System.out.println("Welcome! You're Player 2");
        System.out.println("You have a balance of 100 coins");
        pickCard();
        super.bet();
    }
    public void pickCard(){
        int rand = 0;
        String ans = "";
        int count = 0;
       while(!ans.equals("yes") || count<=5){
        if(count==5){
            System.out.println("You've run out of turns");
            System.out.println("You must keep the number "+ rand);
            break;
        }
        if(ans.equals("yes")){
            break;
        }
       super.pickCard();
          System.out.println("Your number is "+ rand);
          System.out.println("Are you satisfied with your number \n" +"***Only answer with 'yes' or 'no'");
             // Create a Scanner object
          Scanner scan = new Scanner(System.in); 
          ans = scan.nextLine();
          count++;
       } 
       super.generatedNumber = rand;
    }


    // public static void main(String[] args) {
    //    Player_2 p2 = new Player_2();
    //    p2.pickCard();
    //     }
}
