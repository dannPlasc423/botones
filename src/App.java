import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class App {
    public static void main(String[] args) throws Exception {
        Frame f = new Frame();
        f.create();
    }
}

class Frame{
    public void create(){
        JFrame f = new JFrame();
        JPanel panel = new JPanel();
        f.setBounds(0, 0, 300, 150);
        f.setLocationRelativeTo(null);
        f.setTitle("BOTONES");

        JButton btn1 = new JButton("HOLA");
        btn1.setBounds(0, 10, 15, 30);
        JButton btn2 = new JButton("ADIOS");
        btn2.setBounds(0, 10, 15, 30);

        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                System.out.println("HOLAA");
            }
        });

        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                System.out.println("ADIOS");
            }
        });

        panel.add(btn1);
        panel.add(btn2);

        f.add(panel);
        f.setVisible(true);
    }    
}
