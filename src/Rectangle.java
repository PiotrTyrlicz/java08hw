public class Rectangle extends GeometricShape {

    public String toString() {
        return "Rectangle{}"+super.getShapeType()+super.getA();
    }

    public Rectangle(String shape, int a, int b) {
        super(shape, a, b);



    }
}
