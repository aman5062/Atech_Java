public class Method_overriding {
    public static void main(String[] args) {
       Dogs d = new Dogs();
       d.sounds();
       Animals a = new Animals();
       a.sounds();
    }
}
class Animals{//superclass
    void sounds(){
        System.out.println("Sound");
    }
}
class Dogs extends Animals{//subclass
    @Override
    void sounds(){
        System.out.println("Bhaw");
    }
}