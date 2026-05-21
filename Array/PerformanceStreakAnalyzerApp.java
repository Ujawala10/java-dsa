package Array;

import java.awt.*;
import javax.swing.*;

public class PerformanceStreakAnalyzerApp {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Performance Analyzer Pro");
        frame.setSize(600, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10));

        // ================= TITLE =================
        JLabel title = new JLabel("Performance Streak Analyzer", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 22));
        title.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.add(title, BorderLayout.NORTH);

        // ================= INPUT PANEL =================
        JPanel inputPanel = new JPanel(new GridLayout(6, 1, 5, 5));

        JTextField numField = new JTextField();
        JTextField kField = new JTextField();
        JTextField scoresField = new JTextField();

        inputPanel.add(new JLabel("Enter number of scores:"));
        inputPanel.add(numField);

        inputPanel.add(new JLabel("Enter window size (k):"));
        inputPanel.add(kField);

        inputPanel.add(new JLabel("Enter scores (space separated):"));
        inputPanel.add(scoresField);

        frame.add(inputPanel, BorderLayout.CENTER);

        // ================= OUTPUT AREA =================
        JTextArea output = new JTextArea();
        output.setEditable(false);
        output.setFont(new Font("Consolas", Font.PLAIN, 14));
        output.setBorder(BorderFactory.createTitledBorder("Result"));
        frame.add(output, BorderLayout.SOUTH);

        // ================= BUTTON PANEL =================
        JPanel buttonPanel = new JPanel();

        JButton calcButton = new JButton("Calculate");
        JButton resetButton = new JButton("Reset");

        buttonPanel.add(calcButton);
        buttonPanel.add(resetButton);

        frame.add(buttonPanel, BorderLayout.EAST);

        // ================= CALCULATE LOGIC =================
        calcButton.addActionListener(e -> {

            try {
                int n = Integer.parseInt(numField.getText().trim());
                int k = Integer.parseInt(kField.getText().trim());

                String[] parts = scoresField.getText().trim().split("\\s+");

                // VALIDATION 1
                if (parts.length != n) {
                    output.setText("Error: Please enter exactly " + n + " scores.");
                    return;
                }

                int[] arr = new int[n];

                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(parts[i]);
                }

                // VALIDATION 2
                if (k > n || k <= 0) {
                    output.setText("Error: Invalid window size k.");
                    return;
                }

                // SLIDING WINDOW
                int windowSum = 0;

                for (int i = 0; i < k; i++) {
                    windowSum += arr[i];
                }

                int maxSum = windowSum;

                for (int i = k; i < n; i++) {
                    windowSum = windowSum - arr[i - k] + arr[i];
                    maxSum = Math.max(maxSum, windowSum);
                }

                double avg = (double) maxSum / k;

                output.setText(
                        "Best Streak Sum: " + maxSum + "\n" +
                        "Average: " + avg
                );

            } catch (Exception ex) {
                output.setText("Invalid input. Please check values.");
            }
        });

        // ================= RESET =================
        resetButton.addActionListener(e -> {
            numField.setText("");
            kField.setText("");
            scoresField.setText("");
            output.setText("");
        });

        frame.setVisible(true);
    }
}