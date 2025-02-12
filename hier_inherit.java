public class hier_inherit {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound("Bhaw");
        Cat c = new Cat();
        c.sound("Meow");
    }
}
class Animal{
    void sound(String s){
        System.out.println(s);
    }
}
class Dog extends Animal{
}
class Cat extends Animal{
}


//Task - single, multilevel and hierarchical 