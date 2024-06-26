package assignment_1_part_2;

abstract class GeometricObject implements Comparable<GeometricObject> {
    public abstract double getArea();

    public static GeometricObject max(GeometricObject obj1, GeometricObject obj2) {
        return (obj1.compareTo(obj2) > 0) ? obj1 : obj2;
    }

    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}

class Circle extends GeometricObject {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius;
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * (getRadius() + height);
    }

    public double getVolume() {
        return Math.PI * getRadius() * getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cylinder with radius " + getRadius() + " and height " + height;
    }
}

class ComparableCylinder extends Cylinder {
    public ComparableCylinder(double radius, double height) {
        super(radius, height);
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (o instanceof ComparableCylinder) {
            return Double.compare(this.getVolume(), ((ComparableCylinder) o).getVolume());
        }
        return super.compareTo(o);
    }

    @Override
    public String toString() {
        return "ComparableCylinder with radius " + getRadius() + " and height " + getHeight();
    }
}

interface Colorable {
    void howToColor();
}

class Square extends GeometricObject implements Colorable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public String toString() {
        return "Square with side " + side;
    }
}

public class GeometricObjects {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(3);

        System.out.println("Larger Circle: " + GeometricObject.max(circle1, circle2));

        ComparableCylinder cylinder1 = new ComparableCylinder(3, 5);
        ComparableCylinder cylinder2 = new ComparableCylinder(4, 4);

        System.out.println("Larger Cylinder: " + (cylinder1.compareTo(cylinder2) > 0 ? cylinder1 : cylinder2));

        Square square = new Square(4);
        System.out.println(square);
        square.howToColor();
    }
}
