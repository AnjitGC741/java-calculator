
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.awt.Font;
import java.awt.Color;
public class CalculatorGUI implements ActionListener {
    JFrame frame = new JFrame("Calculator");
    JTextField display = new JTextField();
    JButton number0 = new JButton("0");
    JButton number1 = new JButton("1");
    JButton number2 = new JButton("2");
    JButton number3 = new JButton("3");
    JButton number4 = new JButton("4");
    JButton number5 = new JButton("5");
    JButton number6 = new JButton("6");
    JButton number7 = new JButton("7");
    JButton number8 = new JButton("8");
    JButton number9 = new JButton("9");
    JButton add = new JButton("+");
    JButton subtract = new JButton("-");
    JButton multiply = new JButton("x");
    JButton divide = new JButton("/");
    JButton equal = new JButton("=");
    JButton clear = new JButton("C");
    void renderForm(){
//        calculator display
        display.setBounds(20,10,270,50);
        display.setEditable(false);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        Font font = new Font("Arial", Font.PLAIN, 20);
        display.setBackground(Color.decode("#D0E6A8"));
        display.setFont(font);
        frame.add(display);
//        number 7
        number7.setBounds(20,70,60,40);
        number7.setBorderPainted(false);
        number7.setOpaque(true);
        number7.setBackground(Color.decode("#808080"));
        number7.setForeground(Color.white);
        number7.setFont(new Font("Arial", Font.BOLD, 30));
        number7.addActionListener(this);
        frame.add(number7);
//        number 8
        number8.setBounds(90,70,60,40);
        number8.setBorderPainted(false);
        number8.setOpaque(true);
        number8.setBackground(Color.decode("#808080"));
        number8.setForeground(Color.white);
        number8.setFont(new Font("Arial", Font.BOLD, 30));
        number8.addActionListener(this);
        frame.add(number8);
//        number 9
        number9.setBounds(160,70,60,40);
        number9.setBorderPainted(false);
        number9.setFocusable(false);
        number9.setOpaque(true);
        number9.setBackground(Color.decode("#808080"));
        number9.setForeground(Color.white);
        number9.setFont(new Font("Arial", Font.BOLD, 30));
        number9.addActionListener(this);
        frame.add(number9);
//        divide
        divide.setBounds(230,70,60,40);
        divide.setBorderPainted(false);
        divide.setOpaque(true);
        divide.setBackground(Color.decode("#65C7D0"));
        divide.setForeground(Color.white);
        divide.setFont(new Font("Arial", Font.BOLD, 30));
        divide.addActionListener(this);
        frame.add(divide);
//        number 4
        number4.setBounds(20,120,60,40);
        number4.setBorderPainted(false);
        number4.setOpaque(true);
        number4.setBackground(Color.decode("#808080"));
        number4.setForeground(Color.white);
        number4.setFont(new Font("Arial", Font.BOLD, 30));
        number4.addActionListener(this);
        frame.add(number4);
//        number 5
        number5.setBounds(90,120,60,40);
        number5.setBorderPainted(false);
        number5.setOpaque(true);
        number5.setBackground(Color.decode("#808080"));
        number5.setForeground(Color.white);
        number5.setFont(new Font("Arial", Font.BOLD, 30));
        number5.addActionListener(this);
        frame.add(number5);
//        number 6
        number6.setBounds(160,120,60,40);
        number6.setBorderPainted(false);
        number6.setOpaque(true);
        number6.setBackground(Color.decode("#808080"));
        number6.setForeground(Color.white);
        number6.setFont(new Font("Arial", Font.BOLD, 30));
        number6.addActionListener(this);
        frame.add(number6);
//      multiply
        multiply.setBounds(230,120,60,40);
        multiply.setBorderPainted(false);
        multiply.setOpaque(true);
        multiply.setBackground(Color.decode("#65C7D0"));
        multiply.setForeground(Color.white);
        multiply.setFont(new Font("Arial", Font.BOLD, 30));
        multiply.addActionListener(this);
        frame.add(multiply);
        //        number 1
        number1.setBounds(20,170,60,40);
        number1.setBorderPainted(false);
        number1.setOpaque(true);
        number1.setBackground(Color.decode("#808080"));
        number1.setForeground(Color.white);
        number1.setFont(new Font("Arial", Font.BOLD, 30));
        number1.addActionListener(this);
        frame.add(number1);
//        number 2
        number2.setBounds(90,170,60,40);
        number2.setBorderPainted(false);
        number2.setOpaque(true);
        number2.setBackground(Color.decode("#808080"));
        number2.setForeground(Color.white);
        number2.setFont(new Font("Arial", Font.BOLD, 30));
        number2.addActionListener(this);
        frame.add(number2);
//        number 3
        number3.setBounds(160,170,60,40);
        number3.setBorderPainted(false);
        number3.setOpaque(true);
        number3.setBackground(Color.decode("#808080"));
        number3.setForeground(Color.white);
        number3.setFont(new Font("Arial", Font.BOLD, 30));
        number3.addActionListener(this);
        frame.add(number3);
//      subtract
        subtract.setBounds(230,170,60,40);
        subtract.setBorderPainted(false);
        subtract.setOpaque(true);
        subtract.setBackground(Color.decode("#65C7D0"));
        subtract.setForeground(Color.white);
        subtract.setFont(new Font("Arial", Font.BOLD, 30));
        subtract.addActionListener(this);
        frame.add(subtract);
        //        clear
        clear.setBounds(20,220,60,40);
        clear.setBorderPainted(false);
        clear.setOpaque(true);
        clear.setBackground(Color.decode("#FF9000"));
        clear.setForeground(Color.white);
        clear.setFont(new Font("Arial", Font.BOLD, 30));
        clear.addActionListener(this);
        frame.add(clear);
//        zero
        number0.setBounds(90,220,60,40);
        number0.setBorderPainted(false);
        number0.setOpaque(true);
        number0.setBackground(Color.decode("#808080"));
        number0.setForeground(Color.white);
        number0.setFont(new Font("Arial", Font.BOLD, 30));
        number0.addActionListener(this);
        frame.add(number0);
//        equals
        equal.setBounds(160,220,60,40);
        equal.setBorderPainted(false);
        equal.setOpaque(true);
        equal.setBackground(Color.decode("#E95D5E"));
        equal.setForeground(Color.white);
        equal.setFont(new Font("Arial", Font.BOLD, 30));
        equal.addActionListener(this);
        frame.add(equal);
//      plus
        add.setBounds(230,220,60,40);
        add.setBorderPainted(false);
        add.setOpaque(true);
        add.setBackground(Color.decode("#65C7D0"));
        add.setForeground(Color.white);
        add.setFont(new Font("Arial", Font.BOLD, 30));
        add.addActionListener(this);
        frame.add(add);
    }
    void render(){
        renderForm();
        frame.setSize(325,310);
        frame.getContentPane().setBackground(Color.decode("#4B4B4B"));
        frame.setLayout(null);
        frame.setTitle("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == number1)
        {
            display.setText(display.getText()+ "1");
        }
        if(e.getSource() == number2)
        {
            display.setText(display.getText()+ "2");
        }
        if(e.getSource() == number3)
        {
            display.setText(display.getText()+ "3");
        }
        if(e.getSource() == number4)
        {
            display.setText(display.getText()+ "4");
        }
        if(e.getSource() == number5)
        {
            display.setText(display.getText()+ "5");
        }
        if(e.getSource() == number6)
        {
            display.setText(display.getText()+ "6");
        }
        if(e.getSource() == number7)
        {
            display.setText(display.getText()+ "7");
        }
        if(e.getSource() == number8)
        {
            display.setText(display.getText()+ "9");
        }
        if(e.getSource() == number0)
        {
            display.setText(display.getText()+ "0");
        }
        if(e.getSource() == subtract)
        {
            display.setText(display.getText()+ "-");
        }
        if(e.getSource() == multiply)
        {
            display.setText(display.getText()+ "*");
        }
        if(e.getSource() == divide)
        {
            display.setText(display.getText()+ "/");
        }
        if(e.getSource() == add)
        {
            display.setText(display.getText()+ "+");
        }
        if(e.getSource() == clear)
        {
            display.setText("");
        }
        if(e.getSource() == equal)
        {
            String infix = display.getText();
            for (int i = 0; i < infix.length() - 1; i++) {
                char c1 = infix.charAt(i);
                char c2 = infix.charAt(i+1);
                if (isOperator(c1) && isOperator(c2)) {
                    display.setText("Error: Consecutive operators");
                    return;
                }
            }
            char c3 = infix.charAt(0);
            char c4 = infix.charAt(infix.length()-1);
            if(isOperator(c3))
            {
                display.setText("Error:operators is in front");
                return;
            }
            if(isOperator(c4))
            {
                display.setText("Error:operators is at last");
                return;
            }
            String postfix = infixToPostfix(infix);
            int result = evaluatePostfix(postfix);
            display.setText(String.valueOf(result));
        }
    }
    // A utility function to check if the given character is an operator
    static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/');
    }

