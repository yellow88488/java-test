package interfaces_and_innerclasses;

import java.awt.event.ActionListener;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.accessibility.AccessibleTable;
import javax.swing.*;
import javax.swing.Timer;

public class TimerTest {
    public static void main(String[] args){
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(10000,listener);
        t.start();
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener{
    public void actionPerformed(ActionEvent event){
        Date now = new Date();
        System.out.println("At the tone, the time is " + now);
        Toolkit.getDefaultToolkit().beep();
    }
}
