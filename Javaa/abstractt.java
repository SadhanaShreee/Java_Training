abstract class Vehicle{
    abstract void complyRegl();
    abstract void checkCapacity();
}
class Car extends Vehicle{
    @Override
    void complyRegl(){
        System.out.println("Comply Regl checked");
    }

    @Override
    void checkCapacity(){
        System.out.println("Capacity checked");
    }

}
public class abstractt{
    public static void main(String[] args) {
        Car c = new Car();
        c.complyRegl();
        c.checkCapacity();
    }
}

    

