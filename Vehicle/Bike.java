package Vehicle;

public class Bike implements IBike {
    int speed;
    int gear;
    @Override
    public void changeGear(int newGear){
        gear=newGear;
    }
    @Override
    public void speedUp(int increment){
        speed=speed+increment;
    }
    @Override
    public void applyBrakes(int decrement){
        speed=speed-decrement;
    }
    public void printStates(){
        System.out.println("Speed: "+speed+" Gear: "+gear);
    }
}
