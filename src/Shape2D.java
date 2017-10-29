public abstract class Shape2D extends Shape{
    private double a;
    private double b;

    public Shape2D(String shape, double a, double b) {
        super(shape);
        this.a = a;
        this.b = b;
    }

    public double getA() {

        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Shape2D{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }


}
