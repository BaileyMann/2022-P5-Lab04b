// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE

    g.drawLine(100,200,100,300);
    g.drawLine(100,200,200,200);
    g.drawLine(100,300,200,300);
    g.drawLine(200,200,200,300);
    g.drawLine(50,250,50,150);
    g.drawLine(50,250,150,250);
    g.drawLine(50,150,150,150);
    g.drawLine(50,150,150,150);
    g.drawLine(150,150,150,250);
    g.drawLine(150,150,150,250);
    g.drawLine(50,150,100,200);
    g.drawLine(150,150,200,200);
    g.drawLine(150,250,200,300);
    g.drawLine(50,250,100,300);

        // DRAW Sphere
        g.drawOval(400,150,100,100);
        g.drawOval(440,150,20,100);
        g.drawOval(427,150,45,100);
        g.drawOval(410,150,80,100);
        g.drawOval(400,190,100,20);
        g.drawOval(400,177,100,45);
        g.drawOval(400,160,100,80);


        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE

        g.drawOval(700,400,100,100);
        g.drawLine(700,460,786,415);
        g.drawLine(700,460,750,501);
        g.drawLine(750,501,786,415);
        g.drawOval(718,442,45,45);

        // DRAW APCS

        //A
        g.fillRect(100,400,20,100);
        g.fillRect(140,400,20,100);
        g.fillRect(100,400,50,20);
        g.fillRect(100,440,50,20);
        //P
        g.fillRect(180,400,20,100);
        g.fillRect(220,400,20,60);
        g.fillRect(180,400,50,20);
        g.fillRect(180,440,50,20);
        //c
        g.fillRect(260,400,20,100);
        g.fillRect(260,400,60,20);
        g.fillRect(260,480,60,20);
        //S
        g.fillRect(340,400,60,20);
        g.fillRect(340,400,20,50);
        g.fillRect(340,440,60,20);
        g.fillRect(380,440,20,50);
        g.fillRect(340,480,60,20);




        // DRAW PACMEN FLOWER

        g.fillArc(700,100,60,60,135,270);
        g.fillArc(662,141,60,60,220,270);
        g.fillArc(700,180,60,60,320,270);
        g.fillArc(740,140,60,60,400,270);

    }

}


