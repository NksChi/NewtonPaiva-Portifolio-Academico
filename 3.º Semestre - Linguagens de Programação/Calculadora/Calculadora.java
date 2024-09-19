import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {
    private final JTextField display;

    private double num1;
    private String operator;

    public Calculadora() {
        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        display = new JTextField();
        display.setBounds(20, 20, 260, 50);
        display.setFont(new Font("Arial", Font.PLAIN, 20));
        display.setEditable(false);
        add(display);

        JButton[] buttons = new JButton[16];
        int x = 20;
        int y = 90;
        int buttonWidth = 60;
        int buttonHeight = 60;

        String[] buttonTexts = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(buttonTexts[i]);
            buttons[i].setFont(new Font("Arial", Font.PLAIN, 20));
            buttons[i].setBounds(x, y, buttonWidth, buttonHeight);
            buttons[i].addActionListener(this);
            add(buttons[i]);

            x += buttonWidth;

            if (i == 3 || i == 7 || i == 11) {
                x = 20;
                y += buttonHeight;
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        String buttonClicked = e.getActionCommand();

        if (buttonClicked.matches("[\\d.]")) {
            display.setText(display.getText() + buttonClicked);
        } else if (buttonClicked.matches("[/*\\-+]")) {
            num1 = Double.parseDouble(display.getText());
            operator = buttonClicked;
            display.setText("");
        } else if (buttonClicked.equals("=")) {
            double num2 = Double.parseDouble(display.getText());
            double result = calculateResult(num1, num2, operator);
            display.setText(String.valueOf(result));
        }
    }

    private double calculateResult(double num1, double num2, String operator) {
        double result = 0;
        switch (operator) {
            case "/":
                result = num1 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "+":
                result = num1 + num2;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.setVisible(true);
    }
}
