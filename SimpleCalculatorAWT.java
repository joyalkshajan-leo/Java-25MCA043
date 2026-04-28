import java.awt.*;
import java.awt.event.*;

public class SimpleCalculatorAWT extends Frame implements ActionListener {

    
    TextField t1, t2, resField;
    Button add, sub, mul, div;
    Label l1, l2, l3;

    SimpleCalculatorAWT() {
      
        setLayout(new GridLayout(5, 2, 5, 5));

        l1 = new Label("First Number:");
        l2 = new Label("Second Number:");
        l3 = new Label("Result:");

        t1 = new TextField();
        t2 = new TextField();
        resField = new TextField();
        resField.setEditable(false); 

        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");

       
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(resField);
        add(add); add(sub);
        add(mul); add(div);

      
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

      
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setTitle("Simple Calculator");
        setSize(300, 250);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double res = 0;

            if (e.getSource() == add) {
                res = a + b;
            } else if (e.getSource() == sub) {
                res = a - b;
            } else if (e.getSource() == mul) {
                res = a * b;
            } else if (e.getSource() == div) {
                if (b == 0) {
                    resField.setText("Div by 0!");
                    return;
                }
                res = a / b;
            }
            
            resField.setText(String.valueOf(res));
            
        } catch (NumberFormatException ex) {
            resField.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculatorAWT();
    }
}