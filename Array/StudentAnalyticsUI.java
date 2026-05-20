package Array;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentAnalyticsUI {

    public static void main(String[] args) {

        // Main Frame
        JFrame frame = new JFrame("Student Analytics System");
        frame.setSize(500, 450);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(24, 24, 36));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Title
        JLabel title = new JLabel("Student Analytics Dashboard");
        title.setBounds(90, 20, 350, 40);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setForeground(Color.WHITE);
        frame.add(title);

        // Instruction Label
        JLabel label = new JLabel("Enter Marks (space separated):");
        label.setBounds(40, 90, 250, 30);
        label.setFont(new Font("Arial", Font.PLAIN, 16));
        label.setForeground(Color.WHITE);
        frame.add(label);

        // Text Field
        JTextField textField = new JTextField();
        textField.setBounds(40, 130, 400, 40);
        textField.setFont(new Font("Arial", Font.PLAIN, 18));
        textField.setBackground(new Color(40, 40, 55));
        textField.setForeground(Color.WHITE);
        textField.setCaretColor(Color.WHITE);
        textField.setBorder(
            BorderFactory.createLineBorder(new Color(0, 170, 255), 2)
        );
        frame.add(textField);

        // Analyze Button
        JButton button = new JButton("Analyze");
        button.setBounds(170, 200, 140, 45);
        button.setFont(new Font("Arial", Font.BOLD, 18));
        button.setBackground(new Color(0, 170, 255));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        frame.add(button);

        // Output Area
        JTextArea output = new JTextArea();
        output.setBounds(40, 280, 400, 90);
        output.setFont(new Font("Consolas", Font.BOLD, 18));
        output.setBackground(new Color(40, 40, 55));
        output.setForeground(Color.GREEN);
        output.setEditable(false);
        output.setBorder(
            BorderFactory.createLineBorder(new Color(0, 170, 255), 2)
        );
        frame.add(output);

        // Button Click Event
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                try {

                    // Get Input
                    String input = textField.getText();

                    // Split Input
                    String[] numbers = input.split(" ");

                    int[] marks = new int[numbers.length];

                    // Convert String to Integer
                    for (int i = 0; i < numbers.length; i++) {
                        marks[i] = Integer.parseInt(numbers[i]);
                    }

                    // Find Maximum
                    int max = marks[0];

                    for (int i = 1; i < marks.length; i++) {

                        if (max < marks[i]) {
                            max = marks[i];
                        }
                    }

                    // Find Sum
                    int sum = 0;

                    for (int i = 0; i < marks.length; i++) {
                        sum += marks[i];
                    }

                    // Calculate Average
                    double avg = (double) sum / marks.length;

                    // Display Output
                    output.setText(
                        "Highest Marks : " + max +
                        "\nAverage Marks : " + avg
                    );

                } catch (Exception ex) {

                    output.setText(
                        "Invalid Input! Please enter numbers only."
                    );
                }
            }
        });

        // Show Frame
        frame.setVisible(true);
    }
}