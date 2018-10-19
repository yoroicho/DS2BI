/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

/**
 *
 * @author kyokuto
 */
public class Mouse {

    private static final int HOME_POS_X = 10;
    private static final int HOME_POS_Y = 150;
    
    private static final int WAIT_ACTIVE = 500;
    

    public static void mouseActiveHome() throws AWTException {
        Robot robot = new Robot();
        robot.mouseMove(HOME_POS_X, HOME_POS_Y);
        robot.delay(WAIT_ACTIVE);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(WAIT_ACTIVE);
        robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
        robot.delay(WAIT_ACTIVE);
    }
}
