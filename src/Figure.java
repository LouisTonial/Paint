import java.awt.Color ;
import java.awt.* ;

public abstract class Figure
{

    // Attributes
    protected Point origin ;
    protected Color c ;


    // Constructors
    public Figure(Point point)
    {
        origin = point ;
    }

    public Figure(Point p, Color c)
    {
        this.origin = p ;
        this.c = c ;
    }


    // Methods
    @Override
    public String toString()
    {
        return ("( " +origin.getX()+ ", "+origin.getY()+")") ;
    }

    public abstract int getPerimeter() ;

    public abstract int getSurface() ;

    public abstract void setBoundingBox(int widthBB, int heightBB) ;

    public abstract void draw(Graphics g) ;

}
