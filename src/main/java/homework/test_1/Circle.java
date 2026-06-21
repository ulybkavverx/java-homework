package homework.test_1;

public class Circle {
    double radius;

    Circle(double someRadius) {
        this.radius = someRadius;
    }

    double getRadius() {
        return this.radius;
    }
    void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    double calculateArea() { // площадь
        return Math.PI * this.radius * this.radius;
    }

    double calculateCircumference() { // длина окружности
        return 2 * Math.PI * this.radius;
    }
}
