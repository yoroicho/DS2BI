/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import robot.Keyboard;

/**
 *
 * @author kyokuto
 */
public class KeyTypeAndPaste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            robot.mouseMove(10, 150);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);

            Keyboard keyboard = new Keyboard();
            try {
                keyboard.doTyping("jsoiguあいうjq98gj5ijgbpfmopjiuchxrpfnrjkicgxj9g"
                        + "rpeomc,x894t-8gmc'(&%&)#`(0JGNV =");

                /* USE TO java8FX ClipBoard
                https://docs.oracle.com/javase/jp/8/javafx/api/javafx/scene/input/Clipboard.html
                */
                
                
                
                Toolkit kit = Toolkit.getDefaultToolkit();
                Clipboard clip = kit.getSystemClipboard();
                StringSelection ss = new StringSelection("日本語'(&%&)#`(0JGNV =");
                clip.setContents(ss, null);
                robot.mouseMove(10, 150);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_V);
            } catch (Exception ex) {
                Logger.getLogger(KeyTypeAndPaste.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (AWTException ex) {
            Logger.getLogger(KeyTypeAndPaste.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
