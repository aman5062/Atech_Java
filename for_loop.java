import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        // User input -
        // print table for that

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int num = sc.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(num + "X" + i + " = "+i*num);
        }

    }
}
