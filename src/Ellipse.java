import java.awt.Color ;
import java.awt.* ;

public class Ellipse extends Figure
{

    // Attributes
    protected int semiAxisX ;
    protected int semiAxisY ;


    // Constructors
    public Ellipse(Point p)
    {
        super (p) ;
        this.semiAxisX = 0 ;
        this.semiAxisY = 0 ;
    }

    public Ellipse(int saX, int saY)
    {
        super(new Point()) ;
        semiAxisX = saX ;
        semiAxisY = saY ;
    }

    public Ellipse (int px, int py, Color c)
    {
        super(new Point(px, py), c) ;
        this.semiAxisX = 0 ;
        this.semiAxisY = 0 ;
    }

    public void draw(Graphics g)
    {
        g.setColor(this.c) ;
        g.fillOval(origin.getX(), origin.getY(), this.semiAxisX, this.semiAxisY) ;
    }


    // Setters

    public void setBoundingBox(int widthBB, int heightBB)
    {
        this.semiAxisX = widthBB ;
        this.semiAxisY = heightBB ;
    }

    public void setSemiAxisX(int saX)
    {
        semiAxisX = saX ;
    }

    public void setSemiAxisY(int saY)
    {
        semiAxisY = saY ;
    }


    // Getters

    public int getSurface()
    {
        return (int) (Math.PI*semiAxisX*semiAxisY/4) ;  //on caste (impose une classe) car sinon c'est un nombre trop grand qui demande une double précision (type double)
    }

    public int getPerimeter()
    {
        return (int) (2*Math.PI*Math.sqrt(((semiAxisX*semiAxisX)+(semiAxisY*semiAxisY))/2)) ;
    }

    public int getSemiAxisX()
    {
        return semiAxisX ;
    }

    public int getSemiAxisY()
    {
        return semiAxisY ;
    }

}
