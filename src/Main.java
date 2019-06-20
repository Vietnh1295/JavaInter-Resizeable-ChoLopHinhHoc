public class Main
{
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle(5);
        shapes[1]=new Square(4);
        shapes[2]=new Rectangle(3,4);
        for(Shape shape:shapes){
            System.out.println(shape);
        }
        for(Shape shape:shapes){
            ((Resizeable)shape).resize(100);
            System.out.println(shape);
        }

    }
}
