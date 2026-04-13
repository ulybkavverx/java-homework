package test_1;

public class Point {
    double x;
    double y;

    Point(double someX, double someY) {
        this.x = someX;
        this.y = someY;
    }

    double getX() {
        return this.x;
    }
    double getY() {
        return this.y;
    }

    void setX(double newX) {
        this.x = newX;
    }

    void print() {
        System.out.println("Координаты x: " + this.x + ", координаты y: " + this.y);
    }
}
