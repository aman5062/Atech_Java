import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Testt t = new Testt();
        t.getob().display();
    }
}
class Testt{
    Testt getob(){
        System.out.println("This is me  s");
        return this;

    }
    void display(){
        System.out.println("this is me");
    }
}