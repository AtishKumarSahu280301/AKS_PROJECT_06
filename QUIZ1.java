package quizgame;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class QUIZ1 {

	private JFrame frame;
	private JRadioButton Q1OPT1, Q2OPT1, Q3OPT1, Q4OPT1, Q5OPT1;
	private JRadioButton Q1OPT2, Q2OPT2, Q3OPT2, Q4OPT2, Q5OPT2;
	private JRadioButton Q1OPT3, Q2OPT3, Q3OPT3, Q4OPT3, Q5OPT3;
	private JRadioButton Q1OPT4, Q2OPT4, Q3OPT4, Q4OPT4, Q5OPT4;
	private JButton NXTSUB;
	private JLabel Points;
	private JLabel Score;
	public int SCORE1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QUIZ1 window = new QUIZ1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public QUIZ1() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Atish kumar sahu\\eclipse-workspace\\Quiz Game Project\\src\\puzzle.png"));
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.setTitle("Quiz Game By Atish Kumar Sahu");
		frame.setBounds(100, 100, 1070, 764);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel QOPTHEAD = new JLabel("Computer Basic Quiz");
		QOPTHEAD.setForeground(new Color(165, 42, 42));
		QOPTHEAD.setFont(new Font("Segoe Print", Font.BOLD, 40));
		QOPTHEAD.setBounds(300, 43, 457, 62);
		frame.getContentPane().add(QOPTHEAD);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Atish kumar sahu\\eclipse-workspace\\Quiz Game Project\\src\\puzzle.png"));
		lblNewLabel.setBounds(40, 44, 110, 106);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Atish kumar sahu\\eclipse-workspace\\Quiz Game Project\\src\\puzzle.png"));
		lblNewLabel_1.setBounds(912, 44, 110, 106);
		frame.getContentPane().add(lblNewLabel_1);
		
		Points = new JLabel("Points:");
		Points.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		Points.setBounds(40, 600, 74, 37);
		frame.getContentPane().add(Points);
		
		Score = new JLabel("");
		Score.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		Score.setBounds(140, 600, 138, 37);
		frame.getContentPane().add(Score);
		
		/*****************************************************************************************/
		
		JLabel QUEST1 = new JLabel("Q1. Who is the father of Computers?");
		QUEST1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		QUEST1.setBounds(40, 240, 400, 29);
		frame.getContentPane().add(QUEST1);
		
		Q1OPT1 = new JRadioButton("James Gosling");
		Q1OPT1.setBackground(new Color(135, 206, 250));
		Q1OPT1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		Q1OPT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Q1OPT1.isSelected())
				{
					Q1OPT2.setSelected(false);
					Q1OPT3.setSelected(false);
					Q1OPT4.setSelected(false);
				}
			}
		});
		Q1OPT1.setBounds(40, 288, 300, 25);
		frame.getContentPane().add(Q1OPT1);
		
		Q1OPT2 = new JRadioButton("Bjarne Stroustrup");
		Q1OPT2.setBackground(new Color(135, 206, 250));
		Q1OPT2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		Q1OPT2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Q1OPT2.isSelected())
				{
					Q1OPT1.setSelected(false);
					Q1OPT3.setSelected(false);
					Q1OPT4.setSelected(false);
				}
			}
		});
		Q1OPT2.setBounds(500, 288, 300, 25);
		frame.getContentPane().add(Q1OPT2);
		
		Q1OPT3 = new JRadioButton("Charles Babbage");
		Q1OPT3.setBackground(new Color(135, 206, 250));
		Q1OPT3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		Q1OPT3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Q1OPT3.isSelected())
				{
					Q1OPT1.setSelected(false);
					Q1OPT2.setSelected(false);
					Q1OPT4.setSelected(false);
				}
			}
		});
		Q1OPT3.setBounds(40, 333, 300, 25);
		frame.getContentPane().add(Q1OPT3);
		
		Q1OPT4 = new JRadioButton("James Gosling");
		Q1OPT4.setBackground(new Color(135, 206, 250));
		Q1OPT4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		Q1OPT4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Q1OPT4.isSelected())
				{
					Q1OPT1.setSelected(false);
					Q1OPT2.setSelected(false);
					Q1OPT3.setSelected(false);
				}
			}
		});
		Q1OPT4.setBounds(500, 333, 300, 25);
		frame.getContentPane().add(Q1OPT4);
		
		/*****************************************************************************************/
		
		JLabel QUEST2 = new JLabel("Q2. What is the full form of CPU?");
		QUEST2.setVisible(false);
		QUEST2.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		QUEST2.setBounds(40, 240, 400, 29);
		frame.getContentPane().add(QUEST2);
		
		Q2OPT1 = new JRadioButton("Computer Principle Unit");
		Q2OPT1.setBackground(new Color(135, 206, 250));
		Q2OPT1.setVisible(false);
		Q2OPT1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		Q2OPT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Q2OPT1.isSelected())
				{
					Q2OPT2.setSelected(false);
					Q2OPT3.setSelected(false);
					Q2OPT4.setSelected(false);
				}
			}
		});
		Q2OPT1.setBounds(40, 288, 300, 25);
		frame.getContentPane().add(Q2OPT1);
		
		Q2OPT2 = new JRadioButton("Central Processing Unit");
		Q2OPT2.setBackground(new Color(135, 206, 250));
		Q2OPT2.setVisible(false);
		Q2OPT2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		Q2OPT2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Q2OPT2.isSelected())
				{
					Q2OPT1.setSelected(false);
					Q2OPT3.setSelected(false);
					Q2OPT4.setSelected(false);
				}
			}
		});
		Q2OPT2.setBounds(500, 288, 300, 25);
		frame.getContentPane().add(Q2OPT2);
		
		Q2OPT3 = new JRadioButton("Computer Processing Unit");
		Q2OPT3.setBackground(new Color(135, 206, 250));
		Q2OPT3.setVisible(false);
		Q2OPT3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		Q2OPT3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Q2OPT3.isSelected())
				{
					Q2OPT1.setSelected(false);
					Q2OPT2.setSelected(false);
					Q2OPT4.setSelected(false);
				}
			}
		});
		Q2OPT3.setBounds(40, 333, 300, 25);
		frame.getContentPane().add(Q2OPT3);
		
		Q2OPT4 = new JRadioButton("Control Processing Unit");
		Q2OPT4.setBackground(new Color(135, 206, 250));
		Q2OPT4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		Q2OPT4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Q2OPT4.isSelected())
				{
					Q2OPT1.setSelected(false);
					Q2OPT2.setSelected(false);
					Q2OPT3.setSelected(false);
				}
			}
		});
		Q2OPT4.setBounds(500, 333, 300, 25);
		frame.getContentPane().add(Q2OPT4);

		
		/*****************************************************************************************/
		
		JLabel QUEST3 = new JLabel("Q3. Which of the following is the brain of the computer?");
		QUEST3.setVisible(false);
		QUEST3.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		QUEST3.setBounds(40, 240, 510, 29);
		frame.getContentPane().add(QUEST3);
		
		Q3OPT1 = new JRadioButton("Control unit");
		Q3OPT1.setBackground(new Color(135, 206, 250));
		Q3OPT1.setVisible(false);
		Q3OPT1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		Q3OPT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Q3OPT1.isSelected())
				{
					Q3OPT2.setSelected(false);
					Q3OPT3.setSelected(false);
					Q3OPT4.setSelected(false);
				}
			}
		});
		Q3OPT1.setBounds(40, 288, 300, 25);
		frame.getContentPane().add(Q3OPT1);
		
		Q3OPT2 = new JRadioButton("Arithmetic and Logic unit");
		Q3OPT2.setBackground(new Color(135, 206, 250));
		Q3OPT2.setVisible(false);
		Q3OPT2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		Q3OPT2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Q3OPT2.isSelected())
				{
					Q3OPT1.setSelected(false);
					Q3OPT3.setSelected(false);
					Q3OPT4.setSelected(false);
				}
			}
		});
		Q3OPT2.setBounds(500, 288, 300, 25);
		frame.getContentPane().add(Q3OPT2);
		
		Q3OPT3 = new JRadioButton("Memory");
		Q3OPT3.setBackground(new Color(135, 206, 250));
		Q3OPT3.setVisible(false);
		Q3OPT3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		Q3OPT3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Q3OPT3.isSelected())
				{
					Q3OPT1.setSelected(false);
					Q3OPT2.setSelected(false);
					Q3OPT4.setSelected(false);
				}
			}
		});
		Q3OPT3.setBounds(40, 333, 300, 25);
		frame.getContentPane().add(Q3OPT3);
		
		Q3OPT4 = new JRadioButton("Central Processing Unit");
		Q3OPT4.setBackground(new Color(135, 206, 250));
		Q3OPT4.setVisible(false);
		Q3OPT4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		Q3OPT4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Q3OPT4.isSelected())
				{
					Q3OPT1.setSelected(false);
					Q3OPT2.setSelected(false);
					Q3OPT3.setSelected(false);
				}
			}
		});
		Q3OPT4.setBounds(500, 333, 300, 25);
		frame.getContentPane().add(Q3OPT4);
		
		/*****************************************************************************************/
		
		JLabel QUEST4 = new JLabel("Q4. Which of the following is the smallest unit of data in a computer?");
		QUEST4.setVisible(false);
		QUEST4.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		QUEST4.setBounds(40, 240, 619, 29);
		frame.getContentPane().add(QUEST4);
		
		Q4OPT1 = new JRadioButton("Bit");
		Q4OPT1.setBackground(new Color(135, 206, 250));
		Q4OPT1.setVisible(false);
		Q4OPT1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		Q4OPT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Q4OPT1.isSelected())
				{
					Q4OPT2.setSelected(false);
					Q4OPT3.setSelected(false);
					Q4OPT4.setSelected(false);
				}
			}
		});
		Q4OPT1.setBounds(40, 288, 300, 25);
		frame.getContentPane().add(Q4OPT1);
		
		Q4OPT2 = new JRadioButton("Nibble");
		Q4OPT2.setBackground(new Color(135, 206, 250));
		Q4OPT2.setVisible(false);
		Q4OPT2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		Q4OPT2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Q4OPT2.isSelected())
				{
					Q4OPT1.setSelected(false);
					Q4OPT3.setSelected(false);
					Q4OPT4.setSelected(false);
				}
			}
		});
		Q4OPT2.setBounds(500, 288, 300, 25);
		frame.getContentPane().add(Q4OPT2);
		
		Q4OPT3 = new JRadioButton("KB");
		Q4OPT3.setBackground(new Color(135, 206, 250));
		Q4OPT3.setVisible(false);
		Q4OPT3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		Q4OPT3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Q4OPT3.isSelected())
				{
					Q4OPT1.setSelected(false);
					Q4OPT2.setSelected(false);
					Q4OPT4.setSelected(false);
				}
			}
		});
		Q4OPT3.setBounds(40, 333, 300, 25);
		frame.getContentPane().add(Q4OPT3);
		
		Q4OPT4 = new JRadioButton("Byte");
		Q4OPT4.setBackground(new Color(135, 206, 250));
		Q4OPT4.setVisible(false);
		Q4OPT4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		Q4OPT4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Q4OPT4.isSelected())
				{
					Q4OPT1.setSelected(false);
					Q4OPT2.setSelected(false);
					Q4OPT3.setSelected(false);
				}
			}
		});
		Q4OPT4.setBounds(500, 333, 300, 25);
		frame.getContentPane().add(Q4OPT4);
		
		/*****************************************************************************************/
		
		JLabel QUEST5 = new JLabel("Q5. Which of the following are physical devices of a computer?");
		QUEST5.setVisible(false);
		QUEST5.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		QUEST5.setBounds(40, 240, 619, 29);
		frame.getContentPane().add(QUEST5);
		
		Q5OPT1 = new JRadioButton("Software");
		Q5OPT1.setBackground(new Color(135, 206, 250));
		Q5OPT1.setVisible(false);
		Q5OPT1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		Q5OPT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Q5OPT1.isSelected())
				{
					Q5OPT2.setSelected(false);
					Q5OPT3.setSelected(false);
					Q5OPT4.setSelected(false);
				}
			}
		});
		Q5OPT1.setBounds(40, 288, 300, 25);
		frame.getContentPane().add(Q5OPT1);
		
		Q5OPT2 = new JRadioButton("Hardware");
		Q5OPT2.setBackground(new Color(135, 206, 250));
		Q5OPT2.setVisible(false);
		Q5OPT2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		Q5OPT2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Q5OPT2.isSelected())
				{
					Q5OPT1.setSelected(false);
					Q5OPT3.setSelected(false);
					Q5OPT4.setSelected(false);
				}
			}
		});
		Q5OPT2.setBounds(500, 288, 300, 25);
		frame.getContentPane().add(Q5OPT2);
		
		Q5OPT3 = new JRadioButton("Package");
		Q5OPT3.setBackground(new Color(135, 206, 250));
		Q5OPT3.setVisible(false);
		Q5OPT3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		Q5OPT3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Q5OPT3.isSelected())
				{
					Q5OPT1.setSelected(false);
					Q5OPT2.setSelected(false);
					Q5OPT4.setSelected(false);
				}
			}
		});
		Q5OPT3.setBounds(40, 333, 300, 25);
		frame.getContentPane().add(Q5OPT3);
		
		Q5OPT4 = new JRadioButton("System Software");
		Q5OPT4.setBackground(new Color(135, 206, 250));
		Q5OPT4.setVisible(false);
		Q5OPT4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		Q5OPT4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Q5OPT4.isSelected())
				{
					Q5OPT1.setSelected(false);
					Q5OPT2.setSelected(false);
					Q5OPT3.setSelected(false);
				}
			}
		});
		Q5OPT4.setBounds(500, 333, 300, 25);
		frame.getContentPane().add(Q5OPT4);
		
		/*****************************************************************************************/
		
		NXTSUB = new JButton("Submit");
		NXTSUB.setBackground(new Color(255, 255, 255));
		NXTSUB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int SCORE = 0;
				if(Q1OPT3.isSelected())
				{
					SCORE += 10;
					Score.setText(Integer.toString(SCORE));
					SCORE1 = SCORE;
				}
				if(Q1OPT1.isSelected() | Q1OPT2.isSelected() | Q1OPT3.isSelected() | Q1OPT4.isSelected())
				{
					QUEST1.setVisible(false);
					Q1OPT1.setVisible(false);
					Q1OPT2.setVisible(false);
					Q1OPT3.setVisible(false);
					Q1OPT4.setVisible(false);
					
					QUEST2.setVisible(true);
					Q2OPT1.setVisible(true);
					Q2OPT2.setVisible(true);
					Q2OPT3.setVisible(true);
					Q2OPT4.setVisible(true);
				}

				if(Q2OPT2.isSelected())
				{
					SCORE += 10;
					Score.setText(Integer.toString(SCORE));
					SCORE1 = SCORE;
				}
				if(Q2OPT1.isSelected() | Q2OPT2.isSelected() | Q2OPT3.isSelected() | Q2OPT4.isSelected())
				{
					QUEST2.setVisible(false);
					Q2OPT1.setVisible(false);
					Q2OPT2.setVisible(false);
					Q2OPT3.setVisible(false);
					Q2OPT4.setVisible(false);
					
					QUEST3.setVisible(true);
					Q3OPT1.setVisible(true);
					Q3OPT2.setVisible(true);
					Q3OPT3.setVisible(true);
					Q3OPT4.setVisible(true);
				}

				if(Q3OPT4.isSelected())
				{
					SCORE += 10;
					Score.setText(Integer.toString(SCORE));
					SCORE1 = SCORE;
				}
				if(Q3OPT1.isSelected() | Q3OPT2.isSelected() | Q3OPT3.isSelected() | Q3OPT4.isSelected())
				{
					QUEST3.setVisible(false);
					Q3OPT1.setVisible(false);
					Q3OPT2.setVisible(false);
					Q3OPT3.setVisible(false);
					Q3OPT4.setVisible(false);
					
					QUEST4.setVisible(true);
					Q4OPT1.setVisible(true);
					Q4OPT2.setVisible(true);
					Q4OPT3.setVisible(true);
					Q4OPT4.setVisible(true);
				}
				
				if(Q4OPT1.isSelected())
				{
					SCORE += 10;
					Score.setText(Integer.toString(SCORE));
					SCORE1 = SCORE;
				}
				if(Q4OPT1.isSelected() | Q4OPT2.isSelected() | Q4OPT3.isSelected() | Q4OPT4.isSelected())
				{
					QUEST4.setVisible(false);
					Q4OPT1.setVisible(false);
					Q4OPT2.setVisible(false);
					Q4OPT3.setVisible(false);
					Q4OPT4.setVisible(false);
					
					QUEST5.setVisible(true);
					Q5OPT1.setVisible(true);
					Q5OPT2.setVisible(true);
					Q5OPT3.setVisible(true);
					Q5OPT4.setVisible(true);
				}
				if(Q5OPT2.isSelected())
				{
					SCORE += 10;
					Score.setText(Integer.toString(SCORE));
					SCORE1 = SCORE;
				}
			}
		});
		NXTSUB.setForeground(new Color(0, 0, 139));
		NXTSUB.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		NXTSUB.setBounds(600, 600, 100, 30);
		frame.getContentPane().add(NXTSUB);
		
		JButton EXITB = new JButton("Exit");
		EXITB.setBackground(new Color(255, 255, 255));
		EXITB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Your Score Is : "+SCORE1);
				frame.dispose();
				QOPTION.main(null);
			}
		});
		EXITB.setForeground(new Color(255, 69, 0));
		EXITB.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		EXITB.setBounds(850, 600, 100, 30);
		frame.getContentPane().add(EXITB);
	}
}