import java.awt.Color ;

public class Square extends Rectangle
{

    // Constructors

    public Square(int s) //le nouveau carré est un renctangle par défaut donc pas beosin d'en créer un, juste de le paramétrer
    {
        super(s, s) ;
    }

    public Square (int px, int py, Color c)
    {
        super(px, py, c);
    }


    // Setters
    @Override
    public void setBoundingBox(int widthBB, int heightBB)
    {
        this.width = widthBB ;
        this.height = widthBB ;
    }

    public void setWidth(int side)
    {
        super.width = side ;
        super.height = side ;
    }

    public void setHeight(int side)
    {
        super.width = side ;
        super.height = side ;
    }

}

