public class Shuffle {
    public static int generateNumber(){
        int min = 1;
        int max = 100;
        int range = max-min+1;
        int x = (int)(Math.random() * range) + min;
        return x;
    }
}
