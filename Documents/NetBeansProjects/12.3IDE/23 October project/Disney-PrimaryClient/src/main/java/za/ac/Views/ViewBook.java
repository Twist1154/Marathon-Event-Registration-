package za.ac.Views;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author retha
 */
public class ViewBook {

    private JFrame mainFrame;
    private JTable table;
    private JScrollPane scoll;

    public ViewBook() {
        mainFrame = new JFrame("View Book");

    }

    public setGUI() {

//        mainFrame.add();
        mainFrame.pack();
        mainFrame.setSize(400, 350);
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
