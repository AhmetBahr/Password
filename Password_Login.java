import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Password_Login extends JFrame {

	private JPanel contentPane;
	private JTextField UserText;
	private JTextField PassText;
	private JTextField PassText2;
	private JTextField FinishText;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Password_Login frame = new Password_Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Password_Login() {
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel LabelUser = new JLabel("User Name");
		LabelUser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		LabelUser.setHorizontalAlignment(SwingConstants.CENTER);
		LabelUser.setBounds(37, 51, 96, 33);
		contentPane.add(LabelUser);
		
		
		JLabel PassWord = new JLabel("PassWord");
		PassWord.setHorizontalAlignment(SwingConstants.CENTER);
		PassWord.setFont(new Font("Tahoma", Font.PLAIN, 16));
		PassWord.setBounds(37, 111, 96, 33);
		contentPane.add(PassWord);
		//JPasswordField passwordField = new JPasswordField();
		
		UserText = new JTextField();
		UserText.setBounds(156, 51, 179, 33);
		contentPane.add(UserText);
		UserText.setColumns(10);
		
		
		String b ="",a ="", isim ="";
		
		
		PassText = new JTextField();
		PassText.setText(a);
		PassText.setColumns(10);
		PassText.setBounds(156, 111, 179, 33);
		contentPane.add(PassText);
		
		
		
		PassText2 = new JTextField();
		PassText2.setText(b);
		PassText2.setBounds(37, 154, 96, 19);
		contentPane.add(PassText2);
		PassText2.setColumns(10);
	
		
		
		
		
		JCheckBox JCheck = new JCheckBox("Show Password");
		JCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == JCheck) {
		            if (JCheck.isSelected()) {
		            	//PassText.setEchoChar((char) 0);
		            } else {
		            	//PassText.setEchoChar('*');
		            }
		 
		 
		        }
			}
		});
		JCheck.setBounds(156, 150, 129, 26);
		contentPane.add(JCheck);
		contentPane.setLayout(null);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PassText.setText(PassText.getText()+7);
				PassText2.setText(PassText2.getText()+7);
			}
		});
		b7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		b7.setBounds(37, 200, 50, 50);
		contentPane.add(b7);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PassText.setText(PassText.getText()+4);
				PassText2.setText(PassText2.getText()+4);
			}
		});
		b4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		b4.setBounds(37, 260, 50, 50);
		contentPane.add(b4);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PassText.setText(PassText.getText()+1);
				PassText2.setText(PassText2.getText()+1);
			}
		});
		b1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		b1.setBounds(37, 320, 50, 50);
		contentPane.add(b1);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PassText.setText(PassText.getText()+8);
				PassText2.setText(PassText2.getText()+8);
			}
		});
		b8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		b8.setBounds(135, 200, 50, 50);
		contentPane.add(b8);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PassText.setText(PassText.getText()+9);
				PassText2.setText(PassText2.getText()+9);
			}
		});
		b9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		b9.setBounds(239, 200, 50, 50);
		
		contentPane.add(b9);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PassText.setText(PassText.getText()+5);
				PassText2.setText(PassText2.getText()+5);
			}
		});
		b5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		b5.setBounds(135, 260, 50, 50);
		contentPane.add(b5);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PassText.setText(PassText.getText()+2);
				PassText2.setText(PassText2.getText()+2);
			}
		});
		b2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		b2.setBounds(135, 320, 50, 50);
		contentPane.add(b2);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PassText.setText(PassText.getText()+6);
				PassText2.setText(PassText2.getText()+6);
			}
		});
		b6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		b6.setBounds(239, 260, 50, 50);
		contentPane.add(b6);
		
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PassText.setText(PassText.getText()+3);
				PassText2.setText(PassText2.getText()+3);
			}
		});
		b3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		b3.setBounds(239, 320, 50, 50);
		contentPane.add(b3);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PassText.setText(PassText.getText()+0);
				PassText2.setText(PassText2.getText()+0);
			}
		});
		b0.setFont(new Font("Tahoma", Font.PLAIN, 14));
		b0.setBounds(135, 385, 50, 50);
		contentPane.add(b0);
		
		JButton LoginButton = new JButton("Login");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (a.equals("12345") && b.equals("12345")) {
					FinishText.setText("Giriþ baþarýlý");
	            } else {
	            	FinishText.setText("Eþleþmeyen kullanýcý, þifre");
	            }
			}
		});
		LoginButton.setBounds(323, 280, 80, 40);
		contentPane.add(LoginButton);
		LoginButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton ResetButton = new JButton("Reset");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if (e.getSource() == ResetButton) {
					 UserText.setText("");
			         PassText.setText("");
			         PassText2.setText("");
			        }
			
			}
		});
		ResetButton.setBounds(323, 205, 80, 40);
		contentPane.add(ResetButton);
		ResetButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		FinishText = new JTextField();
		FinishText.setFont(new Font("Tahoma", Font.PLAIN, 13));
		FinishText.setBounds(195, 393, 208, 40);
		contentPane.add(FinishText);
		FinishText.setColumns(10);
		
		
		
	}
}

















