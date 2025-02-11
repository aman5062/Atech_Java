public class oops {
    public static void main(String[] args) {
        Car c1 = new Car("x1","blue",1955);
        Car c2 = new Car();
        Car c3 = new Car("X3");
        c1.display();
        c2.display();
        c3.display();
    }
}
class Car{
   String model;
   String color;
   int launchYear;
   Car(String model,String color,int launchYear){
        this.model = model;
        this.color = color;
        this.launchYear = launchYear;
    }
    Car(){
        model = "x2";
        color = "black";
        launchYear = 1954;
    }
    Car(String model){
       this.model = model;
       this.color = "Brown";
       this.launchYear = 2002;
    }
   void display(){
       System.out.println("Model= "+model+" Color= "+color+" launch on "+launchYear);
   }
}

//Mobile ->