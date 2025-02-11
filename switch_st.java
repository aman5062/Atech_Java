import java.util.Scanner;
public class switch_st {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int i = sc.nextInt();
        switch (i%2){
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
                break;
            default:
                System.out.println("No value");
        }
    }
}
// weekdays 1 - sunday
//2 - monday 