import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args){
        daysInMonth();
    }
    public static void daysInMonth(){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the month no.(From 1 to 12)");
        int no = input.nextInt();
        if(no <= 7){
            if(no == 2){
                System.out.println("No. of days is 28");
            }
            else if(no%2 == 0){
                System.out.println("No. of days is 30");
            }
            else{
                System.out.println("No. of days is 31");
            }
        }
        else if(no > 7){
            if (no%2 == 0){
                System.out.println("No. of days is 31");
            }
            else{
                System.out.println("No. of days is 30");
            }
        }
    }
}
