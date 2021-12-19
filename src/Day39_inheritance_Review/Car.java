package Day39_inheritance_Review;

public class Car extends Vehicle{

    private int wheels;
    private int door;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size, int wheels, int door, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.door = door;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }
    public void changeGear(int currentGear){
        this.currentGear=currentGear;
    }
    public void changeVelocity(int speed,int direction){
        System.out.println("Car.changeVelocity():Velocity "+speed+" direction "+direction);
        super.move(speed, direction);
        move(speed,direction);
    }
    public void move(int velocity,int direction){
        //  direction+=10;
        setCurrentDirection(direction+10);
        setCurrentVelocity(velocity+10);
        System.out.println("Vehicle.move():Moving at "+getCurrentVelocity()+" in direction "+getCurrentDirection());
    }
}
