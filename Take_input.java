import java.util.Scanner;

public class Take_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Integer value ");
        int a = sc.nextInt();
        System.out.print("Enter a Float Value ");
        float b = sc.nextFloat();
        System.out.print("Enter a String ");
        String c = sc.next();
        sc.close();
        System.out.println("Int- "+a);
        System.out.println("Float- "+b);
        System.out.println("String "+c);
    }
}
