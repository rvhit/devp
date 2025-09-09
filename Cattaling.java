package sampleCodes;
//import java.awt.Robot;
//import java.util.Random;
//
//public class Cattling {
//    public static final int FIVE_SECONDS = 70000;
//    public static final int MAX_Y = 400;
//    public static final int MAX_X = 400;
//
//    public static void runCat() throws Exception {
//        Robot robot = new Robot();
//        Random random = new Random();
//        while (true) {
//            robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
////            robot.mousePress(6);     
//            Thread.sleep(FIVE_SECONDS);
//        }
//    }
//}
//

import java.awt.*;
import java.util.Random;

public class Cattling {
    
    public static void runCat() {
        try {
            Robot robot = new Robot();
            Random rand = new Random();
            
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int screenWidth = (int) screenSize.getWidth();
            int screenHeight = (int) screenSize.getHeight();
            
            while (true) {
                int moveX = rand.nextInt(100) - 50;  
                int moveY = rand.nextInt(100) - 50;

                Point currentMousePos = MouseInfo.getPointerInfo().getLocation();
                int currentX = (int) currentMousePos.getX();
                int currentY = (int) currentMousePos.getY();
                
                int newX = Math.min(Math.max(0, currentX + moveX), screenWidth - 1);
                int newY = Math.min(Math.max(0, currentY + moveY), screenHeight - 1);
                
                robot.mouseMove(newX, newY);
                
				int time = rand.nextInt(120000);
                Thread.sleep(time);
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

