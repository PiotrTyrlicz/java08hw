public abstract class Shape3D extends Shape{

    private double x;
    private double y;
    private double z;
    private double r;

    public Shape3D(String shape, double x, double y, double z, double r) {
        super(shape);
        this.x = x;
        this.y = y;
        this.z = z;
        this.r = r;
    }

    @Override
    public String toString() {
        return "Shape3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", ra=" + r +
                '}';
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

    public double getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double getRa() {
        return r;
    }

    public void setRa(int ra) {
        this.r = r;
    }



}
