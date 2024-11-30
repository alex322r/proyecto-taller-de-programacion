package gui;

import javax.swing.*;

public class PanelAbout extends JPanel {

    public PanelAbout() {

        // componentes
        JButton aboutButton = new JButton("About");

        //añadir componentes
        add(aboutButton);

        aboutButton.addActionListener(e -> {

            JOptionPane.showMessageDialog(null, "About me", "About", JOptionPane.PLAIN_MESSAGE);
        });

    }

}
