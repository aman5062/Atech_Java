import java.util.Scanner;
public class methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number btw 1-7 : ");
        int i = sc.nextInt();
        switch (i){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
        que(i);
    }
    public static int que(int i){
        Scanner s = new Scanner(System.in);
        System.out.println("Do you want to know Previous and next days? (Y or N)");
        String ans = s.next();
        switch (ans){
            case "Y":
                System.out.println("Next day is : "+know(i+1));
                System.out.println("Previous day is : "+know(i-1));
                break;

            case "y":
                System.out.println("Next day is : "+know(i+1));
                System.out.println("Previous day is : "+know(i-1));
                break;
            default:
                break;
        }
        return 0;
    }
    public static String know(int i){
        switch (i){
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
        }
      return "None";
    }
}