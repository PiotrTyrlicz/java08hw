public class LineCalc {
    public double lineLength(Line2D line) {
        return Math.sqrt(Math.pow((line.getB() - line.getA()), 2) + Math.pow((line.getY() - line.getX()), 2));
    }

}
