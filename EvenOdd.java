import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        int no = input.nextInt();
        if (no%2==0){
            System.out.println(no + " is even.");
        }
        else{
            System.out.println(no +" is odd.");
        }
    }
}
