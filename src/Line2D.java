public class Line2D extends Shape2D {
    private double x;
    private  double y;

    public Line2D(String shape, double a, double b, double x, double y) {
        super(shape, a, b);
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
