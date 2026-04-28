import java.awt.*;
import java.awt.event.*;

public class MaxFinder extends Frame implements ActionListener {
    // Declare components
    TextField txtNum1, txtNum2, txtNum3;
    Label lblResult;
    Button btnFind;

    public MaxFinder() {
        // 1. Setup Layout
        setLayout(new FlowLayout());

        // 2. Initialize and Add Components
        add(new Label("Enter Number 1:"));
        txtNum1 = new TextField(10);
        add(txtNum1);

        add(new Label("Enter Number 2:"));
        txtNum2 = new TextField(10);
        add(txtNum2);

        add(new Label("Enter Number 3:"));
        txtNum3 = new TextField(10);
        add(txtNum3);

        btnFind = new Button("Find Maximum");
        add(btnFind);

        lblResult = new Label("Result will appear here        ");
        add(lblResult);

        // 3. Register the button with an ActionListener
        btnFind.addActionListener(this);

        // 4. Window Settings
        setTitle("Max of Three Numbers");
        setSize(250, 250);
        setVisible(true);

        // Close window logic
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // 5. Logic to handle button click
    public void actionPerformed(ActionEvent e) {
        try {
            int n1 = Integer.parseInt(txtNum1.getText());
            int n2 = Integer.parseInt(txtNum2.getText());
            int n3 = Integer.parseInt(txtNum3.getText());

            int max;
            if (n1 >= n2 && n1 >= n3) {
                max = n1;
            } else if (n2 >= n1 && n2 >= n3) {
                max = n2;
            } else {
                max = n3;
            }

            lblResult.setText("Maximum is: " + max);
        } catch (NumberFormatException ex) {
            lblResult.setText("Please enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        new MaxFinder();
    }
}