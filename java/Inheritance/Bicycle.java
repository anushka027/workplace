package Inheritance;

class Bicycle {
    protected int gear ;
    protected int speed ;
    public Bicycle(int startSpeed , int startGear){
        gear = startGear;
        speed = startSpeed ;
    }

    public void getGear (int newValue){
        gear = newValue;
    }
    public void speedUp (int increment){
        speed+= increment;
    }
    public void applyBrake (int decrement){
        speed-= decrement;
    }
}
