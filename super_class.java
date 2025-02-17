public class super_class {
    public static void main(String[] args) {
        C c = new C();
    }
}
class A{
    A(){
        System.out.println("A");
    }
}
class B extends A{
    B(){
        super(); // call the A's constructor
        System.out.println("B");
    }
}
class C extends B{
    C(){
        super();
        System.out.println("C");
    }
}