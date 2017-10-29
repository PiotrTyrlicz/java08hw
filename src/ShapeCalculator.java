public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {


    @Override
    public double circleArea(Circle circle) {
        return GeometricShape.PI * Math.pow(circle.getA(), 2);
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        return rectangle.getA() * rectangle.getB();
    }

    @Override
    public double ballVolume(Ball ball) {
        return (4 * GeometricShape.PI * Math.pow(ball.getRa(), 3)) / 3;
    }

    @Override
    public double cubeVolume(Cube cube) {
        return Math.pow(cube.getRa(),3);
    }



}
