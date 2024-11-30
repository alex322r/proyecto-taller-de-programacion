package gui;

import javax.swing.*;
import java.awt.*;

public class PanelButtons extends JPanel {

    public PanelButtons() {
        setLayout(new GridBagLayout()); // Usar GridBagLayout para más control
        GridBagConstraints gbc = new GridBagConstraints();

        // Configuración general de los GridBagConstraints
        gbc.fill = GridBagConstraints.BOTH; // Expandir componentes para llenar celdas
        gbc.insets = new Insets(5, 5, 5, 5); // Margen entre componentes

        // Definir los botones
        String[] botones = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        // Añadir botones al layout
        int fila = 0, columna = 0;
        for (int i = 0; i < botones.length; i++) {
            JButton boton = new JButton(botones[i]);
            boton.setFont(new Font("Arial", Font.BOLD, 20));
            //boton.addActionListener(new ManejadorEventos(calculadora, boton));

            // Configurar posición del botón
            gbc.gridx = columna;
            gbc.gridy = fila;
            gbc.gridwidth = 1; // Cada botón ocupa 1 celda de ancho
            gbc.gridheight = 1; // Cada botón ocupa 1 celda de alto
            add(boton, gbc);

            columna++;
            if (columna > 3) { // Pasar a la siguiente fila después de 4 botones
                columna = 0;
                fila++;
            }
        }
    }
}
