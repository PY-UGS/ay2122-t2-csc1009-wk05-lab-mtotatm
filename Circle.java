package Week5;

public class Circle extends GeometricObjects
{
    private double radius,diameter;

    public void CreatedCircle(double rad,String newColor,boolean fill)
    {
        this.setDateCreated();
        System.out.println("Date set: " + this.getDateCreated());
        this.setColor(newColor);
        System.out.println("Color set: " + this.getColor());
        this.setFilled(fill);
        System.out.println("Fill set: " + this.isFilled());
        this.setRadius(rad);
        System.out.println("Radius set: " + this.getRadius());
        this.setArea(3.14159265358979); //3.141592653589793
        System.out.println("Area set: " + this.getArea());
        this.setDiameter(2.0);
        System.out.println("Diameter set: " + this.getDiameter());
    }

    public void printCircle()
    {

    }

    public double getRadius()
    {
        return this.radius;
    }

    public void setRadius(double newRad)
    {
        this.radius = newRad;
    }

    public double getDiameter()
    {
        return this.diameter;
    }

    public void setDiameter(double newDia)
    {
        this.diameter = newDia;
    }
}