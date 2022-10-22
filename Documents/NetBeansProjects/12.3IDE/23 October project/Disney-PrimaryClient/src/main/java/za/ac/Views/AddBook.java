package za.ac.Views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *AddBookGUI.java
 * @author Cwenga Dlova(214310671)
 * This is a swing class to add new book that is not on the system
 * 
 */


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class AddBook implements ActionListener{
    private JFrame mainFrame;
    private JPanel mainPanel, headPanel, fieldPanel, buttonPanel, savePanel, backPanel;
    private JLabel headLabel, bookIsbnLbl, bookTitleLbl, bookAuthorLbl, categoryLbl, shelfNumberLbl, noOfBooksLbl;
    private JTextField bookIsbnField, bookTitleField, bookAuthorField, categoryField, shelfNumberField, noOfBooksField;
    private JButton saveButton, backButton;
    
    public AddBook() {
        
        mainFrame = new JFrame("Add Book");
        
        mainPanel = new JPanel();
        headPanel = new JPanel();
        headPanel.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.gray));
        fieldPanel = new JPanel();
        fieldPanel.setBorder(BorderFactory.createMatteBorder(4, 0, 4, 0, Color.MAGENTA));
        buttonPanel = new JPanel();
        buttonPanel.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.gray));
        savePanel = new JPanel();
        backPanel = new JPanel();
        
        headLabel = new JLabel("Add New Book");
        headLabel.setFont(new Font("Rockwell", Font.PLAIN, 15));
        bookIsbnLbl = new JLabel("Book ISBN: ");
        bookIsbnLbl.setFont(new Font("Rockwell", Font.PLAIN, 14));
        bookTitleLbl = new JLabel("Book Title: ");
        bookTitleLbl.setFont(new Font("Rockwell", Font.PLAIN, 14));
        bookAuthorLbl = new JLabel("Book Author: ");
        bookAuthorLbl.setFont(new Font("Rockwell", Font.PLAIN, 14));
        categoryLbl = new JLabel("Category: ");
        categoryLbl.setFont(new Font("Rockwell", Font.PLAIN, 14));
        shelfNumberLbl = new JLabel("Shelf Number: ");
        shelfNumberLbl.setFont(new Font("Rockwell", Font.PLAIN, 14));
        noOfBooksLbl = new JLabel("Quantity: ");
        noOfBooksLbl.setFont(new Font("Rockwell", Font.PLAIN, 14));
        
        bookIsbnField = new JTextField();
        bookTitleField = new JTextField();
        bookAuthorField = new JTextField();
        categoryField = new JTextField();
        shelfNumberField = new JTextField();
        noOfBooksField = new JTextField();
        
        saveButton = new JButton("Save");
        backButton = new JButton("Back");
    }
    public void setGUI() {
        savePanel.add(saveButton);
        backPanel.add(backButton);
        
        headPanel.add(headLabel);
        
        fieldPanel.setLayout(new GridLayout(8, 2));
        fieldPanel.add(Box.createRigidArea(new Dimension(1, 0)));
        fieldPanel.add(Box.createRigidArea(new Dimension(1, 0)));
        fieldPanel.add(bookIsbnLbl);
        fieldPanel.add(bookIsbnField);
        fieldPanel.add(bookTitleLbl);
        fieldPanel.add(bookTitleField);
        fieldPanel.add(bookAuthorLbl);
        fieldPanel.add(bookAuthorField);
        fieldPanel.add(categoryLbl);
        fieldPanel.add(categoryField);
        fieldPanel.add(shelfNumberLbl);
        fieldPanel.add(shelfNumberField);
        fieldPanel.add(noOfBooksLbl);
        fieldPanel.add(noOfBooksField);
        fieldPanel.add(Box.createRigidArea(new Dimension(0, 0)));
        fieldPanel.add(Box.createRigidArea(new Dimension(0, 0)));
        
        buttonPanel.setLayout(new FlowLayout());
        
        buttonPanel.add(savePanel);
        buttonPanel.add(backPanel);
        
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        mainPanel.add(headPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(fieldPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(buttonPanel);
        
        saveButton.addActionListener(this);
        backButton.addActionListener(this);
        
        mainFrame.add(mainPanel);
        mainFrame.pack();
        mainFrame.setSize(400, 350);
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
        if(e.getSource()==saveButton){
             if(bookIsbnField.getText().isBlank() || bookTitleField.getText().isBlank()|| 
               bookAuthorField.getText().isBlank() || categoryField.getText().isBlank()||
               shelfNumberField.getText().isBlank() || noOfBooksField.getText().isBlank() )
            {
                JOptionPane.showMessageDialog(null, "Ensure all fields are filled.");
            }
        }
        else if(e.getSource()== backButton )
        {            
           new  mainFrame().setGUI();
            //add new mainFrameGUI from Rethabile.setGUI()
            
        }   
        }
       catch(Exception ex)
        {
        System.out.println(e);
        }
    }
   
}
