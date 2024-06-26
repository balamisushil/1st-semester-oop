package assignment_1_part_1;

class Rectangle {
    private double width;
    private double height;
    private static String color;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    public static void setColor(String color) {
        Rectangle.color = color;
    }

    public static String getColor() {
        return color;
    }
}

public class MyRectangle {
    public static void main(String[] args) {
        Rectangle.setColor("Yellow");
        Rectangle rect1 = new Rectangle(5, 50);
        Rectangle rect2 = new Rectangle(5, 50);

        System.out.println("Rectangle 1: Width = " + rect1.getWidth() + ", Height = " + rect1.getHeight() + ", Color = " + Rectangle.getColor() + ", Area = " + rect1.getArea());
        System.out.println("Rectangle 2: Width = " + rect2.getWidth() + ", Height = " + rect2.getHeight() + ", Color = " + Rectangle.getColor() + ", Area = " + rect2.getArea());
    }
}
