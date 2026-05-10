package Slip11_1;

/*Implement a Java Program to create calculator using AWT*/
import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener
{
    TextField t;

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    Button add,sub,mul,div,eq,clear;

    double num1, num2, result;
    String op;

    Calculator()
    {
        t = new TextField();

        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b0 = new Button("0");

        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");
        eq = new Button("=");

        clear = new Button("C");

        setLayout(new GridLayout(5,4));

        add(t);

        add(b1); add(b2); add(b3);
        add(b4); add(b5); add(b6);
        add(b7); add(b8); add(b9);

        add(b0);

        add(add);
        add(sub);
        add(mul);
        add(div);

        add(eq);
        add(clear);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        eq.addActionListener(this);

        clear.addActionListener(this);

        setSize(300,300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();

        if(s.equals("1") || s.equals("2") ||
                s.equals("3") || s.equals("4") ||
                s.equals("5") || s.equals("6") ||
                s.equals("7") || s.equals("8") ||
                s.equals("9") || s.equals("0"))
        {
            t.setText(t.getText() + s);
        }

        else if(s.equals("+") || s.equals("-") ||
                s.equals("*") || s.equals("/"))
        {
            num1 = Double.parseDouble(t.getText());

            op = s;

            t.setText("");
        }

        else if(s.equals("="))
        {
            num2 = Double.parseDouble(t.getText());

            if(op.equals("+"))
            {
                result = num1 + num2;
            }

            else if(op.equals("-"))
            {
                result = num1 - num2;
            }

            else if(op.equals("*"))
            {
                result = num1 * num2;
            }

            else if(op.equals("/"))
            {
                result = num1 / num2;
            }

            t.setText("" + result);
        }

        else if(s.equals("C"))
        {
            t.setText("");
        }
    }

    public static void main(String args[])
    {
        new Calculator();
    }
}
