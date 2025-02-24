package Ex9;

public class Square extends Quadrangle implements Figure{

    public Square(int a, String color) {
        super(a, a, color);
    }

    @Override
    public double area() {
        return Math.pow(a, 2);
    }

    @Override
    public double perimeter() {
        return 4*a;
    }

    @Override
    public double getLargeDiagonal() {
        return a*Math.sqrt(2);
    }

    @Override
    public double getHeight() {
        return a;
    }

    @Override
    public String getColor() {
        return color;
    }
}
