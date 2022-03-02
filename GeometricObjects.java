package Week5;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GeometricObjects
{
    private String color = "orange";
    private boolean filled;
    private java.util.Date DateCreated;
    private double area,perimeter;

    public void setDateCreated()
    {
        this.DateCreated = new Date();
    }

    public java.util.Date getDateCreated()
    {
        return this.DateCreated;
    }

    public String toString(int integer)
    {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(DateCreated);
        return strDate;
    }

    public String getColor()
    {
        return this.color;
    }

    public void setColor(String newColor)
    {
        this.color = newColor;
    }

    public boolean isFilled()
    {
        return this.filled;
    }

    public void setFilled(boolean newFilled)
    {
        this.filled = newFilled;
    }

    public double getArea()
    {
        return this.area;
    }

    public void setArea(double newArea)
    {
        this.area = newArea;
    }

    public double getPerimeter()
    {
        return this.perimeter;
    }

    public void setPerimeter(double newPre)
    {
        this.perimeter = newPre;
    }
}
