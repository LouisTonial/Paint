import javax.swing.*;
import java.awt.* ;
import java.awt.event.*;
import java.util.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Drawing extends JPanel implements MouseListener, MouseMotionListener
{

    // Attributes
    protected ArrayList<Figure> list ;
    protected Color c ;
    protected String nameFigure ;
    protected int x ;
    protected int y ;


    // Constructors
    public Drawing()
    {
        super() ;
        this.c = Color.black ;
        this.nameFigure = "Rectangle" ;
        this.list = new ArrayList<Figure>() ;
        this.addMouseListener(this) ;
        this.addMouseMotionListener(this) ;
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g) ;
        this.setBackground(Color.white) ;
        for(Figure f : list)
        {
            f.draw(g) ;
        }
    }


    // Setters
    public void setColor(Color c)
    {
        this.c = c ;
    }

    public void setNameFigure(String nameFigure)
    {
        this.nameFigure = nameFigure ;
    }

    public void setList(ArrayList<Figure> list)
    {
        this.list = list ;
    }


    // Getters
    public Color getColor()
    {
      return this.c ;
    }

    public String getNameFigure()
    {
      return this.nameFigure ;
    }

    public ArrayList<Figure> getList()
    {
        return this.list ;
    }


    // Methods
    public void mouseDragged(MouseEvent e)
    {
        list.get(list.size()-1).setBoundingBox(e.getX()-x, e.getY()-y) ;
        paintComponent(this.getGraphics()) ;
    }

    public void mouseMoved(MouseEvent e){}

    public void mouseClicked(MouseEvent e){}

    public void mouseEntered(MouseEvent e){}

    public void mouseExited(MouseEvent e){}

    public void mousePressed(MouseEvent e)
    {
        x = e.getX() ;
        y = e.getY() ;
        switch(nameFigure) {
            case "Rectangle" : list.add(new Rectangle(x, y, c)) ;
                break ;
            case "Ellipse" : list.add(new Ellipse(x, y, c)) ;
                break ;
            case "Square" : list.add(new Square(x, y, c)) ;
                break ;
            case "Circle" : list.add(new Circle(x, y, c)) ;
                break ;
        }
    }

    public void mouseReleased(MouseEvent e)
    {
        list.get(list.size()-1).setBoundingBox(e.getX()-x, e.getY()-y) ;
        paintComponent(this.getGraphics()) ;

    }

    public void efface()
    {
        list.clear();
        super.paintComponent(this.getGraphics());
    }

}
