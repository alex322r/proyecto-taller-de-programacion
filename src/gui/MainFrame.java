package gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // BorderLayout y paneles
        setLayout(new BorderLayout());
        add(new PanelAbout(), BorderLayout.SOUTH);
        add(new PanelButtons(), BorderLayout.CENTER);
        add(new DisplayPanel(), BorderLayout.NORTH);
    }
}
