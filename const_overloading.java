public class const_overloading {
    public static void main(String[] args) {
        T t = new T();
    }
}
class T{
    int i;
    T(){
        this(5);
        System.out.println("this is me");
    }
    T(int i){
        this("A");
        this.i = i;
        System.out.println(i);
    }
    T(String s){
//        this(5);   // This sequence is forming recursion situation that's why it's not allowed.
        System.out.println(s);
    }
}

// class
