import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing 1");

        //button
        JButton button = new JButton("Click Me");
        button.setBounds(250,250,90,60);
        frame.add(button);

        JButton button1 = new JButton("Anjite");
        button1.setBounds(250,50,90,60);
        frame.add(button1);
        //end button

        //label
        JLabel label1 = new JLabel("This is label for button 1");
        label1.setBounds(20,20,200,100);
        frame.add(label1);

        JLabel label2 = new JLabel("This is label for button 2");
        label2.setBounds(20,240,200,100);
        frame.add(label2);

        //text box
        J

        //frame
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}