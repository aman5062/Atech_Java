import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Mk m = new Mk();
    }
}
class Mk{
    Mk(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        if (sc.hasNextInt()){
            int i = sc.nextInt();
            choice(i);
        } else if (sc.hasNextDouble()) {
            Double i = sc.nextDouble();
            choice(i);
        } else {
            String i = sc.next();
            choice(i);
        }
    }
    void choice(int i){
        System.out.println(i+" is a integer value");
    }
    void choice(String i){
        System.out.println(i+" is a String value");
    }
    void choice(Double i){
        System.out.println(i+" is a Double value");
    }
}