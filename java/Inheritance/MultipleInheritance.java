package Inheritance;

public class MultipleInheritance {
    public static void main (String args[]){
    MotorBicycle motorBicycle = new MotorBicycle(20, 10, 2);
        System.out.println(motorBicycle.gear);
        System.out.println(motorBicycle.speed);
        System.out.println(motorBicycle.seatHeight);

        motorBicycle.speedUp(2);
        System.out.println(motorBicycle.speed);
        motorBicycle.applyBrake(1);
        System.out.println(motorBicycle.speed);

        motorBicycle.twoWheeler();
        motorBicycle.canDrive();
}
}
