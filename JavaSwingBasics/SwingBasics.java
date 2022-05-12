/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author acer
 */
/**Notes
 * example of inheritance in java
 * setBounds(x,y,width,height)
 * declaring the variables as global to manipulate their values in the entire class
 * setBacground(new Color(R,G,B)
 * Java Swing Tutorial Full YT Link: https://www.youtube.com/watch?v=Kmgo00avvEw&t=1712s
 * If you want to run it int the command prompt(cmd) javac JavaSwingBasics.java -Xlint:unchecked
 * You Can change anything here so that you can understand the concepts more
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
public class SwingBasics extends JFrame{

    JFrame frame;
    JPanel panel;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;
    JLabel label8;
    JLabel label9;
    JTextField tf;
    JTextField tf2;
    JTextField tf3;
    JPasswordField pf;
    JList list;
    JTextArea ta;
    JComboBox combx;
    JTable table;
    JToggleButton tBtn;
    JRadioButton rBtn1;
    JRadioButton rBtn2;
    JSlider slide;
    JButton button;
    JButton button2;
    JMenuBar mBar;
    JMenu m1;
    JMenu m2;
    JMenu m3;
    JMenuItem m1a;
    JMenuItem m1b;
    JMenuItem m1c;
    SwingBasics(){
        //Panel
        panel = new JPanel();
        panel.setBounds(0, 0, 585, 685);
        panel.setBackground(new Color(247, 222, 220));
        panel.setLayout(null);
        
        //Menu
        mBar = new JMenuBar();
        m1 = new JMenu("Sample Menu1");
        m2 = new JMenu("Sample Menu2");
        m3 = new JMenu("Sample Menu3");
        m1a = new JMenuItem("Sample Action");
        m1b = new JMenuItem("Sample Action");
        m1c = new JMenuItem("Sample Action");
        m1.add(m1a);m1.add(m1b);m1.add(m1c);
        mBar.add(m1);mBar.add(m2);mBar.add(m3);
        
        //Setting Up all the labels to be used
        label1 = new JLabel("JTextField:");
        label2 = new JLabel("JPasswordPField:");
        label3 = new JLabel("JList:");
        label4 = new JLabel("JTextArea:");
        label5 = new JLabel("JComboBox:");
        label6 = new JLabel("JSlider: ");
        label7 = new JLabel("JToggleButton:");
        label8 = new JLabel("JRadioButton:");
        label9 = new JLabel("Click the Button to view next page");
        
        //Setting up the JTextFields
        tf = new JTextField();
        label1.setBounds(10, 10, 200, 50);
        label1.setForeground(Color.black);
        tf.setBounds(90, 27, 150, 20);
        //tf.setText("Type Something..");
        panel.add(label1);
        panel.add(tf);
        
        //Setting up the JPasswordField
        pf = new JPasswordField();
        label2.setBounds(250, 10, 200, 50);
        pf.setBounds(375, 27, 150, 20);
        //pf.setText("Password Here");
        panel.add(pf);
        panel.add(label2);
        
        //setting ip JList
        label3.setBounds(10, 60, 100, 50);
        String [] lists = {"CC3","CC2", "CC1", "HCI"};
        list = new JList(lists);
        list.setSelectedIndex(0);// kung anong item anf naka highlight
        list.setBounds(60,78, 100, 80);
        panel.add(label3);
        panel.add(list);
        
        //Setting Up JTextArea
        label4.setBounds(190, 60, 100, 50);
        ta = new JTextArea();
        ta.setBounds(270, 77, 100, 100);
        panel.add(label4);
        panel.add(ta);
        
        //seting Up JComboBOx
        String [] choice = {"Python", "Java", "C++", "C#", "JavaScript"};
        combx = new JComboBox(choice);
        combx.setBounds(470, 77, 100, 23);
        label5.setBounds(390, 60, 100, 50);
        panel.add(label5);
        panel.add(combx);
        
        //Setting up JToggleButton
        tBtn = new JToggleButton();
        tf2 = new JTextField("Click the Button");
        tf2.setBounds(215, 200, 150, 30);
        tf2.setFont(new Font("Segoe UI Black", Font.PLAIN, 10));
        tf2.setFocusable(false);
        tBtn.setText("ON");
        tBtn.setBounds(115, 200, 70, 30);
        //Adding some actions if button is clicked (Long method). You can use lamda expressions ->
        tBtn.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(tBtn.isSelected()){
                    tBtn.setText("OFF");
                    tf2.setText("Button State changed to On");
                }
                else{
                    tBtn.setText("ON");
                    tf2.setText("Button State changed to Off");
                }
            }
        });
        label7.setBounds(10, 180, 160, 50);
        panel.add(label7);
        panel.add(tf2);
        panel.add(tBtn);
        
        //Setting up JRadioButton
        label8.setBounds(10, 250, 100, 50);
        //Adding the buttons to the button group so that they can't be selected at the same time..
        ButtonGroup bGroup = new ButtonGroup();
        rBtn1 = new JRadioButton("Sample Choice");
        rBtn1.setOpaque(false);
        rBtn1.setBounds(130, 250, 150, 50);
        rBtn2 = new JRadioButton("Sample Choice");
        rBtn2.setBounds(280, 250, 150, 50);
        rBtn2.setOpaque(false);
        //adding the buttons as a group
        bGroup.add(rBtn1);
        bGroup.add(rBtn2);
        //adding the compinents to the panel
        panel.add(label8);
        panel.add(rBtn1);
        panel.add(rBtn2);
        
        //setting up JSlider
        tf3 = new JTextField();
        label6.setBounds(10, 300, 100, 50);
        tf3.setBounds(120, 370, 100, 20);
        tf3.setFocusable(false);
        slide = new JSlider();
        slide.setMinimum(0);
        slide.setMaximum(100);
        slide.setMinorTickSpacing(5);
        slide.setMajorTickSpacing(20);
        slide.setPaintTicks(true);
        slide.setPaintLabels(true);
        slide.setPaintTrack(true);
        slide.setBounds(120, 310, 400, 50);
        //updating the value
        tf3.setText("Value: " + slide.getValue());
        slide.addChangeListener(e -> {
            tf3.setText("Value: " + slide.getValue());
            }
        );
        panel.add(label6);
        panel.add(tf3);
        panel.add(slide);
        
        //setting up the JButton
        label9.setBounds(10, 410, 300, 50);//setting up the label for the button
        label9.setFont(new Font("Tahoma", Font.BOLD, 15));// setting up the font
        button = new JButton("Table");// putting text to the button
        button.setBounds(300, 420, 100, 30);//location (x, y) and size(width, height) of button
        button.setFont(new Font("Tahoma", Font.PLAIN, 20));
        button.setFocusable(false);//para lang matanggal yung outline nung text sa button
        //sample lambda expression
        button.addActionListener(e -> {new tableExample(); this.setVisible(false);});// setting up an action if button is clicked
        button2 = new JButton("Option Pane");// putting text to the button
        button2.setBounds(410, 420, 150, 30);//location (x, y) and size(width, height) of button
        button2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        button2.setFocusable(false);//para lang matanggal yung outline nung text sa button
        //sample lambda expression
        button2.addActionListener(e -> {JOptionPane.showMessageDialog(null, "Sample OptionPane", "JOptionPane", JOptionPane.PLAIN_MESSAGE);});
        //adding components to the panel
        panel.add(label9);
        panel.add(button);
        panel.add(button2);
        
        ImageIcon icon = new ImageIcon("ironman.png");
        this.setSize(590, 550);// width x height
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exiting the code
        this.setLocationRelativeTo(null);//cemtering the window to the center of screen
        this.setTitle("Title Dito");//title
        this.setIconImage(icon.getImage());//icon of the app
        this.add(panel);//adding the panel
        this.setJMenuBar(mBar);//adding the menu bar
        this.setVisible(true);//displaying the window

    }
}
