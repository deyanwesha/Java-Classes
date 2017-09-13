import java.util.Random;
import java.util.Scanner;
public class GameOddsEvens {
    public static void main(String[] args) {
        PickOddsEvens();
        PlayGame();
        WhoWon();
    }

    public static String PickOddsEvens() {
        Scanner input = new Scanner(System.in);
        System.out.println("****************************************");
        System.out.println("Let’s play a game called “Odds and Evens");
        System.out.print("What is your name?");
        String name = input.nextLine();
        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens?");
        String oe = input.next();
        if (oe.equals("O")) {
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else if (oe.equals("E")) {
            System.out.println(name + " has picked evens! The computer will be odds.");
        }
        System.out.println("****************************************");
        
    }

    public static int PlayGame() {
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------------------");
        System.out.print("How many “fingers” do you put out?");
        int userNumber = input.nextInt();
        Random rand = new Random();
        int computerNumber = rand.nextInt(6);
        System.out.println("The computer plays " + computerNumber + " fingers");
        int sum;
        sum = userNumber + computerNumber;
        System.out.println(userNumber + "+" + computerNumber + "=" + sum);
        if (sum % 2 == 0) {
            System.out.println(sum + "....is even!");
        } else {
            System.out.println(sum + "....is odd!");
        }
        System.out.println("-----------------------------------------");
        
    }

    public static void WhoWon() {

        if (sum % 2 == 0) {
            if (oe.equals("E")) {
                System.out.println("You Win!!");
            } else {
                System.out.println("Computer Wins!!");
            }
        }
        else {
                if (oe.equals("O")) {
                    System.out.println("You Win!!");
                } else {
                    System.out.println("Computer Wins!!");
                }

            }
        System.out.println("-----------------------------------------");
        }
    }
