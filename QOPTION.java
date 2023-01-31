package quizgame;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class QOPTION {

	private JFrame QFRAME;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QOPTION window = new QOPTION();
					window.QFRAME.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public QOPTION() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		QFRAME = new JFrame();
		QFRAME.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Atish kumar sahu\\eclipse-workspace\\Quiz Game Project\\src\\puzzle.png"));
		QFRAME.setResizable(false);
		QFRAME.getContentPane().setBackground(new Color(135, 206, 250));
		QFRAME.setTitle("Quiz Game By Atish Kumar Sahu");
		QFRAME.setBounds(100, 100, 1070, 764);
		QFRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		QFRAME.getContentPane().setLayout(null);
		
		JLabel QOPTHEAD = new JLabel("Choose A Topic Name");
		QOPTHEAD.setForeground(new Color(165, 42, 42));
		QOPTHEAD.setFont(new Font("Segoe Print", Font.BOLD, 40));
		QOPTHEAD.setBounds(300, 43, 457, 62);
		QFRAME.getContentPane().add(QOPTHEAD);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Atish kumar sahu\\eclipse-workspace\\Quiz Game Project\\src\\puzzle.png"));
		lblNewLabel.setBounds(40, 44, 110, 106);
		QFRAME.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Atish kumar sahu\\eclipse-workspace\\Quiz Game Project\\src\\puzzle.png"));
		lblNewLabel_1.setBounds(912, 44, 110, 106);
		QFRAME.getContentPane().add(lblNewLabel_1);
		
		JButton BASICB = new JButton("Basic");
		BASICB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				QFRAME.dispose();
				QUIZ1.main(null);
			}
		});
		BASICB.setBounds(50, 266, 120, 30);
		BASICB.setBackground(new Color(255, 255, 255));
		BASICB.setForeground(new Color(165, 42, 42));
		BASICB.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		QFRAME.getContentPane().add(BASICB);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QFRAME.dispose();
				QUIZ2.main(null);
			}
		});
		btnC.setForeground(new Color(255, 0, 0));
		btnC.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnC.setBackground(Color.WHITE);
		btnC.setBounds(450, 266, 120, 30);
		QFRAME.getContentPane().add(btnC);
		
		JButton CPPQUIZB = new JButton("C++");
		CPPQUIZB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QFRAME.dispose();
				QUIZ3.main(null);
			}
		});
		CPPQUIZB.setForeground(new Color(107, 142, 35));
		CPPQUIZB.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		CPPQUIZB.setBackground(Color.WHITE);
		CPPQUIZB.setBounds(890, 266, 120, 30);
		QFRAME.getContentPane().add(CPPQUIZB);
		
		JButton BACKB = new JButton("Back");
		BACKB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QFRAME.dispose();
				QUIZFRONT.main(null);
			}
		});
		BACKB.setToolTipText("");
		BACKB.setForeground(new Color(128, 0, 0));
		BACKB.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		BACKB.setBackground(Color.WHITE);
		BACKB.setBounds(905, 650, 100, 30);
		QFRAME.getContentPane().add(BACKB);
	}
}
