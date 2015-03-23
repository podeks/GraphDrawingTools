package drawingcomponents;

/**
 *
 * @author pdokos
 */
public class EdgeDrawingAtts {

    private final float DEFAULT_WIDTH=1.0f;

    double r;
    double g;
    double b;

    float width;

    public EdgeDrawingAtts () {
        this.r = 0.7;
        this.g = 0.2;
        this.b = 0.8;
        this.width = DEFAULT_WIDTH;
    }

    public EdgeDrawingAtts(double a, double b, double c) {
        this.r = a;
        this.g = b;
        this.b = c;
        this.width = DEFAULT_WIDTH;
    }

    public EdgeDrawingAtts(double a, double b, double c, float w) {
        this.r = a;
        this.g = b;
        this.b = c;
        this.width = w;
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

    public float getWidth() {
        return width;
    }

    public void setWidth (float w) {
        width=w;
    }
}
