interface Shape
{
    public void getArea(int x, int y);
}
class Rectangle implements Shape
{
    public void getArea(int x, int y)
    {
        System.out.println(x*y);
    }
}
class Circle implements Shape
{
    public void getArea(int x, int y)
    {
        System.out.println(3.14*x*y);
    }
}
class Triangle implements Shape
{
    public void getArea(int x, int y)
    {
        System.out.println(0.5*x*y);
    }
}
public class cl
{
    public static void main(String[] args)
    {
        Shape s;
        s = new Rectangle();
        s.getArea(2,5);
        s = new Circle();
        s.getArea(4,4);
        s = new Triangle();
        s.getArea(2,8);
    }
}

