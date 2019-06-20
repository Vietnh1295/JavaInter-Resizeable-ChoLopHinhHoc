public class Square extends Rectangle implements Resizeable {
    private double size = 1.0;

    public Square() {

    }

    public Square(double size) {
        this.size = size;
    }

    public Square(double size, String color, boolean fill) {
        super(size, size, color, fill);
        this.size = size;
    }

    public double getSize() {
        return this.size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String toString() {
        return "Square has" + getSize() + " and " + super.toString();
    }

    public void resize(double percent) {
        this.size = (this.size * percent/100) + this.size;
    }
}
