package drawingcomponents;

/**
 *
 * @author pdokos
 */
public class CartesianPoint3D {
    private double x;
    private double y;
    private double z;

    public CartesianPoint3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public CartesianPoint3D(double a, double b, double c) {
        this.x = a;
        this.y = b;
        this.z = c;
    }

    public void setPosition(double a, double b, double c) {
        this.x = a;
        this.y = b;
        this.z = c;
    }

    public void setX(double a) {
        this.x = a;
    }

    public void setY(double a) {
        this.y = a;
    }

    public void setZ(double a) {
        this.z = a;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
    
    public CartesianPoint3D negative() {
        return new CartesianPoint3D(-x, -y, -z);
    }

}
