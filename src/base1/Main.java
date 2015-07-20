package base1;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        
//        new Runnable(){
//            @Override
//            public void run(){
//                JFrame_ jframe = new JFrame_();
//                while(true){
//                    jframe.canvas.update();
//                }
//            }
//        }.run();
        
//        SwingUtilities.invokeLater(new Runnable(){
//            @Override
//            public void run(){
//                JFrame_ jframe = new JFrame_();
//                while(true){
//                    jframe.canvas.update();
//                }
//            }
//        });
        
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                JFrame_ jFrame = new JFrame_();
                jFrame.setVisible(true);
                while(true){
                    jFrame.canvas.update();
                }
            }
        });

    }
    
}
