public class Point
{

    // Attributes
    private int X ;
    private int Y ;


    // Constructors
    public Point() // Construire un point de coordonnées (0,0)
    {
        X = 0 ;
        Y = 0 ;
    }

    public Point(int x, int y)
    {
        X = x ;
        Y = y ;
    }


    // Setters

    public void setX(int X)
    {
        this.X = X ;
    }

    public void setY(int Y)
    {
        this.Y = Y ;
    }


    // Getters
    public int getX()
    {
        return X ;
    }

    public int getY()
    {
        return Y ;
    }


    // Methods
    @Override
    public String toString()
    {
        return "|X : " + this.X + " |Y : " + this.Y ;
    }

}
