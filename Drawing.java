/*
 * SRI GANESH
 * OM SRI MAHA GANAPATHAYA NAMA
 * MY FIRST JAVA PROGRAM
 * ADITHYA KUMAR WROTE THIS ON 11 SEP 2020
 * */
import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;
public class Drawing extends Canvas 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Drawing();
        canvas.setSize(500, 500);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) 
    {
		g.setColor(Color.red);  
        g.fillOval(100, 100, 100, 100);
        g.setColor(Color.lightGray); 
        g.fillOval(200, 200, 50, 50);
        g.setColor(Color.orange); 
        g.fillOval(300, 300, 400, 400);
        g.setColor(Color.blue); 
        g.fillOval(10, 10, 100, 100);

    }
    }

