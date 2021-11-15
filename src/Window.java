import javax.swing.*;
import java.awt.* ;
import java.awt.event.*;

public class Window extends JFrame implements ActionListener
{

    // Attributes
    static protected Drawing d = new Drawing() ;

    // Constructors
    public Window(String title,int x ,int y)
    {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ; // Permet de récupérer la main quand on ferme la fenêtre, sans ça, on doit faire ctrl+C
        this.setLocation(0,0) ;
        this.setSize(1200,600) ;
        this.setVisible(true) ;

        JMenuBar m = new JMenuBar() ;
        JMenu menu1 = new JMenu("File") ;
        JMenuItem open = new JMenuItem("Open") ;
        JMenuItem news = new JMenuItem("News") ; // J'utilise "news" plutôt que "new" car l'utilisation de "new" génère des erreurs
        JMenuItem save = new JMenuItem("Save") ;
        JMenuItem exit = new JMenuItem("Exit") ;
        menu1.add(open) ;
        menu1.add(news) ;
        menu1.add(save) ;
        menu1.add(exit) ;
        JMenu menu2 = new JMenu("About") ;
        JMenuItem authors = new JMenuItem("Authors") ;
        menu2.add(authors) ;
        m.add(menu1) ;
        m.add(menu2) ;
        open.addActionListener(this) ;
        save.addActionListener(this) ;
        news.addActionListener(this) ;
        exit.addActionListener(this) ;
        authors.addActionListener(this) ;

        Container pan = getContentPane() ;

        JPanel pan1 = new JPanel() ;
        JButton button1 = new JButton("Black") ;
        button1.setBackground(Color.black) ;
        JButton button2 = new JButton("Red") ;
        button2.setBackground(Color.red) ;
        JButton button3 = new JButton("Green") ;
        button3.setBackground(Color.green) ;
        JButton button4 = new JButton("Blue") ;
        button4.setBackground(Color.blue) ;
        JButton button5 = new JButton("Yellow") ;
        button5.setBackground(Color.yellow) ;
        JButton button6 = new JButton("Pink") ;
        button6.setBackground(Color.pink) ;
        JButton button7 = new JButton("Magenta") ;
        button7.setBackground(Color.magenta) ;
        JButton button8 = new JButton("Orange") ;
        button8.setBackground(Color.orange) ;

        pan1.setLayout(new GridLayout(2,4)) ;
        pan1.add(button1) ;
        pan1.add(button2) ;
        pan1.add(button3) ;
        pan1.add(button4) ;
        pan1.add(button5) ;
        pan1.add(button6) ;
        pan1.add(button7) ;
        pan1.add(button8) ;
        button1.addActionListener(this) ;
        button2.addActionListener(this) ;
        button3.addActionListener(this) ;
        button4.addActionListener(this) ;
        button5.addActionListener(this) ;
        button6.addActionListener(this) ;
        button7.addActionListener(this) ;
        button8.addActionListener(this) ;

        JPanel pan2 = new JPanel() ;
        JButton button21 = new JButton("Ellipse") ;
        JButton button22 = new JButton("Circle") ;
        JButton button23 = new JButton("Square") ;
        JButton button24 = new JButton("Rectangle") ;

        pan2.setLayout(new GridLayout(2,2)) ;
        pan2.add(button21) ;
        pan2.add(button22) ;
        pan2.add(button23) ;
        pan2.add(button24) ;
        button21.addActionListener(this) ;
        button22.addActionListener(this) ;
        button23.addActionListener(this) ;
        button24.addActionListener(this) ;

        JPanel panel = new JPanel() ;
        panel.setLayout(new GridLayout(1,2)) ;
        panel.add(pan1) ;
        panel.add(pan2) ;

        setJMenuBar(m) ;
        pan.add(new JTextArea(""),"Center") ;
        pan.add(d, "Center") ;
        pan.add(panel, "South") ;
        this.setVisible(true) ;
    }


    // Methods
    public void actionPerformed(ActionEvent e)
    {
        String cmd = e.getActionCommand() ;
        switch(cmd)
        {
            case "Red" : d.setColor(Color.red) ;
                break ;
            case "Green" : d.setColor(Color.green) ;
                break ;
            case "Black" : d.setColor(Color.black) ;
                break ;
            case "Blue" : d.setColor(Color.blue) ;
                break ;
            case "Yellow" : d.setColor(Color.yellow) ;
                break ;
            case "Pink" : d.setColor(Color.pink) ;
                break ;
            case "Magenta" : d.setColor(Color.magenta) ;
                break ;
            case "Orange" : d.setColor(Color.orange) ;
                break ;
            case "Rectangle" : d.setNameFigure("Rectangle") ;
                break ;
            case "Square" : d.setNameFigure("Square") ;
                break ;
            case "Ellipse" : d.setNameFigure("Ellipse") ;
                break ;
            case "Circle" : d.setNameFigure("Circle") ;
                break ;
            case "Nouveau" : d.efface() ;
                break ;
            case "Authors" : JOptionPane jop = new JOptionPane() ;
                jop.showInternalMessageDialog(jop, "Authors : 2G2TP5 - Louis Tonial", "Information", JOptionPane.INFORMATION_MESSAGE) ;
                break ;
            case "Exit" : System.exit(0) ;
                break ;
            default : System.out.println("Action : " + cmd) ;
                break ;
        }
    }

}
