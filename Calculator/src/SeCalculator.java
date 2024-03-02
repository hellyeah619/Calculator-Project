import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class SeCalculator {

	private JFrame frame;
	private JTextField textField;
	double first, second, result;
	String operation, answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeCalculator window = new SeCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SeCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 411, 567);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculator");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(137, 11, 137, 26);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setBounds(10, 37, 374, 48);
		textField.setBackground(Color.white);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn_root = new JButton("\u221A");
		btn_root.setEnabled(false);
		btn_root.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btn_root.setBounds(10, 108, 67, 59);
		frame.getContentPane().add(btn_root);
		
		JButton btn_log = new JButton("log");
		btn_log.setEnabled(false);
		btn_log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btn_log.setBounds(10, 178, 67, 59);
		frame.getContentPane().add(btn_log);
		
		JButton btn_xy = new JButton("x^y");
		btn_xy.setEnabled(false);
		btn_xy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "x^y";
			}
		});
		btn_xy.setBounds(10, 248, 67, 59);
		frame.getContentPane().add(btn_xy);
		
		JButton btn_pow = new JButton("x\u00B2");
		btn_pow.setEnabled(false);
		btn_pow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				a = a*a;
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btn_pow.setBounds(10, 318, 67, 59);
		frame.getContentPane().add(btn_pow);
		
		JButton btn_fact = new JButton("n!");
		btn_fact.setEnabled(false);
		btn_fact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				double fact = 1;
				while(a!=0) {
					fact = fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText() + fact);
			}
		});
		btn_fact.setBounds(10, 388, 67, 59);
		frame.getContentPane().add(btn_fact);
		
		JButton btn_sci = new JButton("+/-");
		btn_sci.setEnabled(false);
		btn_sci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a =a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btn_sci.setBounds(10, 458, 67, 59);
		frame.getContentPane().add(btn_sci);
		
		JButton btnEx = new JButton("e^x");
		btnEx.setEnabled(false);
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnEx.setBounds(87, 108, 67, 59);
		frame.getContentPane().add(btnEx);
		
		JButton btnTan = new JButton("Tan");
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.atan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setBounds(317, 108, 67, 59);
		frame.getContentPane().add(btnTan);
		
		JButton btn_7 = new JButton("7");
		btn_7.setEnabled(false);
		btn_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn_7.getText();
				textField.setText(number);
			}
			
		});
		btn_7.setBounds(87, 248, 67, 59);
		frame.getContentPane().add(btn_7);
		
		JButton btn_4 = new JButton("4");
		btn_4.setEnabled(false);
		btn_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn_4.getText();
				textField.setText(number);
			}
		});
		btn_4.setBounds(87, 318, 67, 59);
		frame.getContentPane().add(btn_4);
		
		JButton btn_1 = new JButton("1");
		btn_1.setEnabled(false);
		btn_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn_1.getText();
				textField.setText(number);
			}
		});
		btn_1.setBounds(87, 388, 67, 59);
		frame.getContentPane().add(btn_1);
		
		JButton btnSin = new JButton("Sin");
		btnSin.setEnabled(false);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.asin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnSin.setBounds(164, 108, 67, 59);
		frame.getContentPane().add(btnSin);
		
		JButton btn_mod = new JButton("%");
		btn_mod.setEnabled(false);
		btn_mod.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btn_mod.setBounds(87, 178, 67, 59);
		frame.getContentPane().add(btn_mod);
		
		JButton btn_8 = new JButton("8");
		btn_8.setEnabled(false);
		btn_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn_8.getText();
				textField.setText(number);
			}
		});
		btn_8.setBounds(164, 248, 67, 59);
		frame.getContentPane().add(btn_8);
		
		JButton btn_5 = new JButton("5");
		btn_5.setEnabled(false);
		btn_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn_5.getText();
				textField.setText(number);
			}
		});
		btn_5.setBounds(164, 318, 67, 59);
		frame.getContentPane().add(btn_5);
		
		JButton btn_2 = new JButton("2");
		btn_2.setEnabled(false);
		btn_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn_2.getText();
				textField.setText(number);
			}
		});
		btn_2.setBounds(164, 388, 67, 59);
		frame.getContentPane().add(btn_2);
		
		JButton btn_0 = new JButton("0");
		btn_0.setEnabled(false);
		btn_0.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn_0.getText();
				textField.setText(number);
			}
		});
		btn_0.setBounds(87, 458, 144, 59);
		frame.getContentPane().add(btn_0);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.acos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setBounds(241, 108, 67, 59);
		frame.getContentPane().add(btnCos);
		
		JButton btn_clear = new JButton("C");
		btn_clear.setEnabled(false);
		btn_clear.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btn_clear.setBounds(164, 178, 67, 59);
		frame.getContentPane().add(btn_clear);
		
		JButton btn_9 = new JButton("9");
		btn_9.setEnabled(false);
		btn_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn_9.getText();
				textField.setText(number);
			}
		});
		btn_9.setBounds(241, 248, 67, 59);
		frame.getContentPane().add(btn_9);
		
		JButton btn_6 = new JButton("6");
		btn_6.setEnabled(false);
		btn_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn_6.getText();
				textField.setText(number);
			}
		});
		btn_6.setBounds(241, 318, 67, 59);
		frame.getContentPane().add(btn_6);
		
		JButton btn_3 = new JButton("3");
		btn_3.setEnabled(false);
		btn_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn_3.getText();
				textField.setText(number);
			}
		});
		btn_3.setBounds(241, 388, 67, 59);
		frame.getContentPane().add(btn_3);
		
		JButton btn_dot = new JButton(".");
		btn_dot.setEnabled(false);
		btn_dot.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn_dot.getText();
				textField.setText(number);
			}
		});
		btn_dot.setBounds(241, 458, 67, 59);
		frame.getContentPane().add(btn_dot);
		
		JButton btn_backspace = new JButton("\uF0E7");
		btn_backspace.setEnabled(false);
		btn_backspace.setFont(new Font("Wingdings", Font.PLAIN, 15));
		btn_backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				
				if(textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() -1 );
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btn_backspace.setBounds(241, 178, 67, 59);
		frame.getContentPane().add(btn_backspace);
		
		JButton btn_div = new JButton("\u00F7");
		btn_div.setEnabled(false);
		btn_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btn_div.setBounds(318, 178, 67, 59);
		frame.getContentPane().add(btn_div);
		
		JButton btn_mul = new JButton("\u00D7");
		btn_mul.setEnabled(false);
		btn_mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btn_mul.setBounds(318, 248, 67, 59);
		frame.getContentPane().add(btn_mul);
		
		JButton btn_minus = new JButton("-");
		btn_minus.setEnabled(false);
		btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btn_minus.setBounds(318, 318, 67, 59);
		frame.getContentPane().add(btn_minus);
		
		JButton btn_plus = new JButton("+");
		btn_plus.setEnabled(false);
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btn_plus.setBounds(318, 388, 67, 59);
		frame.getContentPane().add(btn_plus);
		
		JButton btn_eql = new JButton("=");
		btn_eql.setEnabled(false);
		btn_eql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				if(operation == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if(operation == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if(operation == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if(operation == "/") {
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if(operation == "%") {
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if(operation == "x^y") {
					double ans = 1;
					for(int i = 1; i<=second; i++) {
						ans = first*ans;
					}
					answer = String.format("%.2f", ans);
					textField.setText(answer);
				}
			}
		});
		btn_eql.setBounds(318, 458, 67, 59);
		frame.getContentPane().add(btn_eql);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setBackground(Color.white);
				btn_1.setEnabled(true);
				btn_2.setEnabled(true);
				btn_3.setEnabled(true);
				btn_4.setEnabled(true);
				btn_5.setEnabled(true);
				btn_6.setEnabled(true);
				btn_7.setEnabled(true);
				btn_8.setEnabled(true);
				btn_9.setEnabled(true);
				btn_0.setEnabled(true);
				btn_backspace.setEnabled(true);
				btn_dot.setEnabled(true);
				btn_root.setEnabled(true);
				btnEx.setEnabled(true);
				btnSin.setEnabled(true);
				btnCos.setEnabled(true);
				btnTan.setEnabled(true);
				btn_log.setEnabled(true);
				btn_mod.setEnabled(true);
				btn_clear.setEnabled(true);
				btn_pow.setEnabled(true);
				btn_xy.setEnabled(true);
				btn_fact.setEnabled(true);
				btn_sci.setEnabled(true);
				btn_plus.setEnabled(true);
				btn_minus.setEnabled(true);
				btn_div.setEnabled(true);
				btn_mul.setEnabled(true);
				btn_eql.setEnabled(true);
				textField.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdbtnNewRadioButton.setBounds(10, 86, 49, 15);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.setSelected(true);
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setBackground(null);
				textField.setText(null);
				btn_1.setEnabled(false);
				btn_2.setEnabled(false);
				btn_3.setEnabled(false);
				btn_4.setEnabled(false);
				btn_5.setEnabled(false);
				btn_6.setEnabled(false);
				btn_7.setEnabled(false);
				btn_8.setEnabled(false);
				btn_9.setEnabled(false);
				btn_0.setEnabled(false);
				btn_backspace.setEnabled(false);
				btn_dot.setEnabled(false);
				btn_root.setEnabled(false);
				btnEx.setEnabled(false);
				btnSin.setEnabled(false);
				btnCos.setEnabled(false);
				btnTan.setEnabled(false);
				btn_log.setEnabled(false);
				btn_mod.setEnabled(false);
				btn_clear.setEnabled(false);
				btn_pow.setEnabled(false);
				btn_xy.setEnabled(false);
				btn_fact.setEnabled(false);
				btn_sci.setEnabled(false);
				btn_plus.setEnabled(false);
				btn_minus.setEnabled(false);
				btn_div.setEnabled(false);
				btn_mul.setEnabled(false);
				btn_eql.setEnabled(false);
				textField.setEditable(false);
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdbtnOff.setBounds(61, 86, 49, 15);
		frame.getContentPane().add(rdbtnOff);
	}
}
