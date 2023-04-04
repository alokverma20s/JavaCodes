import java.awt.*;
import java.applet.Applet;
/* <applet code = "Main" width= 200  height =  200>
    <param name = "site" value="www.mysirg.com" />
</applet> */
public class Main extends Applet{
    private String  defaultMessage = "Hello!";
    public void paint(Graphics g){
        String s1 = this.getParameter("site");
        if(s1== null){
            s1= defaultMessage;
        }
        g.drawString(s1, 50, 25);
    }
}
