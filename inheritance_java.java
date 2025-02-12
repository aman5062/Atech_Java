public class inheritance_java {
    public static void main(String[] args) {
        Honda h1 = new Honda();
        h1.name_of_car("Car1");
        h1.car_model();
        h1.body_type();
    }
}
class Body_makers{
    void body_type(){
        System.out.println("Platinum body");
    }
}
class Cars extends Body_makers{
    String car_name;
    void name_of_car(String car_name){
        this.car_name = car_name;
        System.out.println("Car name is "+car_name);
    }
}
class Honda extends Cars{
    void car_model(){
        System.out.println("Honda city");
    }
}