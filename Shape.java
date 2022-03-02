package Week5;

abstract class Shape
{
    double dim1,dim2;
    double PI = 3.14159265358979;

    Shape(int dim1, int dim2)
    {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract Double area();
}

class RectangleQ2 extends Shape
{
    RectangleQ2(int dim1, int dim2)
    {
        super(dim1, dim2);
    }

    public Double area()
    {
        double area = dim1 * dim2;
        double roundOff = Math.round(area*100.0)/100.0;
        System.out.println("Inside Area for Rectangle.");
        return roundOff;
    }
}

class TriangleQ2 extends Shape
{
    TriangleQ2(int dim1, int dim2)
    {
        super(dim1, dim2);
    }

    public Double area()
    {
        double area = (dim1*dim2)/2;
        double roundOff = Math.round(area*100.0)/100.0;
        System.out.println("Inside Area for Triangle.");
        return roundOff;
    }
}

class CircleQ2 extends Shape
{
    CircleQ2(int dim1, int dim2)
    {
        super(dim1, dim2);
    }

    public Double area()
    {
        double area = PI * dim1 * dim2;
        double roundOff = Math.round(area*100.0)/100.0;
        System.out.println("Inside Area for Circle.");
        return roundOff;
    }
}

class EllipseQ2 extends Shape
{
    EllipseQ2(int dim1, int dim2)
    {
        super(dim1, dim2);
    }

    public Double area()
    {
        double area = PI*dim1*dim2;
        double roundOff = Math.round(area*100.0)/100.0;
        System.out.println("Inside Area for Ellipse.");
        return roundOff;
    }
}

class SquareQ2 extends Shape
{
    SquareQ2(int dim1, int dim2)
    {
        super(dim1, dim2);
    }

    public Double area()
    {
        double area = dim1 * dim2;
        double roundOff = Math.round(area*100.0)/100.0;
        System.out.println("Inside Area for Square.");
        return roundOff;
    }
}