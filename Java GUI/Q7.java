import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Q6 extends JFrame implements ActionListener {
    Container c;
    JLabel num1, num2, result;
    JTextField Num1, Num2, Result;
    JButton add, sub, mul, div, rem, clear;

    Q6(){
        c = getContentPane();
        c.setLayout(new FlowLayout());

        num1 = new JLabel("Enter num1: ");
        num2 = new JLabel("Enter num2: ");
        result = new JLabel("Result: ");

        Num1 = new JTextField(10);
        Num2 = new JTextField(10);
        Result = new JTextField(10);

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        rem = new JButton("%");
        clear = new JButton("Clear");

        c.add(num1);
        c.add(Num1);
        c.add(num2);
        c.add(Num2);
        c.add(result);
        c.add(Result);
        c.add(add);
        c.add(sub);
        c.add(mul);
        c.add(div);
        c.add(rem);
        c.add(clear);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        rem.addActionListener(this);
        clear.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        double num1, num2, result;
        num1 = Double.parseDouble(Num1.getText());
        num2 = Double.parseDouble(Num2.getText());
        if(ae.getSource()==add){
            result = num1 + num2;
            Result.setText(Double.toString(result));
        }else if(ae.getSource()==sub){
            result = num1 - num2;
            Result.setText(Double.toString(result));
        }else if(ae.getSource()==mul){
            result = num1 * num2;
            Result.setText(Double.toString(result));
        }else if(ae.getSource()==div){
            result = num1 / num2;
            Result.setText(String.format("%.4f",result));
        }else if(ae.getSource()==rem){
            result = num1 % num2;
            Result.setText(Double.toString(result));
        }
        else{
            Num1.setText("");
            Num2.setText("");
            Result.setText("");
        }
    }
    public static void main(String []args){
        Q6 frm = new Q6();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setBounds(200, 200 ,200 ,200);
        frm.setVisible(true);
    }
}
