

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.*;

public class tableExample extends JFrame{
    JTable table;
    tableExample(){
        setLayout(new FlowLayout());
        String [] columns = {"NAME", "AGE", "Position"};
        String [][] data = {{"Sigmund Jude", "19", "Intern"},{"Finn", "40", "Senior Software Engineer"}};
        table = new JTable(data, columns);//rows and columns
        table.setPreferredScrollableViewportSize(new Dimension(500, 50));
        table.setFillsViewportHeight(true);
        
        JScrollPane sp = new JScrollPane(table);
        add(sp);
        
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JTable");
        this.setLocationRelativeTo(null);//centering the window
        this.setVisible(true);
    } 
    public static void main(String [] args){
        tableExample table = new tableExample();
        
    }
}
