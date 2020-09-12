/*
 * SRI GANESH
 * OM SRI MAHA GANAPATHAYA NAMA
 * MY FIRST JAVA PROGRAM with animation
 * ADITHYA KUMAR WROTE THIS ON 12 SEP 2020
 * */
import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;
import java.util.concurrent.TimeUnit;
public class animaton extends Canvas 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("My animation");
        Canvas canvas = new animaton();
        canvas.setSize(500, 500);
	canvas.setBackground(Color.white);
	
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) 
    {
       int x,y; 
       int length,breath;
       int delay ;
       
       delay = 100 ;
		
       while(true)
       {
       g.setColor(Color.red);
		length= 100;
		breath=120;
		x=120;
		y=100;  
		
        try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
	
        g.fillOval(x,y,breath,length);
	
	//* Create a delay of 2 secs */
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=150;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=160;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=170;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=180;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=190;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=200;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=210;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=220;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=230;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=240;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=250;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=260;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=270;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=280;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=290;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=300;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=310;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=320;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=330;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=340;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=350;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=360;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=370;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=390;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=400;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=410;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=420;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=430;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=440;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=450;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=460;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=470;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=480;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=490;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=delay;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=490;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=480;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=470;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=460;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=450;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=440;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=430;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=420;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=410;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=400;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=390;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=380;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=370;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=360;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=350;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=340;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=330;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=320;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=310;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=300;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=290;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=280;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=270;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=260;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=250;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=240;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=230;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=220;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=210;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=200;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=190;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=180;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=170;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=160;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	try
        {
           Thread.sleep(delay);
	}
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        /* Erase the previous one */
	
	g.setColor(Color.white);
	g.fillOval(x,y,breath,length);
	
	/* Change the co-ordinates */
	x=120;
	y=150;
	
	/* Draw it again */
	
        g.setColor(Color.red);
        g.fillOval(x,y,breath,length);
	
       }   
    }
}


