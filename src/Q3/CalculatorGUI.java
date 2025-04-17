package Q3;
import javax.swing.*;
import java.awt.*;

public class CalculatorGUI {
    private JPanel mainPanel;

    public CalculatorGUI() {

    }

    public static void main(String[] args) {
        var frame = new JFrame("Calculator");
        frame.setContentPane(new CalculatorGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
