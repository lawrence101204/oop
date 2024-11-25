public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color, boolean filled) {
        super(color, filled); // Call Shape's constructor
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "A Rectangle with width " + String.format("%.2f", width) +
               " and length " + String.format("%.2f", length) +
               ", which is a subclass of " + super.toString();
    }
}
