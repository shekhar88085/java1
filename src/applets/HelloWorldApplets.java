package applets;

import javax.swing.*;
import java.awt.*;

public class HelloWorldApplets extends java.applet.Applet {
    public void paint(Graphics g){
        g.drawString("Hello World",5,25);
    }
}
