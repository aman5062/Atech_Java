public class recursion {
    public static void main(String[] args) {
        //Factorial
        int i = 7;
        System.out.println("Factorial is "+factorial(i));
    }
    public static int factorial(int i){
        if(i==0){
            //Base case
            return 1;
        }else{
            return i * factorial(i-1); //recursive case
        }
    }
}
// sum of n natural number -> user input
