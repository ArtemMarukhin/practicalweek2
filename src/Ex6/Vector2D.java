package Ex6;

public class Vector2D extends Vector{

    public Vector2D(int x1, int y1, int x2, int y2) {
        super(x1, y1, 0, x2, y2, 0);
    }

    @Override
    public double getLength() {
        return  Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2));
    }

    @Override
    public String getVectorCords() {
        return (x2 - x1) + " " + (y2 - y1);
    }
    public double getScalarProduct (Vector2D vector){
        String cords = getVectorCords();
        String cords2 = vector.getVectorCords();

        return Integer.parseInt(cords.split(" ")[0]) * Integer.parseInt(cords2.split(" ")[0])+
        Integer.parseInt(cords2.split(" ")[1]) * Integer.parseInt(cords.split(" ")[1]);
//        return (x1)*(vector.x1) + (vector.y2)*(y2);
    }
    public double getAngle(Vector2D vector){
        if(vector.getLength() != 0 && getLength() != 0){
            return getScalarProduct(vector)/(getLength() * vector.getLength());
        } else {
            return 2.0;
        }
    }
}
