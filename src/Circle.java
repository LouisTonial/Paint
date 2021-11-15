import java.awt.Color ;

public class Circle extends Ellipse
{

    // Constructors
    public Circle(int c)
    {
        super(c, c) ;
    }

    public Circle(int px, int py, Color c)
    {
        super(px, py, c) ;
    }

    // Setters
    public void setWidth(int side)
    {
        super.semiAxisX = side ;
        super.semiAxisY = side ;
    }

    public void setHeight(int side)
    {
        super.semiAxisX = side ;
        super.semiAxisY = side ;
    }

    public void setBoundingBox(int widthBB, int heightBB)
    {
        this.semiAxisX = widthBB ;
        this.semiAxisY = widthBB ;
    }
}
