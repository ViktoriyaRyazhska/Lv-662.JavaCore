package lesson_5_CW;

public class Truck extends Car{
    int speed;
    int hours;
    int petrol;
    @Override
    public double run() {
        return speed*hours;
    }

    @Override
    public double stop() {
        return (speed*hours)/petrol;
    }


}
