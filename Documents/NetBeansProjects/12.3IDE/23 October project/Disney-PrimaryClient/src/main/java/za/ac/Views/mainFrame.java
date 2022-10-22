package za.ac.Views;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author retha
 */
public class mainFrame implements ActionListener {

    private JPanel southPanel, northPanel, westPanel, eastPanel;
    private JFrame mainFrame;
    private JLabel logo;
    private JLabel lblheading;

    private JButton btnViewBooks;
    private JButton btnAddBook;
    private JButton btnIssueBook;
    private JButton btnReturnBook;
    private JButton btnIssuedBook;
    private JButton btnAddStudent;
    private JButton btnViewStudent;
    private JButton btnAddAdmin;

    public mainFrame() {
        mainFrame = new JFrame("Disney Primary");
        southPanel = new JPanel();
        northPanel = new JPanel();
        westPanel = new JPanel();
        eastPanel = new JPanel();

        logo = new JLabel(new ImageIcon("kids.png"));
        lblheading = new JLabel("Disney Primary");

        btnViewBooks = new JButton("View Books");
        btnAddBook = new JButton("Add Books");
        btnIssueBook = new JButton("Issue Books");
        btnReturnBook = new JButton("Return Books");
        btnIssuedBook = new JButton("Books Due");
        btnAddStudent = new JButton("Add Student");
        btnViewStudent = new JButton("View Student");
        btnAddAdmin = new JButton("Add Admin");
    }

    public void setGUI() {
        Image icon = Toolkit.getDefaultToolkit().getImage("kids.png");
        mainFrame.setIconImage(icon);
        mainFrame.setBackground(Color.MAGENTA);
        btnViewBooks.setBounds(20, 20, 120, 25);//x axis, y axis, width, height  
        btnViewStudent.setBounds(20, 60, 120, 25);//x axis, y axis, width, height 
        btnAddBook.setBounds(150, 20, 120, 25);
        btnAddStudent.setBounds(150, 60, 120, 25); //set dimensions for button
        btnIssuedBook.setBounds(280, 20, 160, 25);//x axis, y axis, width, height
        btnReturnBook.setBounds(280, 60, 160, 25);
        btnIssueBook.setBounds(450, 20, 120, 25);
        btnAddAdmin.setBounds(450, 60, 120, 25);
        mainFrame.add(btnViewBooks);
        mainFrame.add(btnAddBook);
        mainFrame.add(btnIssueBook);
        mainFrame.add(btnReturnBook);
        mainFrame.add(btnIssuedBook);
        mainFrame.add(btnAddStudent);
        mainFrame.add(btnViewStudent);
        mainFrame.setSize(600, 200);//400 width and 500 height  
        mainFrame.setLayout(null);//using no layout managers  
        mainFrame.setVisible(true);//making the frame visible 
        mainFrame.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnViewBooks) {

        } else if (e.getSource() == btnAddBook) {
            new AddBook().setGUI();
        } else if (e.getSource() == btnIssueBook) {

        } else if (e.getSource() == btnReturnBook) {

        } else if (e.getSource() == btnIssuedBook) {

        } else if (e.getSource() == btnAddStudent) {
//            new AddStudent().setGUI();
        }
    }
}
