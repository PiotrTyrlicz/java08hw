public class ShapeTest {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        Shape circ1 = new Circle("Kolo1", 2, 1);
        Circle circ2 = new Circle("Kolo2", 3, 0);

        System.out.println("Pole kola: " + shapeCalculator.circleArea((Circle) circ1));
        System.out.println("Pole kola: " + shapeCalculator.circleArea(circ2));


        Shape ball1 = new Ball("Kula", 1, 3, 5, 13);
        Shape cube1 = new Cube("Kostka", 1, 1, 2, 3);

        System.out.println("Objectosc kuli: " + shapeCalculator.ballVolume((Ball) ball1));
        System.out.println("Objectosc kostki: " + shapeCalculator.cubeVolume((Cube) cube1));


    }
}
