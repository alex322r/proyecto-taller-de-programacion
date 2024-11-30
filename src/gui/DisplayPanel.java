package gui;

import javax.swing.*;
import java.awt.*;

public class DisplayPanel extends JPanel {

    private JTextField pantalla;


    public DisplayPanel() {
        setBackground(Color.BLACK);

        pantalla = new JTextField();

        pantalla.setFont(new Font("Arial", Font.BOLD, 24));
        pantalla.setEditable(false);
        pantalla.setHorizontalAlignment(SwingConstants.RIGHT);
        add(pantalla, BorderLayout.NORTH);
    }

}
