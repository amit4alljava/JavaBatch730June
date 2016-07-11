import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogoQuiz extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
					LogoQuiz frame = new LogoQuiz();
					frame.setVisible(true);
		
	}
	private void askForAnswer(String correctAnswer, String imageName,JButton b1){
		AnsFrame ans = new AnsFrame(correctAnswer,imageName, b1);
		ans.setVisible(true);
	}
	/**
	 * Create the frame.
	 */
	public LogoQuiz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			askForAnswer("PizzaHut","pizzahut.jpg",b1);
			}
		});
		b1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		b1.setIcon(new ImageIcon(LogoQuiz.class.getResource("pizzahut.jpg")));
		b1.setBounds(25, 53, 147, 131);
		contentPane.add(b1);
		
		JButton b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				askForAnswer("Mc Donald","mcd.jpg",b2);
			}
		});
		b2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		b2.setBounds(234, 53, 147, 131);
		b2.setIcon(new ImageIcon(LogoQuiz.class.getResource("mcd.jpg")));
		contentPane.add(b2);
	}
}