    // A utility function to get the precedence of the given operator
    static int getPrecedence(char c) {
        if (c == '+' || c == '-') {
            return 1;
        } else if (c == '*' || c == '/') {
            return 2;
        } else {
            return 0;
        }
    }

    // The main function that converts given infix expression to postfix expression
    static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (Character.isDigit(c)) {
                postfix.append(c);

                // If the next character is not a digit, we have finished parsing the current operand
                if (i == infix.length() - 1 || !Character.isDigit(infix.charAt(i+1))) {
                    postfix.append(' ');
                }

            } else if (isOperator(c)) {
                while (!stack.isEmpty() && getPrecedence(stack.peek()) >= getPrecedence(c)) {
                    postfix.append(stack.pop()).append(' ');
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop()).append(' ');
        }

        return postfix.toString();
    }

    // A utility function to evaluate a postfix expression
    static int evaluatePostfix(String postfix) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = postfix.split(" ");

        for (String token : tokens) {
            if (token.isEmpty()) {
                continue;
            }
            if (Character.isDigit(token.charAt(0))) {
                stack.push(Integer.parseInt(token));
            } else {
                int op2 = stack.pop();
                int op1 = stack.pop();

                switch (token.charAt(0)) {
                    case '+':
                        stack.push(op1 + op2);
                        break;
                    case '-':
                        stack.push(op1 - op2);
                        break;
                    case '*':
                        stack.push(op1 * op2);
                        break;
                    case '/':
                        stack.push(op1 / op2);
                        break;
                }
            }
        }

        return stack.pop();
    }


}
