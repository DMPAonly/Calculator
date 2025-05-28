import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class calculator implements ActionListener{

    static JLabel label = new JLabel("0");
    String a;
    String b;
    String operator;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "1" -> {
                changeLabel("1");
                break;
            }
            case "2" -> {
                changeLabel("2");
                break;
            }
            case "3" -> {
                changeLabel("3");
                break;
            }
            case "4" -> {
                changeLabel("4");
                break;
            }
            case "5" -> {
                changeLabel("5");
                break;
            }
            case "6" -> {
                changeLabel("6");
                break;
            }
            case "7" -> {
                changeLabel("7");
                break;
            }
            case "8" -> {
                changeLabel("8");
                break;
            }
            case "9" -> {
                changeLabel("9");
                break;
            }
            case "0" -> {
                changeLabel("0");
                break;
            }
            case "+" -> {
                try {
                    if(!(label.getText()).equals("0")){
                        if(a == null){
                            a = label.getText();
                            System.out.println("a ="+a);
                        } else if(b == null){
                            b = label.getText().substring(a.length() + 3);
                            System.out.println("b ="+b);
                            a = String.valueOf(mathOps());
                            System.out.println("a ="+a);
                            label.setText(a);
                        }
                        operator = "+";
                        changeLabel(" + ");
                        break;
                    } 
                } catch (NumberFormatException ex) {
                    System.out.println(ex);
                    break;
                }   
            }
            case "-" -> {
                try {
                    if(!(label.getText()).equals("0")){
                        if(a == null){
                            a = label.getText();
                            System.out.println("a ="+a);
                        } else if(b == null){
                            b = label.getText().substring(a.length() + 3);
                            System.out.println("b ="+b);
                            a = String.valueOf(mathOps());
                            System.out.println("a ="+a);
                            label.setText(a);
                        }
                        operator = "-";
                        changeLabel(" - ");
                        break;
                    } 
                } catch (NumberFormatException ex) {
                    System.out.println(ex);
                    break;
                } 
            }
            case "x" -> {
                try {
                    if(!(label.getText()).equals("0")){
                        if(a == null){
                            a = label.getText();
                            System.out.println("a ="+a);
                        } else if(b == null){
                            b = label.getText().substring(a.length() + 3);
                            System.out.println("b ="+b);
                            a = String.valueOf(mathOps());
                            System.out.println("a ="+a);
                            label.setText(a);
                        }
                        operator = "x";
                        changeLabel(" x ");
                        break;
                    } 
                } catch (NumberFormatException ex) {
                    System.out.println(ex);
                    break;
                }  
            }
            case "/" -> {
                try {
                    if(!(label.getText()).equals("0")){
                        if(a == null){
                            a = label.getText();
                            System.out.println("a ="+a);
                        } else if(b == null){
                            b = label.getText().substring(a.length() + 3);
                            System.out.println("b ="+b);
                            a = String.valueOf(mathOps());
                            System.out.println("a ="+a);
                            label.setText(a);
                        }
                        operator = "/";
                        changeLabel(" / ");
                        break;
                    } 
                } catch (NumberFormatException ex) {
                    System.out.println(ex);
                    break;
                } 
            }
            case "=" -> {
                try {
                    if(!(label.getText()).equals("0")){
                        b = label.getText().substring(a.length() + 3);
                        label.setText(String.valueOf(mathOps()));
                        a = null;
                    }
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println(ex);
                    break;
                }  
            }
            case "C" -> {
                label.setText("0");
                a = null;
                b = null;
                operator = null;
            }
        }
    }

    public void changeLabel(String x) {
        if((label.getText()).equals("0")){
            label.setText(x);
        } else{
            label.setText(label.getText() + x);
        }
    }

    public int mathOps() {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        int num3 = 0;
        switch(operator) {
            case "+" -> {
                num3 = num1 + num2;
                break;
            }
            case "-" -> {
                num3 = num1 - num2;
                break;
            }
            case "x" -> {
                num3 = num1 * num2;
                break;
            }
            case "/" -> {
                num3 = num1 / num2;
                break;
            }
        }
        operator = null;
        b = null;
        return num3;
    }

    public static void main(String[] args) {
        calculator cal = new calculator();

        JFrame frame = new JFrame();
        frame.setTitle("calculator");
        frame.setSize(270, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        label.setOpaque(true);
        label.setForeground(Color.BLACK);
        label.setBounds(10, 10, 170, 90);
        panel.add(label);
        
        JButton btn_1 = new JButton("1");
        btn_1.setBounds(10, 100, 50, 30);
        btn_1.setBackground(Color.BLACK);
        btn_1.setForeground(Color.WHITE);
        panel.add(btn_1);
        btn_1.addActionListener(cal);

        JButton btn_2 = new JButton("2");
        btn_2.setBounds(70, 100, 50, 30);
        btn_2.setBackground(Color.BLACK);
        btn_2.setForeground(Color.WHITE);
        panel.add(btn_2);
        btn_2.addActionListener(cal);
        
        JButton btn_3 = new JButton("3");
        btn_3.setBounds(130, 100, 50, 30);
        btn_3.setBackground(Color.BLACK);
        btn_3.setForeground(Color.WHITE);
        panel.add(btn_3);
        btn_3.addActionListener(cal);
        
        JButton btn_4 = new JButton("4");
        btn_4.setBounds(10, 140, 50, 30);
        btn_4.setBackground(Color.BLACK);
        btn_4.setForeground(Color.WHITE);
        panel.add(btn_4);
        btn_4.addActionListener(cal);
        
        JButton btn_5 = new JButton("5");
        btn_5.setBounds(70, 140, 50, 30);
        btn_5.setBackground(Color.BLACK);
        btn_5.setForeground(Color.WHITE);
        panel.add(btn_5);
        btn_5.addActionListener(cal);
        
        JButton btn_6 = new JButton("6");
        btn_6.setBounds(130, 140, 50, 30);
        btn_6.setBackground(Color.BLACK);
        btn_6.setForeground(Color.WHITE);
        panel.add(btn_6);
        btn_6.addActionListener(cal);
        
        JButton btn_7 = new JButton("7");
        btn_7.setBounds(10, 180, 50, 30);
        btn_7.setBackground(Color.BLACK);
        btn_7.setForeground(Color.WHITE);
        panel.add(btn_7);
        btn_7.addActionListener(cal);

        JButton btn_8 = new JButton("8");
        btn_8.setBounds(70, 180, 50, 30);
        btn_8.setBackground(Color.BLACK);
        btn_8.setForeground(Color.WHITE);
        panel.add(btn_8);
        btn_8.addActionListener(cal);
        
        JButton btn_9 = new JButton("9");
        btn_9.setBounds(130, 180, 50, 30);
        btn_9.setBackground(Color.BLACK);
        btn_9.setForeground(Color.WHITE);
        panel.add(btn_9);
        btn_9.addActionListener(cal);
        
        JButton btn_0 = new JButton("0");
        btn_0.setBounds(70, 220, 50, 30);
        btn_0.setBackground(Color.BLACK);
        btn_0.setForeground(Color.WHITE);
        panel.add(btn_0);
        btn_0.addActionListener(cal);

        JButton btn_equal = new JButton("=");
        btn_equal.setBounds(130, 220, 50, 30);
        btn_equal.setBackground(Color.GREEN);
        panel.add(btn_equal);
        btn_equal.addActionListener(cal);

        JButton btn_add = new JButton("+");
        btn_add.setBounds(190, 100, 50, 30);
        btn_add.setBackground(Color.ORANGE);
        panel.add(btn_add);
        btn_add.addActionListener(cal);

        JButton btn_sub = new JButton("-");
        btn_sub.setBounds(190, 140, 50, 30);
        btn_sub.setBackground(Color.ORANGE);
        panel.add(btn_sub);
        btn_sub.addActionListener(cal);

        JButton btn_multiply = new JButton("x");
        btn_multiply.setBounds(190, 180, 50, 30);
        btn_multiply.setBackground(Color.ORANGE);
        panel.add(btn_multiply);
        btn_multiply.addActionListener(cal);

        JButton btn_division = new JButton("/");
        btn_division.setBounds(190, 220, 50, 30);
        btn_division.setBackground(Color.ORANGE);
        panel.add(btn_division);
        btn_division.addActionListener(cal);

        JButton btn_C = new JButton("C");
        btn_C.setBounds(10, 220, 50, 30);
        btn_C.setBackground(Color.RED);
        btn_C.setForeground(Color.WHITE);
        panel.add(btn_C);
        btn_C.addActionListener(cal);

        frame.setVisible(true);
    } 
}
