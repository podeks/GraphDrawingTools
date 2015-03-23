package drawingcomponents;

/**
 *
 * @author pdokos
 */
public class VertexDrawingAtts {

    private final float DEFAULT_SIZE=(float) 2.0;

    private final double DEFAULT_R=1.0;
    private final double DEFAULT_G=0.1;
    private final double DEFAULT_B=0.2;

    double r;
    double g;
    double b;

    float size;

    public VertexDrawingAtts () {
        this.r = DEFAULT_R;
        this.g = DEFAULT_G;
        this.b = DEFAULT_B;
        size=DEFAULT_SIZE;
    }

    public VertexDrawingAtts(double a, double b, double c) {
        this.r = a;
        this.g = b;
        this.b = c;
        size=DEFAULT_SIZE;
    }

    public VertexDrawingAtts(double a, double b, double c, float s) {
        this.r = a;
        this.g = b;
        this.b = c;
        this.size = s;
    }

    public void setColor(double r, double g, double b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public double getR() {
        return r;
    }

    public double getG() {
        return g;
    }

    public double getB() {
        return b;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setG(double g) {
        this.g = g;
    }

    public void setB(double b) {
        this.b = b;
    }

    public float getSize() {
        return size;
    }

    public void setSize (float s) {
        size=s;
    }
}
