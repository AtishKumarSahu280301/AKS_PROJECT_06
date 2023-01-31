package quizgame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QUIZFRONT {

	private JFrame qframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QUIZFRONT window = new QUIZFRONT();
					window.qframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public QUIZFRONT() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		qframe = new JFrame();
		qframe.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Atish kumar sahu\\eclipse-workspace\\Quiz Game Project\\src\\puzzle.png"));
		qframe.setResizable(false);
		qframe.getContentPane().setBackground(new Color(135, 206, 250));
		qframe.setTitle("Quiz Game By Atish Kumar Sahu");
		qframe.setBounds(100, 100, 1070, 764);
		qframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		qframe.getContentPane().setLayout(null);
		
		JLabel WLCM = new JLabel("Welcome To The Quiz Game");
		WLCM.setForeground(new Color(165, 42, 42));
		WLCM.setFont(new Font("Segoe Print", Font.BOLD, 40));
		WLCM.setBounds(240, 44, 586, 62);
		qframe.getContentPane().add(WLCM);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Atish kumar sahu\\eclipse-workspace\\Quiz Game Project\\src\\puzzle.png"));
		lblNewLabel.setBounds(40, 44, 110, 106);
		qframe.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Atish kumar sahu\\eclipse-workspace\\Quiz Game Project\\src\\puzzle.png"));
		lblNewLabel_1.setBounds(912, 44, 110, 106);
		qframe.getContentPane().add(lblNewLabel_1);
		
		JButton GAME = new JButton("Game");
		GAME.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				qframe.dispose();
				QOPTION.main(null);
			}
		});
		GAME.setToolTipText("Go to game");
		GAME.setBackground(new Color(255, 255, 255));
		GAME.setForeground(new Color(0, 0, 255));
		GAME.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		GAME.setBounds(40, 650, 100, 30);
		qframe.getContentPane().add(GAME);
		
		JButton EXITB = new JButton("Exit");
		EXITB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		EXITB.setToolTipText("");
		EXITB.setForeground(new Color(128, 0, 0));
		EXITB.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		EXITB.setBackground(Color.WHITE);
		EXITB.setBounds(905, 650, 100, 30);
		qframe.getContentPane().add(EXITB);
		
		JLabel crt = new JLabel("Created By:");
		crt.setForeground(new Color(0, 100, 0));
		crt.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		crt.setBounds(570, 270, 175, 30);
		qframe.getContentPane().add(crt);
		
		JLabel AKS = new JLabel("Name: Atish Kumar Sahu");
		AKS.setForeground(new Color(139, 0, 0));
		AKS.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		AKS.setBounds(620, 320, 250, 30);
		qframe.getContentPane().add(AKS);
		
		JLabel PHN = new JLabel("Contact: 9937401932");
		PHN.setForeground(new Color(139, 0, 0));
		PHN.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		PHN.setBounds(620, 370, 237, 24);
		qframe.getContentPane().add(PHN);
		
		JLabel MAIL = new JLabel("Mail: kumarsahuatish280301@gmail.com");
		MAIL.setForeground(new Color(139, 0, 0));
		MAIL.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		MAIL.setBounds(620, 420, 402, 24);
		qframe.getContentPane().add(MAIL);
		
		JLabel CRTD = new JLabel("Date: 27 - January - 2023");
		CRTD.setForeground(new Color(139, 0, 0));
		CRTD.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		CRTD.setBounds(620, 470, 255, 24);
		qframe.getContentPane().add(CRTD);
	}
}