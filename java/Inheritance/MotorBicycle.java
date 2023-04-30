package Inheritance;

class MotorBicycle extends Bicycle implements TwoWheeler , Vehicle {

    public int seatHeight;

    public MotorBicycle( int startHeight , int startSpeed, int startGear) {
        super(startSpeed, startGear);
        this.seatHeight  = startHeight;
    }
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
    public void canDrive() {
        System.out.println("is a vehicle");
    }
    public void twoWheeler() {
        System.out.println("is a two wheeler");
    }
    
}
