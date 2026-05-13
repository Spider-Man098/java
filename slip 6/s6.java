
import javax.swing.*;
import java.awt.event.*;

public class s6 extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5;

    JTextField t1, t2;

    JTextArea ta;

    JRadioButton m, f;

    JComboBox cb;

    JButton b1, b2;

    s6() {

        setTitle("Admission Form");

        setSize(400, 450);

        setLayout(null);

        l1 = new JLabel("Name");
        l2 = new JLabel("Gender");
        l3 = new JLabel("Course");
        l4 = new JLabel("Address");
        l5 = new JLabel("Contact");

        l1.setBounds(50, 50, 100, 25);
        l2.setBounds(50, 100, 100, 25);
        l3.setBounds(50, 150, 100, 25);
        l4.setBounds(50, 200, 100, 25);
        l5.setBounds(50, 290, 100, 25);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);

        t1 = new JTextField();
        t2 = new JTextField();

        ta = new JTextArea();

        t1.setBounds(150, 50, 150, 25);
        ta.setBounds(150, 200, 150, 60);
        t2.setBounds(150, 290, 150, 25);

        add(t1);
        add(ta);
        add(t2);

        m = new JRadioButton("Male");
        f = new JRadioButton("Female");

        m.setBounds(150, 100, 80, 25);
        f.setBounds(230, 100, 80, 25);

        ButtonGroup bg = new ButtonGroup();

        bg.add(m);
        bg.add(f);

        add(m);
        add(f);

        String s[] = {"BCA", "BBA", "MBA", "MCA"};

        cb = new JComboBox(s);

        cb.setBounds(150, 150, 150, 25);

        add(cb);

        b1 = new JButton("Submit");
        b2 = new JButton("Reset");

        b1.setBounds(80, 350, 100, 30);
        b2.setBounds(200, 350, 100, 30);

        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == b1) {

            JOptionPane.showMessageDialog(this,

                "Name: " + t1.getText() +
                "\nGender: " + (m.isSelected() ? "Male" : "Female") +
                "\nCourse: " + cb.getSelectedItem() +
                "\nAddress: " + ta.getText() +
                "\nContact: " + t2.getText()
            );
        }

        if(e.getSource() == b2) {

            t1.setText("");
            t2.setText("");
            ta.setText("");

            m.setSelected(false);
            f.setSelected(false);

            cb.setSelectedIndex(0);
        }
    }

    public static void main(String args[]) {

        new s6();
    }
}
