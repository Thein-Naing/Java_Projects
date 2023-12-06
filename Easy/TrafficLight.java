import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficLight extends JPanel {
    static String color = "";
    public void paint(Graphics g) {
    g.drawOval(100,50,50,50);
    g.drawOval(100,100,50,50);
    g.drawOval(100,150,50,50);
    if (color.equals("Red")) {
     g.setColor(Color.red);
     g.fillOval(100,50,50,50);
    }  else if (color.equals("Yellow")) {
            g.setColor(Color.yellow);
            g.fillOval(100,100,50,50);
        } if (color.equals("Green")) {
            g.setColor(Color.green);
            g.fillOval(100,150,50,50);
        }
    }
    public static void main(String args[]) {
     TrafficLight traffic = new TrafficLight();
     JFrame jFrame = new JFrame();
     JButton btn1 = new JButton("Red");
     btn1.setBounds(200,50,100,25);
     jFrame.add(btn1);
     btn1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         color = ((JButton)e.getSource()).getText();
         jFrame.repaint();
         }
     });
     JButton btn2 = new JButton("Yellow");
     btn2.setBounds(200,100,100,25);
        jFrame.add(btn2);
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                color = ((JButton)e.getSource()).getText();
                jFrame.repaint();
            }
        });
     JButton btn3 = new JButton("Green");
     btn3.setBounds(200,150,100,25);
     jFrame.add(btn3);
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                color = ((JButton)e.getSource()).getText();
                jFrame.repaint();
            }
        });

        jFrame.add(traffic);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
    }
}
