package Array;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PrefixSumUI {

    public static void main(String[] args) {

        // Main Frame
        JFrame frame = new JFrame("Prefix Sum Dashboard");
        frame.setSize(650, 500);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(18, 18, 30));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Title
        JLabel title = new JLabel("Prefix Sum Range Analyzer");
        title.setBounds(150, 20, 400, 40);
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setForeground(Color.WHITE);
        frame.add(title);

        // Marks Label
        JLabel marksLabel = new JLabel("Enter Marks (space separated):");
        marksLabel.setBounds(40, 90, 300, 30);
        marksLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        marksLabel.setForeground(Color.WHITE);
        frame.add(marksLabel);

        // Marks Input
        JTextField marksField = new JTextField();
        marksField.setBounds(40, 130, 550, 40);
        marksField.setFont(new Font("Arial", Font.PLAIN, 18));
        marksField.setBackground(new Color(35, 35, 50));
        marksField.setForeground(Color.WHITE);
        marksField.setCaretColor(Color.WHITE);
        marksField.setBorder(
            BorderFactory.createLineBorder(new Color(0, 170, 255), 2)
        );
        frame.add(marksField);

        // L Label
        JLabel lLabel = new JLabel("Starting Index:");
        lLabel.setBounds(40, 200, 150, 30);
        lLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        lLabel.setForeground(Color.WHITE);
        frame.add(lLabel);

        // L Input
        JTextField lField = new JTextField();
        lField.setBounds(180, 200, 80, 35);
        lField.setFont(new Font("Arial", Font.PLAIN, 18));
        frame.add(lField);

        // R Label
        JLabel rLabel = new JLabel("Ending Index:");
        rLabel.setBounds(320, 200, 150, 30);
        rLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        rLabel.setForeground(Color.WHITE);
        frame.add(rLabel);

        // R Input
        JTextField rField = new JTextField();
        rField.setBounds(450, 200, 80, 35);
        rField.setFont(new Font("Arial", Font.PLAIN, 18));
        frame.add(rField);

        // Analyze Button
        JButton button = new JButton("Analyze");
        button.setBounds(230, 270, 170, 45);
        button.setFont(new Font("Arial", Font.BOLD, 20));
        button.setBackground(new Color(0, 170, 255));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        frame.add(button);

        // Output Area
        JTextArea output = new JTextArea();
        output.setBounds(40, 350, 550, 80);
        output.setFont(new Font("Consolas", Font.BOLD, 18));
        output.setBackground(new Color(35, 35, 50));
        output.setForeground(Color.GREEN);
        output.setEditable(false);
        output.setBorder(
            BorderFactory.createLineBorder(new Color(0, 170, 255), 2)
        );
        frame.add(output);

        // Button Action
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                try {

                    // Input Marks
                    String input = marksField.getText();

                    String[] numbers = input.split(" ");

                    int[] marks = new int[numbers.length];

                    // Convert to Integer
                    for(int i = 0; i < numbers.length; i++) {

                        marks[i] = Integer.parseInt(numbers[i]);
                    }

                    // Prefix Array
                    int[] prefix = new int[marks.length];

                    prefix[0] = marks[0];

                    for(int i = 1; i < marks.length; i++) {

                        prefix[i] = prefix[i - 1] + marks[i];
                    }

                    // Input L and R
                    int L = Integer.parseInt(lField.getText());
                    int R = Integer.parseInt(rField.getText());

                    int sum;

                    // Range Query
                    if(L == 0) {

                        sum = prefix[R];
                    }
                    else {

                        sum = prefix[R] - prefix[L - 1];
                    }

                    // Build Prefix String
                    String prefixText = "";

                    for(int i = 0; i < prefix.length; i++) {

                        prefixText += prefix[i] + " ";
                    }

                    // Output
                    output.setText(
                        "Prefix Array: " + prefixText +
                        "\nRange Sum (" + L + " to " + R + ") : " + sum
                    );

                }
                catch(Exception ex) {

                    output.setText(
                        "Invalid Input! Please enter valid numbers."
                    );
                }
            }
        });

        // Show Frame
        frame.setVisible(true);
    }
}