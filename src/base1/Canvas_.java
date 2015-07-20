package base1;

import java.awt.Canvas;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

public class Canvas_ extends Canvas{
    
    BufferStrategy bufferStrategy;
    Graphics2D g2d;
    
    public Canvas_(){
        
    }
    
    public void update(){
        bufferStrategy = getBufferStrategy();
        
        if (getBufferStrategy() == null){
            createBufferStrategy(3);
        }
        else{
            bufferStrategy.getDrawGraphics().fillRect(0, 0, getWidth(), getHeight());
            
            bufferStrategy.show();
        }        
    }
    
}
