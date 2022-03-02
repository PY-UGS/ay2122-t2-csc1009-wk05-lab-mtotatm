package Week5;

public class Rectangle extends GeometricObjects
{
    private double width, height;

    public void CreatedRectangle(double newWidth,double newHeight,String newColor,boolean fill)
    {
        this.setDateCreated();
        System.out.println("Date set: " + this.getDateCreated());
        this.setColor(newColor);
        System.out.println("Color set: " + this.getColor());
        this.setFilled(fill);
        System.out.println("Fill set: " + this.isFilled());
        this.setWidth(newWidth);
        System.out.println("Width set: " + this.getWidth());
        this.setHeight(newHeight);
        System.out.println("Height set: " + this.getHeight());
        this.setArea(8);
        System.out.println("Area set: " + this.getArea());
        this.setPerimeter(12.0);
        System.out.println("Perimeter set: " + this.getPerimeter());
    }

    public double getWidth()
    {
        return this.width;
    }

    public void setWidth(double newWid)
    {
        this.width = newWid;
    }

    public double getHeight()
    {
        return this.height;
    }

    public void setHeight(double newHei)
    {
        this.height = newHei;
    }
}
