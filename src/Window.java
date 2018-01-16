import javax.swing.*;

public class Window extends JFrame implements WindowImpl
{
    private int x,y;

    public Window(String titlu)
    {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void Minimize()
    {

    }

    public void Maximize()
    {

    }

    public void Refresh()
    {
        this.repaint();
    }

    public void setSize(int a, int b)
    {
        this.x = a;
        this.y = b;
    }
}