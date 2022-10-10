/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomOutputStream;

import java.io.IOException;
import java.io.OutputStream;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author carlos
 */
public class CustomOutputStream extends OutputStream {

    private final JTextArea textArea;
        public CustomOutputStream(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void write(int b) throws IOException {
        textArea.append(String.valueOf((char)b));
        //scrolls the text area to the end of data
        textArea.setCaretPosition(textArea.getDocument().getLength());
        // keeps the textArea up to date
        textArea.update(textArea.getGraphics());
    }
    
}
