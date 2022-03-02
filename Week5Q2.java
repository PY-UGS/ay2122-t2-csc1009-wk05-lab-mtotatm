package Week5;

public class Week5Q2
{
    public static void main(String[] args)
    {
        RectangleQ2 r = new RectangleQ2(9,5);
        TriangleQ2 t = new TriangleQ2(10,8);
        CircleQ2 c = new CircleQ2(5,5);
        EllipseQ2 e = new EllipseQ2(7,7);
        SquareQ2 s = new SquareQ2(6,6);
        Shape figref;
        figref = r;
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area is " + figref.area());
        figref = c;
        System.out.println("Area is " + figref.area());
        figref = e;
        System.out.println("Area is " + figref.area());
        figref = s;
        System.out.println("Area is " + figref.area());
    }
}
