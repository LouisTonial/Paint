import java.awt.Color ;
import java.awt.* ;

public class Rectangle extends Figure
{

    // Attributes
    protected int width ;
    protected int height ;


    // Constructors
    public Rectangle(Point p)
    {
        super(p) ;
        this.height = 0 ;
    }

    public Rectangle(int w, int h)
    {
        super(new Point()) ;  // obligé de créer un point car une Figure possède toujours un point  =/= de création de carré
        width = w ;
        height = h ;
    }

    public Rectangle (int px, int py, Color c)
    {
        super(new Point(px, py), c) ;
        this.width = 0 ;
        this.height = 0 ;
    }

    public void draw(Graphics g)
    {
        g.setColor(this.c) ;
        g.fillRect(origin.getX(), origin.getY(), this.width, this.height) ;
    }


    // Getters

    public int getWidth()
    {
        return width ;
    }

    public int getHeight()
    {
        return height ;
    }

    public int getPerimeter()
    {
        return (2*width + 2*height) ;
    }

    public int getSurface()
    {
        return (width*height) ;
    }


    // Setters
    public void setBoundingBox(int widthBB, int heightBB)
    {
        this.width = widthBB ;
        this.height = heightBB ;
    }

    public void setWidth(int w)
    {
        width = w ;
    }

    public void setHeight(int h)
    {
        height = h ;
    }


    // Methods
    @Override
    public String toString()
    {
        return ("O : " +origin.toString()+ ", height = " +height+ ", width = " +width+ ".") ;
    }

    public String String()
    {
        String s = "+" ;
        for (int i = 0 ; i < height ; i++)
        {
            s += "--" ;
        }
        s+="+ \n";
        for (int j=0 ; j < width ; j++)
        {
            s += "|" ;
            for (int i = 0 ; i < height ; i++)
            {
                s += "  " ;
            }
            s += "| \n" ;
        }
        s += "+" ;
        for (int i = 0 ; i <width ; i++)
        {
            s += "--" ;
        }
        s += "+" ;
        return (s) ;
    }

}
