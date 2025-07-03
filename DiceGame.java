import java.util.Random;
import java.util.Scanner;

public class DiceGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name");
        System.out.print(">");
        String name = sc.next();
        System.out.println("Hello, "+ name+"!");
        
        
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
