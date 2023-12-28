package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TreeGUI treeGUI = new TreeGUI();
            treeGUI.setVisible(true);
        });
    }
}
