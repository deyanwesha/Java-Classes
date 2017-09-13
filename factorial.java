import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = input.nextInt();
        System.out.println("Factorial is " + factorial(num));
    }
    public static int factorial(int x){
        if(x == 1){ return 1;}
        return x*factorial(x-1);
    }
}
