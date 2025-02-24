package Ex9;

public class Rhombuses extends Quadrangle implements Figure{
    double alpha, beta;

    public Rhombuses(int a, String color, double alpha, double beta) {
        super(a, a, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double area() {
        return Math.pow(a,2)*Math.sin(Math.min(alpha, beta));
    }

    @Override
    public double perimeter() {
        return 4*a;
    }

    @Override
    public double getLargeDiagonal() {
        return Math.max((2*a*Math.cos(Math.toRadians(Math.min(alpha,beta)/2))), (2*a*Math.sin(Math.toRadians(Math.min(alpha,beta)/2))));
    }

    @Override
    public double getHeight() {
        return a*Math.sin(Math.min(alpha, beta)/2);
    }

    @Override
    public String getColor() {
        return color;
    }
}
