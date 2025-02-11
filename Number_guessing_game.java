import java.util.Random;
import java.util.Scanner;
public class Number_guessing_game {
    public static void main(String[] args) {
        Random ram = new Random();
        int num = ram.nextInt(100);
        Scanner sc = new Scanner(System.in);
        int user_input,point = 100;
        boolean matched = false;
        while(!matched){
            System.out.print("Enter a number : ");
            user_input = sc.nextInt();
            if(user_input==num){
                System.out.println("You win !!");
                System.out.println("Points : "+point);
                matched = true;
            } else if (user_input>num) {
                System.out.println("Think small.");
                point--;
            }else{
                System.out.println("Thing big");
                point--;
            }
        }
    }
}

