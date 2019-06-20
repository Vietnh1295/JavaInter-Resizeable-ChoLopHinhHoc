public class Circle extends Shape implements Resizeable{
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public void seterFilled(boolean Filled) {
        this.filled = Filled;
    }

    public double getterRaius() {
        return this.radius;
    }

    public void setterRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimenter() {
        return this.radius * 2 * Math.PI;
    }

    public String toString() {
        return "A Circle with radius= " + this.getterRaius() + ", which is a subclass of " + super.toString();
    }
    public void resize(double percent)
    {
        this.radius=(getterRaius()*percent/100)+getterRaius();
    }
}
