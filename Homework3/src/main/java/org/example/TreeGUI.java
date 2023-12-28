package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TreeGUI extends JFrame {
    private final TreeDAO treeDAO;

    public TreeGUI() {
        this.treeDAO = new TreeDAO();

        setTitle("Tree GUI");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        JButton showTreesButton = new JButton("Show Trees");
        showTreesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showTreeIds();
            }
        });

        JButton showTreeInfoButton = new JButton("Show Tree Info");
        showTreeInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement logic to show tree info
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(showTreesButton);
        panel.add(showTreeInfoButton);

        getContentPane().add(panel);
    }

    private void showTreeIds() {
        List<Tree> trees = treeDAO.readTrees();
        StringBuilder treeIds = new StringBuilder("Tree IDs:\n");

        for (Tree tree : trees) {
            treeIds.append(tree.getId()).append("\n");
        }

        JOptionPane.showMessageDialog(this, treeIds.toString(), "Tree IDs", JOptionPane.INFORMATION_MESSAGE);
    }
}
