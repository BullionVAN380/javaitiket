import java.util.Scanner;

public class NumbrOfweek {
    public static void main (String[]args){

        Scanner CP=new Scanner(System.in);
        System.out.println("Enter any number between 1 and 7");
        int Days=CP.nextInt();

        switch (Days){
            case 7:
                System.out.println("SUNDAY");
                break;
            case 6:
                System.out.println("SARTURDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 4:
                System.out.println(" THURSDAY");
                break;
            case 3:
                System.out.println("WENSDAY");
                break;

            case 2:
                System.out.println("TUESDAY");
                break;
            default:
                System.out.println("MONDAY");

        }

    }
}
