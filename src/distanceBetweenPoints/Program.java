package distanceBetweenPoints;

public class Program{
    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(),2)+Math.pow(a.getY() - b.getY(),2));
    }

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
//        a.setX(12);
        System.out.println(a.getInfo());
//        a = new Point2D();
        Point2D b = new Point2D(0);
        System.out.println(b.getInfo());

        System.out.println(distance(a, b));
    }
}
