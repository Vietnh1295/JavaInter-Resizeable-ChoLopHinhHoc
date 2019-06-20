public class Shape {
    private  String color="green";
    boolean filled=true;
    public Shape()
    {
    }
    public  Shape(String color,boolean filled)
    {
this.color=color;
this.filled=filled;
    }
    public String getterColor()
    {
        return this.color;
    }
    public boolean getterFilled()
    {
        return this.filled;
    }
    public void seterColor(String Color)
    {
        this.color=Color;
    }
    public void seterFilled(boolean Filled)
    {
        this.filled=Filled;
    }
    public String toString()
    {
        return "A Shape with color of "+this.color+" and "+(this.filled?"filled":"not filled");
    }
}
