package Ex7;

public abstract class Transport {
    int fuel, speed;
    public abstract boolean canMove(int n);
    public abstract int getFuelLevel();

    public Transport(int fuel, int speed) {
        this.fuel = fuel;
        this.speed = speed;
    }
}
