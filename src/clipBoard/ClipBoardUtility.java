/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clipBoard;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import javafx.scene.input.ClipboardContent;

/**
 *
 * @author kyokuto
 */
public class ClipBoardUtility {

    public static void contentPutString(String s) {
        /*
        final Clipboard clipboard = Clipboard.getSystemClipboard();
        final ClipboardContent content = new ClipboardContent();

        content.putString(s);
        clipboard.setContent(content);
*/
        Toolkit kit = Toolkit.getDefaultToolkit();
        Clipboard clip = kit.getSystemClipboard();
        StringSelection ss = new StringSelection(s);
        clip.setContents(ss, null);

    }
}
