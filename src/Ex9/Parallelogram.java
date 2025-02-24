package Ex9;

public class Parallelogram extends Quadrangle implements Figure{
    double alpha, beta;

    public Parallelogram(int a, int b, String color, double alpha, double beta) {
        super(a, b, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double area() {
        return a*b*Math.sin(Math.toRadians(Math.min(alpha, beta)));
    }

    @Override
    public double perimeter() {
        return 2*(a+b);
    }

    @Override
    public double getLargeDiagonal() {
        return Math.max(Math.sqrt(Math.pow(a, 2)+Math.pow(b,2)+
                        2*a*b*Math.min(Math.toRadians(alpha),Math.toRadians(beta))),
                Math.sqrt(Math.pow(a, 2)+Math.pow(b,2)-
                        2*a*b*Math.min(Math.toRadians(alpha),Math.toRadians(beta))));
    }

    @Override
    public double getHeight() {
        return Math.min(area()/Math.min(a,b), area()/Math.max(a,b));
    }

    @Override
    public String getColor() {
        return color;
    }
}
