package Inheritance.VehicleTask;

public class Audi extends Car {
    private int maxSpeed;
    private int changeOilMonths;

    public Audi(int maxSpeed, int changeOilMonths) {
        super("Audi", "A4", 5, 5, 5, true);
        this.maxSpeed = maxSpeed;
        this.changeOilMonths = changeOilMonths;
    }

    public void acceleraate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity < 20) {
            changeGear(1);
        } else if (newVelocity > 20 && newVelocity < 40) {
            changeGear(2);
        } else if (newVelocity > 40 && newVelocity < 60) {
            changeGear(3);

        } else
            changeGear(4);
        if (newVelocity > 0)
            changeVelocity(newVelocity, getCurrentDirection());
    }
}
