import java.util.Random;

public class DiceGame{
    public static void main(String[] args){
        Random random = new Random();
        System.out.println("Rolling dice...");
        int dicenum1 = random.nextInt(6)+1;
        int dicenum2 = random.nextInt(6)+1;
        System.out.println("Die 1: "+dicenum1);
        System.out.println("Die 2: "+dicenum2);
        int total = dicenum1+dicenum2;
        System.out.println("Total value: " + total);
    }
}
