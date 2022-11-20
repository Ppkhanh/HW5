import java.util.Scanner;

public class Player {
    public int generatedNumber;
    public int balance = 100;
    public int bet;

    public Player() {
        
    }

    public void pickCard() {
        generatedNumber = Shuffle.generateNumber();
    }

    public void bet() {
        System.out.println("How much do you bet for your number (from 0 to 100)?");
        Scanner scan = new Scanner(System.in);
        int ans = Integer.parseInt(scan.nextLine());
        this.bet = ans;
        scan.close();

    }
}