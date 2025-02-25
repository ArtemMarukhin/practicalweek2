package Ex9;

public class Rhombuses extends Quadrangle implements Figure{
    double alpha, beta;

    public Rhombuses(int a, double alpha, double beta, String color) {
        super(a, a, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double area() {
        return a*a*Math.sin(Math.min(Math.toRadians(alpha), Math.toRadians(beta)));
    }

    @Override
    public double perimeter() {
        return 2*(a+b);
    }

    @Override
    public double getLargeDiagonal() {
        return Math.max(a*Math.sqrt(2-2*Math.cos(Math.toRadians(beta))), a*Math.sqrt(2-2*Math.cos(Math.toRadians(alpha))));
    }

    @Override
    public double getHeight() {
        return a*Math.sin(Math.toRadians(alpha));
    }

    @Override
    public String getColor() {
        return color;
    }
}
