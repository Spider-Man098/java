package Slip17_1;
/*Implement a Java Program for creating a digital clock using AWT, Swing & Date
class.*/

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock extends Frame implements Runnable
{
    Label l;

    DigitalClock()
    {
        l = new Label();

        l.setFont(new Font("Arial", Font.BOLD, 30));

        add(l);

        setSize(400,150);

        setTitle("Digital Clock");

        setVisible(true);

        Thread t = new Thread(this);

        t.start();
    }

    public void run()
    {
        while(true)
        {
            Date d = new Date();

            SimpleDateFormat sdf =
                    new SimpleDateFormat("HH:mm:ss");

            l.setText(sdf.format(d));

            try
            {
                Thread.sleep(1000);
            }

            catch(Exception e)
            {

            }
        }
    }

    public static void main(String args[])
    {
        new DigitalClock();
    }
}
