package base1;

import java.awt.Color;
import javax.swing.JFrame;

public class JFrame_ extends JFrame{
    
    public Canvas_ canvas = new Canvas_();
    
    public JFrame_(){
        short
                w = 1280,
                h = 1024;
        
//        setBounds(0, 0, w, h);
        setSize(w, h);
        setIgnoreRepaint(true);
        setBackground(Color.cyan);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(canvas);
    }
    
    
    
}
