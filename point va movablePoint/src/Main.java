public class Main {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(1, 5, 1, 1);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }

}
