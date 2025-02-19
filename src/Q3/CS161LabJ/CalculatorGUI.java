package Q3.CS161LabJ;

import javax.swing.*;

public class CalculatorGUI {
    private JPanel mainPanel;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton button7;
    private JButton button8;
    private JButton a7Button;
    private JButton clearButton;
    private JButton a8Button;
    private JButton a9Button;
    private JButton button13;
    private JButton a0Button;
    private JButton button15;
    private JButton button16;

    public CalculatorGUI() {
        // TODO
    }

    public static void main(String[] args) {
        var frame = new JFrame("Calculator");
        frame.setContentPane(new CalculatorGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
