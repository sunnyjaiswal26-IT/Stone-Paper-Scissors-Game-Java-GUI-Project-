package javaguibasicproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RockPaperScissor {
    public static class MainFrame extends JFrame implements ActionListener {
        int Computerscore=0;
        int playerscore=0;
        JLabel c=new JLabel("Computer: "+Computerscore);
        JLabel ps=new JLabel("Player: "+playerscore);
        JButton Rock1=new JButton("Rock");
        JButton papre2=new JButton("Paper");
        JButton seacior3=new JButton("seacior");
        JPanel panel=new JPanel();
        JLabel label=new JLabel("?");
MainFrame() {

    this.setSize(400,500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);

    panel.setOpaque(true);
    panel.setBackground(Color.lightGray);
    panel.setBounds(100,100,200,150);
    panel.add(label);
    label.setText("?");
    label.setFont(new Font("Dilog",Font.BOLD,20));
    this.add(panel);

    c.setFont(new Font("Dilog",Font.BOLD,20));
    ps.setFont(new Font("Dilog",Font.BOLD,20));

    c.setBounds(140,0,300,100);
    ps.setBounds(150,250,300,100);
   // c.setHorizontalTextPosition(SwingConstants.CENTER);

    this.add(c);
    this.add(ps);
    c.setHorizontalTextPosition(SwingConstants.CENTER);

    Rock1.setBounds(10,350,110,80);
    papre2.setBounds(140,350,110,80);
    seacior3.setBounds(270,350,110,80);

    Rock1.addActionListener(this);
    papre2.addActionListener(this);
    seacior3.addActionListener(this);

    this.add(Rock1);
    this.add(papre2);
    this.add(seacior3);




    this.setVisible(true);
}        @Override
        public void actionPerformed(ActionEvent e) {
if(e.getSource()==Rock1){
    int z=1;
    Random x= new Random();
    int p=x.nextInt(1,4);
    System.out.println(p);
    if(p==1){
        label.setText("Rock");
        JOptionPane.showMessageDialog(null,"It's a Draw");
    }else if(p==2){
        label.setText("Paper");

        JOptionPane.showMessageDialog(null,"computer win's");
        Computerscore++;
    }else {
        label.setText("Seaicor");
        playerscore++;
        JOptionPane.showMessageDialog(null,"player win's");
    }
    label.setText("?");
}
            if(e.getSource()==papre2){
                int z=1;
                Random x= new Random();
                int p=x.nextInt(1,4);

                if(p==1){
                    label.setText("Rock");
playerscore++;
                    JOptionPane.showMessageDialog(null,"player win's");
                }else if(p==2){
                    label.setText("Paper");
                    JOptionPane.showMessageDialog(null,"It's a Draw");

                }else {
                    label.setText("Seaicor");
                    Computerscore++;
                    JOptionPane.showMessageDialog(null,"computer win's");
                }

            }
            if(e.getSource()==seacior3){

                Random x= new Random();
                int p=x.nextInt(1,4);

                if(p==1){
                    label.setText("Rock");
Computerscore++;
                    JOptionPane.showMessageDialog(null,"computer win's");
                }else if(p==2){
                    label.setText("Paper");
                    JOptionPane.showMessageDialog(null,"player win's");
                    playerscore++;
                }else {
                    label.setText("Seaicor");

                    JOptionPane.showMessageDialog(null,"It's a Draw");
                }

            }
            label.setText("?");
            c.setText("Computer: "+Computerscore);
            ps.setText("Player: "+playerscore);
        }
    }

    public static void main(String[] args) {
        MainFrame run=new MainFrame();
    }
}
