public class methods_overloading {
    public static void main(String[] args) {
        s(5,6);
        s(5.6,9.6);
        s("Hello","World");
        s("Its ",9);
    }
//bmi = age, height, weight
    public static void s(int a, int b){
        System.out.println(a+b + "This is an integer value");
    }
    public static void s(double a,double b){
        System.out.println(a+b + " This is a double value");
    }
    public static void s(String a, String b){
        System.out.println(a+b + " This is a string value");
    }
    public static void s(String a, int b){
        System.out.println(a+b + " This is a string and int value");
    }
}