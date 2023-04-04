import java.awt.*;
import java.applet.Applet;
import java.util.*;

/*
<applet code="Main" height =400 width  = 400></applet>
*/
public class Main extends Applet implements Runnable {
    Thread t, t1;

    public void start() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        t1 = Thread.currentThread();
        while (t1 == t) {
            repaint();
            try {
                t1.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public void paint(Graphics g) {
        Calendar cal = new GregorianCalendar();
        String hour = String.valueOf(cal.get(Calendar.HOUR));
        if(hour.equals("0"))
            hour = "12";
        String minute = String.valueOf(cal.get(Calendar.MINUTE));
        String second = String.valueOf(cal.get(Calendar.SECOND));
        String am_pm = String.valueOf(cal.get(Calendar.AM_PM));
        g.drawString(((hour.length() == 1) ? "0" + hour : hour)
                + ":" + ((minute.length() == 1) ? "0" + minute : minute)
                + ":" + ((second.length() == 1) ? "0" + second : second)
                + " "+(am_pm.equals("1")?"PM":"AM"), 20, 30);
    }
}
